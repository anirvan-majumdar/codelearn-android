package com.example.hellotwitter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Handles the interaction for displaying the details about
 * a single tweet.
 * 
 * @author anirvan
 */
public class TweetActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.d("tweeter", "Show tweet!");
		setContentView(R.layout.activity_tweet);
	}
	
}
