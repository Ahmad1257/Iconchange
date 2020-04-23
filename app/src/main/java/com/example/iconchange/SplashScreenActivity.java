package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity
{
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setMax(100);
        progressBar.setProgress(0);

        Thread td=new Thread()
        {

            @Override
            public void run()
            {
                try
                {

                    for(int i=0; i<100; i++)
                    {
                        progressBar.setProgress(i);
                        sleep(50);
                    }

                }
                catch (Exception excep)
                {
                    excep.printStackTrace();
                }
                finally
                {
                    Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }

        };td.start();
    }
}
