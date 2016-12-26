package com.example.x_man.donghao_month10;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private WebView mWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图
        initview();
    }

    private void initview() {
        mWeb= (WebView) findViewById(R.id.main_web);
        mWeb.loadUrl("Http://www.baidu.com");
        mWeb.getSettings().setJavaScriptEnabled(true);

        mWeb.setWebViewClient(new WebViewClient());

    }
}
