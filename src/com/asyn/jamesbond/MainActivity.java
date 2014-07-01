package com.asyn.jamesbond;

import com.asyn.jamesbond.statics.Keys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	protected Button gunbarellButton;
	protected Button quotesButton;
	protected Button postersButton;
	protected Button bondsButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		gunbarellButton = (Button) findViewById(R.id.gunbarrelButton);
		quotesButton = (Button) findViewById(R.id.quotesButton);
		postersButton = (Button) findViewById(R.id.postersButton);
		bondsButton = (Button) findViewById(R.id.bondsButton);

		gunbarellButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				setSelectMovieIntent(Keys.GUNBARELLS);
			}
		});

		quotesButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				setSelectMovieIntent(Keys.QUOTES);
			}
		});

		postersButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				setSelectMovieIntent(Keys.POSTERS);
			}
		});
		
		bondsButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				setSelectActorIntent();
			}
		});
	}

	private void setSelectMovieIntent(int type) {
		Intent intent = new Intent(MainActivity.this, SelectMovieActivity.class);
		intent.putExtra(Keys.TYPE, type);
		startActivity(intent);
	}
	
	private void setSelectActorIntent() {
		Intent intent = new Intent(MainActivity.this, BondActivity.class);
		intent.putExtra(Keys.TYPE, Keys.BONDS);
		startActivity(intent);
	}
}
