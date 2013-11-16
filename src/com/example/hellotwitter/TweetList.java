package com.example.hellotwitter;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 *	This class displays the list of tweets through ListView.
 */
public class TweetList extends ListActivity {
	
	private List<String> _tweetList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tweets);
		
		/*
		 * populating dummy data for the list
		 */
		_tweetList = new ArrayList<String>();
		for ( int i = 0; i < 10; i++ ) {
			_tweetList.add("This is row: " +i);
		}
		
		ListAdapter adapter = new TweetAdapter(this, _tweetList);
		setListAdapter(adapter);
	}
	
	private class TweetAdapter extends ArrayAdapter<String> {
		
		private LayoutInflater _inflater;
		
		/**
		 * Constructor for setting the List of items to the adapter
		 * backing the ListView.
		 * 
		 * @param activity
		 * @param items
		 * @param flag
		 */
		public TweetAdapter(Activity activity, List<String> items) {
			super(activity, R.layout.row_tweets, items);
			
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
	        
	        TextView tv = (TextView) row.findViewById(R.id.row_title);
	        tv.setText(_tweetList.get(position));
	        
	        return row;
		}
		
	}

}
