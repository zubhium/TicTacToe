package com.example.android.tictactoe;

import com.zubhium.ZubhiumSDK;

import android.app.Application;

public class GameApplication extends Application{
	private ZubhiumSDK zubhiumSDK = null;
	private final String zubhiumAppKey = "";
	
	@Override
	public void onCreate() {
		super.onCreate();
		// Initialize ZubhiumSDK in Global Context
		zubhiumSDK = ZubhiumSDK.getZubhiumSDKInstance(this, zubhiumAppKey);
	}

	public ZubhiumSDK getZubhiumSDK() {
		return zubhiumSDK;
	}
}
