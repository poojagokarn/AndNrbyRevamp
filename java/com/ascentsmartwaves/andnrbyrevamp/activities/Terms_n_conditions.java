package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ascentsmartwaves.andnrbyrevamp.R;
import com.ascentsmartwaves.andnrbyrevamp.utils.Constants;
//import com.example.ppssg.andnrby.R;
//
/**
 * Created by ADMIN on 17-02-2015.
 */
public class Terms_n_conditions extends Activity {
    private WebView browser;
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(Constants.LOG_TAG, Constants.TermsAndConditionActivity);
        setContentView(R.layout.activity_terms_n_conditions);

        // This function will find the ids
        findViews();

        // This function will set the data for the views
        setViews();

        open(v);
    }

    private void findViews(){

        browser = (WebView)findViewById(R.id.webView1);
    }

    private void setViews(){

        browser.setWebViewClient(new MyBrowser());
    }



    public void open(View view){
        String url = Constants.termsAndConditionsURL;
        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        browser.loadUrl(url);

    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

}