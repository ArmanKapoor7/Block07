package com.example.block07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final NumberPicker options = (NumberPicker) findViewById(R.id.numberpicker);
        final WebView webview =(WebView) findViewById(R.id.webview);
        String[] optionstrings ={
                "Android",
                "Checklist text-Input field",
                "Coursera",
                "Supelec"
        };
        options.setDisplayedValues(optionstrings);
        options.setMinValue(0);
        options.setMaxValue(optionstrings.length-1);
        Button ok = (Button) findViewById(R.id.button_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int choice = options.getValue();
                switch (choice) {
                    case 0:
                        webview.setWebViewClient(new WebViewClient());
                        webview.loadUrl("file:///android_asset/android.html");
                        break;
                    case 1:
                        webview.setWebViewClient(new WebViewClient());
                        webview.loadUrl("file:///android_asset/checklist.html");
                        break;
                    case 2:
                        webview.setWebViewClient(new WebViewClient());
                        webview.loadUrl("http://www.coursera.org");
                        break;
                    case 3:
                        webview.setWebViewClient(new WebViewClient());
                        webview.loadUrl("file:///android_asset/supelec.html");
                        break;
                }
            }
        });
    }
}
