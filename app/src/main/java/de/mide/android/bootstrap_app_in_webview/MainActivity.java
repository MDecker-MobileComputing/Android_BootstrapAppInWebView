package de.mide.android.bootstrap_app_in_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


/**
 * Diese Activity erzeugt programmatisch ein WebView-Element und zeigt darin
 * eine Bootstrap-Webseite an, die im Verzeichnis "app/src/main/assets" liegt.
 * Es wird hierdurch eine hybride App realisiert.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {

        super.onCreate( savedInstanceState );

        final WebView webView = new WebView( this );
        setContentView(webView);

        final WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled( true );

        webView.loadUrl( "file:///android_asset/index.html" );
    }

}