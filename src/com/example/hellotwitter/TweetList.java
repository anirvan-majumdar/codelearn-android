package com.example.hellotwitter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hellotwitter.model.Tweet;

/**
 *	This class displays the list of tweets through ListView.
 *
 * @author anirvan
 */
public class TweetList extends ListActivity {
	
	private List<Tweet> _tweets;
	
	private static final String TWEETS_CACHE_FILE = "cache_tweet.ser";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tweets);
		
		// retrieve the tweets
		_tweets = getTweets();
		
		ListAdapter adapter = new TweetAdapter(this, _tweets);
		setListAdapter(adapter);
	}
	
	/**
	 * Retrieves the list of tweets that may have been cached
	 * before. This method will also access the source for new
	 * tweets data to update the caches list.
	 * 
	 * @return
	 */
	private List<Tweet> getTweets() {
		
		File cachedFile = getFileStreamPath(TWEETS_CACHE_FILE);
		List<Tweet> tweets = null;
		
		if ( cachedFile.exists() ) {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				fis = openFileInput(TWEETS_CACHE_FILE);
				ois = new ObjectInputStream(fis);
				tweets = ( List<Tweet> ) ois.readObject();
				Log.i("tweeter", "Tweets retrieved: " +tweets.size());
			} catch (Exception e) {
				Log.e("tweeter", "Failed to read from serialised file.", e);
			}
			finally {
				if ( fis != null ) {
					try {
						fis.close();
					} catch (Exception ignored) {}
				}
				if ( ois != null ) {
					try {
						ois.close();
					} catch (Exception ignored) {}
				}
			}
		} else {
			Log.i("tweeter", "No cached tweets available.");
			// generate tweets
			tweets = new ArrayList<Tweet>();
			for ( int i = 0; i < 20; i++ ) {
				Tweet tweet = new Tweet();
				tweet.setId("" + i);
				tweet.setHeader("A nice header for Tweet # " +i);
				tweet.setBody("Some random body text for the tweet # " +i);
				tweet.setDate(new Date());
				tweets.add(tweet);
			}
			
			// cache new tweets
			new AsyncCacheWriter().execute(tweets);
		}
		
		return tweets;
	}
	
	/**
	 * This asynchronous task class writes out new tweets data into a  
	 * serialised cache file, which can be later used for retrieving the
	 * data quickly.
	 */
	private class AsyncCacheWriter extends AsyncTask<List, Void, Void> {
		
		@Override
		protected Void doInBackground(List... params) {
			FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            List tweets = params[0];
            
            try {
            	fos = openFileOutput(TWEETS_CACHE_FILE, MODE_PRIVATE);
            	oos = new ObjectOutputStream(fos);
            	oos.writeObject(tweets);
            } catch ( Exception e ) {
            	Log.e("tweeter", "Failed to write to serialised file.", e);
            } finally {
				if ( fos != null ) {
					try {
						fos.close();
					} catch (Exception ignored) {}
				}
				if ( oos != null ) {
					try {
						oos.close();
					} catch (Exception ignored) {}
				}
			}
			
			return null;
		}
	}
	
	private class TweetAdapter extends ArrayAdapter<Tweet> {
		
		private LayoutInflater _inflater;
		
		/**
		 * Constructor for setting the List of items to the adapter
		 * backing the ListView.
		 * 
		 * @param activity
		 * @param items
		 * @param flag
		 */
		public TweetAdapter(Activity activity, List<Tweet> tweets) {
			super(activity, R.layout.row_tweets, tweets);
			
			_inflater = activity.getWindow().getLayoutInflater();
		}
		
		/**
		 * This method is invoked for every single row that is to be 
		 * rendered.
		 */
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View row = convertView;
	        
	        if ( row == null )
	        {
	            row = _inflater.inflate(R.layout.row_tweets, parent, false);
	        }
	        
	        TextView titleView = ( TextView ) row.findViewById(R.id.tweet_title);
	        TextView bodyView = ( TextView ) row.findViewById(R.id.tweet_body);
	        TextView dateView = ( TextView ) row.findViewById(R.id.tweet_date);
	        Tweet tweet = _tweets.get(position);
	        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy    KK:mm a");
	        
	        titleView.setText(tweet.getHeader());
	        bodyView.setText(tweet.getBody());
	        dateView.setText(sdf.format(new Date()));
	        
	        return row;
		}
	}

	/**
	 * Handles the click on any of the list items
	 */
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = new Intent(this, TweetActivity.class);
		Tweet tweet = _tweets.get(position);
		
		intent.putExtra("tweet_data", tweet);
		startActivity(intent);
	}

}
