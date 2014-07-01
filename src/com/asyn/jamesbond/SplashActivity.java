package com.asyn.jamesbond;

import com.asyn.jamesbond.media.RawPlayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

	public static final int SPLASH_LENGTH = 1 * 1000;
	public static final int INTRO_MEDIA = R.raw.splash_intro_loud;

	protected RawPlayer mediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);

		mediaPlayer = new RawPlayer(this, INTRO_MEDIA);
		mediaPlayer.startPlayableMedia();

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				startActivity(new Intent(SplashActivity.this,
						MainActivity.class));
				finish();
			}
		}, mediaPlayer.getFileDuration());

	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		mediaPlayer.destroy();
	}
}
