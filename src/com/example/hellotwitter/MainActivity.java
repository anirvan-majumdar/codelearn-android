package com.example.hellotwitter;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
	
	private EditText _usernameFld;
	private EditText _pwdFld;
	
	private String _username;
	private String _password;
	
	private SharedPreferences _prefs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		_usernameFld = ( EditText ) findViewById(R.id.fld_username);
		_pwdFld = ( EditText ) findViewById(R.id.fld_pwd);
		_loginBtn = ( Button ) findViewById(R.id.btn_login);
		
		_prefs = getSharedPreferences("tweeter", MODE_PRIVATE);
		_username = _prefs.getString("username", null);
		if ( _username != null ) {
			showTweetsScreen();
		}
		
		_loginBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				_username = _usernameFld.getText().toString();
				_password = _pwdFld.getText().toString();
				Log.d("Tweter", "Got username: " +_username);
				
				SharedPreferences prefs = getSharedPreferences("tweeter", MODE_PRIVATE);
				Editor edit = prefs.edit();
				edit.putString("username", _username);
				edit.commit();
			}
			
		});
	}
	
	private void showTweetsScreen() {
		Intent intent = new Intent(MainActivity.this, TweetList.class);
		startActivity(intent);
	}

}
