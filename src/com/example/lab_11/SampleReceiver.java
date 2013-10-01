package com.example.lab_11;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SampleReceiver extends BroadcastReceiver {
		@Override
	   public void onReceive(Context context, Intent intent) {
		      Toast.makeText(context, "Broadcasted Intent Received.", Toast.LENGTH_LONG).show();
		   }
}
