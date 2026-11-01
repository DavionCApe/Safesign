package com.davion.safesign

import android.app.Activity
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

class MainActivity : Activity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(this)

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

        webView.webViewClient = WebViewClient()

        webView.addJavascriptInterface(
            AndroidInterface(),
            "AndroidInterface"
        )

        setContentView(webView)

        webView.loadUrl("file:///android_asset/index.html")
    }

    inner class AndroidInterface {

        @JavascriptInterface
        fun sendEmergencyAlert() {
            runOnUiThread {
                Toast.makeText(
                    this@MainActivity,
                    "SOS demonstration only. No alert was sent.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    @Deprecated("Deprecated in Android")
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
