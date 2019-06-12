package com.example.atividade22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class navegador extends AppCompatActivity {
    private Button botaoURL;
    private EditText textoDaURL;
    private WebView navegadorDaWeb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

        botaoURL = (Button)findViewById(R.id.btEntrar);
        textoDaURL = (EditText) findViewById(R.id.colocarURL);
        navegadorDaWeb = (WebView) findViewById(R.id.navegadorWeb);

        navegadorDaWeb.getSettings().setJavaScriptEnabled(true);
        navegadorDaWeb.setWebViewClient(new WebViewClient());

        botaoURL.setKeyListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                navegadorDaWeb.loadUrl(textoDaURL.getText().toString());

            }
            });


    }
}
