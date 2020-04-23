package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MiniExerciseOpener extends AppCompatActivity
{
    private WebView webView;
    private int position;
    private String fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_exercise_opener);

        if (getIntent().hasExtra("pos"))
            position = getIntent().getIntExtra("pos", 0);

        webView = findViewById(R.id.webview);
        getFileName();
        webViewSetting();
    }
    private void getFileName()
    {
        switch (position)
        {
            case 1:
                fileName = "longques1";
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }
    }
    @SuppressLint("SetJavaScriptEnabled")
    private void webViewSetting()
    {

        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setBuiltInZoomControls(false);
        webView.loadUrl("file:///android_asset/" + fileName + ".html ");
    }
}
