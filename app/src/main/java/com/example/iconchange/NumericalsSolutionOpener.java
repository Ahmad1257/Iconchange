package com.example.iconchange;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class NumericalsSolutionOpener extends AppCompatActivity
{

    private WebView webView;
    private int position;
    private String fileName;
    private Button btn_download;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numericals_solution_opener);

        if (getIntent().hasExtra("pos"))
            position = getIntent().getIntExtra("pos", 0);

        webView = findViewById(R.id.webview);
        btn_download = findViewById(R.id.btn_download);
        btn_download.setOnClickListener(new View.OnClickListener()
        {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                createWebPrintJob(webView);

            }
        });
        getFileName();
        webViewSetting();

    }

    private void getFileName() {
        switch (position) {
            case 1:
                fileName = "file1";
                break;
            case 2:
                fileName = "file2";
                break;
            case 3:
                fileName = "file3";
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
                fileName = "file9";
                break;
            default:
                break;
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void webViewSetting() {

        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setBuiltInZoomControls(false);
        webView.loadUrl("file:///android_asset/" + fileName + ".html ");
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void createWebPrintJob(WebView webView) {

        // Get a PrintManager instance
        PrintManager printManager = (PrintManager) this.getSystemService(Context.PRINT_SERVICE);
//        PrintManager printManager = (PrintManager) this
//                .getSystemService(Context.PRINT_SERVICE);

        String jobName = getString(R.string.app_name) + " Document";

        // Get a print adapter instance
        PrintDocumentAdapter printAdapter = webView.createPrintDocumentAdapter(jobName);

        // Create a print job with name and adapter instance
        PrintJob printJob=
        printManager.print(jobName, printAdapter,
                new PrintAttributes.Builder().build());

        // Save the job object for later status checking
//         printJobs.add(printJob);
    }

}