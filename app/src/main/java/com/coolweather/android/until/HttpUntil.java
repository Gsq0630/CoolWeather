package com.coolweather.android.until;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUntil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
