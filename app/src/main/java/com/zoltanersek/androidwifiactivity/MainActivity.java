package com.zoltanersek.androidwifiactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends WifiBaseActivity  {
    protected String wifiSSID;
    protected String wifiPass;

    public void setWifiSSID(String wifiSSID) {
        this.wifiSSID = wifiSSID;
    }

    public void setWifiPass(String wifiPass) {
        this.wifiPass = wifiPass;
    }


    @Override
    protected int getSecondsTimeout() {
        return 10000;
    }

    @Override
    protected String getWifiSSID() {
        return wifiSSID;

    }

    @Override
    protected String getWifiPass() {
        return wifiPass;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view){
        EditText wifiSSIDName = (EditText) findViewById(R.id.wifiSSIDName);
        EditText wifiSSIDPass = (EditText) findViewById(R.id.wifiSSIDPass);
        wifiSSID = wifiSSIDName.getText().toString();
        wifiPass = wifiSSIDPass.getText().toString();
        handleWIFI();
    }


}
