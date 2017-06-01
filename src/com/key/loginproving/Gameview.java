package com.key.loginproving;

import com.glp.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Gameview extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.gameview);
	}
}
