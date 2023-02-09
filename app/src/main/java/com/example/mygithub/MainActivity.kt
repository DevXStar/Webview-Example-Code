package com.example.mygithub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webviewvar = findViewById<WebView>(R.id.Webview)
        webViewSetUp(webviewvar)
    }
        @RequiresApi(Build.VERSION_CODES.O)
        private fun webViewSetUp(webview: WebView) {
            webview.webViewClient= WebViewClient()

            webview.apply {
                settings.javaScriptEnabled=true
                settings.safeBrowsingEnabled=true
                loadUrl("https://github.com/INFI-NIXEL")
            }
    }
}
