package com.asyn.jamesbond;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import com.asyn.jamesbond.data.Data;
import com.asyn.jamesbond.media.RawPlayer;

public class SplashActivity extends Activity {

	public static final int SPLASH_LENGTH = 1 * 1000;
	public static final int INTRO_MEDIA = R.raw.splash_intro;

	protected ImageView animationLayer;
	protected RawPlayer mediaPlayer;
	private AnimationDrawable splashAnimation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);

		animationLayer = (ImageView) findViewById(R.id.animationImageView);
		animationLayer.setBackgroundResource(R.drawable.splash_animation);
		splashAnimation = (AnimationDrawable) animationLayer.getBackground();
		mediaPlayer = new RawPlayer(this, INTRO_MEDIA);
	}

	@Override
	protected void onStart() {
		super.onStart();

		mediaPlayer.startPlayableMedia();
		splashAnimation.start();

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
