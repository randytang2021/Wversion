package com.wyze.wversion;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wyze.wlibrary.Info;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView infoTv = findViewById(R.id.infoTv);
        infoTv.setText(getBuildInfo());
        infoTv.append("\n");
        infoTv.append(Info.TEXT);
    }

    private String getBuildInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Wyze app build info:").append("\n");
        sb.append(BuildConfig.CLOUD_NAME).append("\n");
        sb.append(BuildConfig.APPLICATION_ID).append("\n");
        sb.append(BuildConfig.BUILD_TYPE).append("\n");
        sb.append(BuildConfig.VERSION_NAME).append("\n");
        sb.append(BuildConfig.VERSION_CODE).append("\n");
        return sb.toString();
    }
}