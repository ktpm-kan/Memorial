package com.example.memorial_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1(View v) {
        // 画面指定
        Intent intent = new Intent(this,RouteChoiceActivity.class);
        // 画面を開く
        startActivity(intent);
    }

    public void onButton2(View v) {
        // 画面指定
        Intent intent = new Intent(this,SpotActivity.class);
        // 画面を開く
        startActivity(intent);
    }

    public void onButton3(View v) {
        // 画面指定
        Intent intent = new Intent(this,EscapeActivity.class);
        // 画面を開く
        startActivity(intent);
    }

    public void onClose(View v) {
        finish();
    }

}
