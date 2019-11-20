package com.example.memorial_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RouteChoiceSpotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_choice_spot);
    }

    public void onButton1(View v) {
        // 画面指定
        Intent intent = new Intent(this,RouteMapActivity.class);
        // 画面を開く
        startActivity(intent);
    }
}
