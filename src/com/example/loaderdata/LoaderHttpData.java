package com.example.loaderdata;

import java.util.ArrayList;
import java.util.List;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class LoaderHttpData extends AsyncTaskLoader<List<String>> {

	public LoaderHttpData(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> loadInBackground() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		String url = "http://v.juhe.cn/weixin/query?key=577d1ec268f90f88201372e75cf71e5f";
		String result = "";
		Request request = new Request.Builder().url(url).build();
		Response response = null;
		try {
			response = OkHttpUtil.execute(request);
			if (response.code() == 200) {
				result = response.body().string();// .getBytes("UTF-8"));
			} else {
				result = null;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Log.e("TAG", "loader拿到的数据是：" + result);
		//return result;
		return list;
	}

	@Override
	protected void onStartLoading() {
		// TODO Auto-generated method stub
		super.onStartLoading();
		forceLoad();
	}

	
//	@Override
//	public String loadInBackground() {
//		// TODO Auto-generated method stub
//		String url = "http://v.juhe.cn/weixin/query?key=577d1ec268f90f88201372e75cf71e5f";
//		String result = "";
//		Request request = new Request.Builder().url(url).build();
//		Response response = null;
//		try {
//			response = OkHttpUtil.execute(request);
//			if (response.code() == 200) {
//				result = response.body().string();// .getBytes("UTF-8"));
//			} else {
//				result = null;
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		Log.e("TAG", "loader拿到的数据是：" + result);
//		return result;
//	}
}
