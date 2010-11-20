package de.syncdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ProfileTypeActivity extends Activity {
	static final String TAG = "ProfileTypeActivity";
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_type_activity);

    }

	public void onButtonFtpProfileClick(View view) {
        Log.i(TAG, "onButtonSyncItClick()");
        
		Intent intent = new Intent(this, ProfileConfigureFtpActivity.class);
		startActivity(intent);  
	}

}