package com.example.hellotwitter;

import java.text.SimpleDateFormat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hellotwitter.model.Tweet;

/**
 * Handles the interaction for displaying the details about
 * a single tweet.
 * 
 * @author anirvan
 */
public class TweetActivity extends Activity {
	
	private TextView _titleView;
	private TextView _bodyView;
	private TextView _dateView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tweet);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy    KK:mm a");
		
		_titleView = ( TextView ) findViewById(R.id.tweet_title);
		_bodyView = ( TextView ) findViewById(R.id.tweet_body);
		_dateView = ( TextView ) findViewById(R.id.tweet_date);
		
		Tweet tweet = ( Tweet )  getIntent().getSerializableExtra("tweet_data");
		
		_titleView.setText(tweet.getHeader());
		_bodyView.setText(tweet.getBody());
		_dateView.setText(sdf.format(tweet.getDate()));
	}
	
}
