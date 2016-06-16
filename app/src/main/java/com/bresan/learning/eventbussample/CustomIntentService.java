package com.bresan.learning.eventbussample;

import android.app.Activity;
import android.content.Intent;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by rodrigobresan on 6/15/16.
 */
public class CustomIntentService extends android.app.IntentService {

    public CustomIntentService() {
        super("custom-intent");
    }

    public CustomIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        EventBus.getDefault().post(new IntentServiceResult(Activity.RESULT_OK, "this is one!"));
        EventBus.getDefault().post(new AnotherResult(Activity.RESULT_OK, "this is another!"));
    }
}
