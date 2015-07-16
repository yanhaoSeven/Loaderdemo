package com.example.loaderdata;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import android.util.Log;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class OkHttpUtil {
	
	private LoadData data;
	private static final OkHttpClient mOkHttpClient = new OkHttpClient();
	static {
		mOkHttpClient.setConnectTimeout(300, TimeUnit.SECONDS);
	}

	public static Response execute(Request request) throws IOException {
		return mOkHttpClient.newCall(request).execute();
	}

	/**
	 * �?��异步线程访问网络
	 * 
	 * @param request
	 * @param responseCallback
	 */
	public static void enqueue(Request request, Callback responseCallback,LoadData data) {
		mOkHttpClient.newCall(request).enqueue(responseCallback);
	}

	public interface LoadData {
		void setData(String str);
	}

}
