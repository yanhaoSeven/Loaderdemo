package com.example.loaderdata;

import java.util.List;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements LoaderManager.LoaderCallbacks<List<String>> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// getSupportLoaderManager
		getLoaderManager().initLoader(0, null, this);
	}

	@Override
	public Loader<List<String>> onCreateLoader(int id, Bundle args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onLoadFinished(Loader<List<String>> loader, List<String> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoaderReset(Loader<List<String>> loader) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Loader<String> onCreateLoader(int id, Bundle args) {
//		// TODO Auto-generated method stub
//		return new LoaderHttpData(this);
//	}
//
//	@Override
//	public void onLoadFinished(Loader<String> loader, String data) {
//		// TODO Auto-generated method stub
//		Log.e("TAG", "===>" + data);
//	}
//
//	@Override
//	public void onLoaderReset(Loader<String> loader) {
//		// TODO Auto-generated method stub
//
//	}

}
