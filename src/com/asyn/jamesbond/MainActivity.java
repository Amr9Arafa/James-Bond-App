package com.asyn.jamesbond;

import com.asyn.jamesbond.statics.Keys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	protected Button quotes;
	protected Button gunbarell;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		quotes = (Button) findViewById(R.id.quotes);
		gunbarell = (Button) findViewById(R.id.gunbarrel);
		
		quotes.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				setActivityIntent(Keys.QUOTES);
			}
		});
		
		gunbarell.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				setActivityIntent(Keys.GUNBARELLS);
			}
		});
		
	}

	private void setActivityIntent(int type) {
		Intent intent = new Intent(MainActivity.this, SelectMovieActivity.class);
		intent.putExtra(Keys.TYPE, type);
		startActivity(intent);
	}
}
