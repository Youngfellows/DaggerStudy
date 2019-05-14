package com.speex.dagger2study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.speex.dagger2study.salad.Salad2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Dager2的基本使用
     *
     * @param view
     */
    public void dagerUse1(View view) {
        Salad2 salad2 = new Salad2();
    }
}
