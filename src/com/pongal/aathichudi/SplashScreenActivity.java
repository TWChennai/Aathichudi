package com.pongal.aathichudi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		Thread logoThread = new Thread() {
			long currTime = 0;
			long waitTime = 1000L;

			@Override
			public void run() {
				try {
					super.run();
					while (currTime < waitTime) {
						sleep(100);
						currTime += 100;
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					startActivity(new Intent(SplashScreenActivity.this, Aathichudi.class));
					finish();
				}
			}
		};
		logoThread.start();
	}
}
