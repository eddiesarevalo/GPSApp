package com.example.gpsapp;

import com.google.android.gms.common.GooglePlayServicesClient;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity implements GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener{

	TextView latView;
	TextView longView;
	TextView provView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		latView = (TextView)findViewById(R.id.lat_view);
		longView = (TextView)findViewById(R.id.long_view);
		provView = (TextView)findViewById(R.id.prov_view);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
