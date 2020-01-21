package com.example.memorial_app;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MemoryFloatPostConfirmationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_float_post_confirmation);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MemoryFloatPostActivity.NICK_NAME);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.NickNameData);
        textView.setText(message);

    }


}
