package com.zj.zguideview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zj.library.ParallaxViewPager;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ParallaxViewPager mParallaxViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
