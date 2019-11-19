package com.example.memorial_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.app.Activity; // タイトルバー非表示に使用

public class RouteChoiceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_choice);
    }

    public void onClose(View v) {
        finish();
    }
}
