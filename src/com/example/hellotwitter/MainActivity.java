package com.example.hellotwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * The main activity class for this app. This is where the control
 * of the app is first handed out by the Android framework.
 * This activity class is responsible for the layout defined in the
 * <code>activity_main.xml</code> file.
 * 
 * @author anirvan
 */
public class MainActivity extends Activity {
	
	private Button _loginBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		_loginBtn = ( Button ) findViewById(R.id.btn_login);
		
		_loginBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, TweetList.class);
				startActivity(intent);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
