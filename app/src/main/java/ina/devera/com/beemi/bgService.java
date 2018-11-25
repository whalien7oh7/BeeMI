package ina.devera.com.beemi;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;


public class bgService extends IntentService{
    public bgService() {
        super("bgService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Android System:","bgService() running....");
    }
}
