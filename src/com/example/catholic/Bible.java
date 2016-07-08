package com.example.catholic;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.example.catholic.R;

public class Bible extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bible);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bible, menu);
		return true;
	}

}
