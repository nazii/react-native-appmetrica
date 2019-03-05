package com.doochik.RNAppMetrica;

import com.yandex.metrica.push.YandexMetricaPush;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SilentPushReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Extract push message payload from your push message.
        String payload = intent.getStringExtra(YandexMetricaPush.EXTRA_PAYLOAD);

    }
}