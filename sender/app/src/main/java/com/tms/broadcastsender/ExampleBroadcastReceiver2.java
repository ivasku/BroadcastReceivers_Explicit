package com.tms.broadcastsender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExampleBroadcastReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Sender triggered", Toast.LENGTH_LONG).show();

    }
}
