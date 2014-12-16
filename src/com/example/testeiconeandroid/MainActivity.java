package com.example.testeiconeandroid;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void mudarIcone(View view) {
		Button btn = (Button)view;
		desativaAll();
		
		if (btn.getText().toString().equalsIgnoreCase("Icone 1-Original")) {
			getPackageManager().setComponentEnabledSetting(
					new ComponentName("com.example.testeiconeandroid", "com.example.testeiconeandroid.MainActivity-One"),
					PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
					PackageManager.DONT_KILL_APP);
		}else if (btn.getText().toString().equalsIgnoreCase("Icone 2")) {
			getPackageManager().setComponentEnabledSetting(
					new ComponentName("com.example.testeiconeandroid", "com.example.testeiconeandroid.MainActivity-Two"),
					PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
					PackageManager.DONT_KILL_APP);
		}else if (btn.getText().toString().equalsIgnoreCase("Icone 2")) {
			getPackageManager().setComponentEnabledSetting(
					new ComponentName("com.example.testeiconeandroid", "com.example.testeiconeandroid.MainActivity-Three"),
					PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
					PackageManager.DONT_KILL_APP);
		}
		
	}
	
	public void desativaAll() {
		getPackageManager().setComponentEnabledSetting(
				new ComponentName("com.example.testeiconeandroid", "com.example.testeiconeandroid.MainActivity-One"),
				PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
				PackageManager.DONT_KILL_APP);
		getPackageManager().setComponentEnabledSetting(
				new ComponentName("com.example.testeiconeandroid", "com.example.testeiconeandroid.MainActivity-Two"),
				PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
				PackageManager.DONT_KILL_APP);
		getPackageManager().setComponentEnabledSetting(
				new ComponentName("com.example.testeiconeandroid", "com.example.testeiconeandroid.MainActivity-Three"),
				PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
				PackageManager.DONT_KILL_APP);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
