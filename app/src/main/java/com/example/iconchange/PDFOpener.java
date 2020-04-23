package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity
{
    private PDFView pdf;
    private String fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        pdf = findViewById(R.id.showPdf);

        if (getIntent().hasExtra("chap_pos"))
            getPdfName(getIntent().getIntExtra("chap_pos", 1));


        displayFromAsset(fileName);
    }
    private void displayFromAsset(String fileName)
    {

        pdf.fromAsset(fileName)
                .enableSwipe(true)
                .defaultPage(0)
                .swipeHorizontal(false)
                .enableAnnotationRendering(true)
                .load();
    }
    private void getPdfName(int pos) {
        switch (pos) {
            case 1:
                fileName = "Chapter_no_1.pdf";
                break;
            case 2:
                fileName = "Chapter_no_2.pdf";
                break;
            case 3:
                fileName = "Chapter_no_3.pdf";
                break;
            case 4:
                fileName = "Chapter_no_4.pdf";
                break;
            case 5:
                fileName = "Chapter_no_5.pdf";
                break;
            case 6:
                fileName = "Chapter_no_6.pdf";
                break;
            case 7:
                fileName = "Chapter_no_7.pdf";
                break;
            case 8:
                fileName = "Chapter_no_8.pdf";
                break;
            case 9:
                fileName = "Chapter_no_9.pdf";
                break;
        }

//kaha lgana ha. pdf ya to ap n btana h ya pdf opener activity h m to is m hi lgany ki koshish ki thi
    }
}
