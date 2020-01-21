package com.example.memorial_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MemoryFloatPostActivity extends AppCompatActivity {

    public static final String NICK_NAME = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_float_post);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MemoryFloatPostConfirmationActivity.class);
        EditText editText = (EditText) findViewById(R.id.NickName);
        String message = editText.getText().toString(); // エディットテキストのテキストを取得
        intent.putExtra(NICK_NAME, message);            // EditText の値をインテントに追加します
        startActivity(intent);                          //インテントで指定されたアクティビティ開始
    }
}
