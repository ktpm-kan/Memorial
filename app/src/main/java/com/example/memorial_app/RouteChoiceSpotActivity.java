package com.example.memorial_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;


public class RouteChoiceSpotActivity extends AppCompatActivity {


    public void onButton1(View v) {
        // 画面指定
        Intent intent = new Intent(this,RouteMapActivity.class);
        // 画面を開く
        startActivity(intent);
    }

    // *************************************************
    // RecyclerView
    // *************************************************
    private static final String[] names = {
            "test00", "test01", "test02",
            "test03", "test04", "test05",
            "test06", "test07", "test08", "test09"
    };

    // それぞれの画像ファイルをdarawableに入れます
    // ArrayListにコピーするためintからInteger型にしました
    private static final Integer[] photos = {
            R.drawable.img00, R.drawable.img01,
            R.drawable.img02, R.drawable.img03,
            R.drawable.img04, R.drawable.img05,
            R.drawable.img06, R.drawable.img07,
            R.drawable.img08, R.drawable.img09
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_choice_spot);
        // activity_route_choice_spot の id と 合ってるか確認

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager rLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(rLayoutManager);


        // 配列をArrayListにコピー
        List<String> itemNames = new ArrayList<String>(Arrays.asList(names));
        List<Integer> itemImages = new ArrayList<Integer>(Arrays.asList(photos));

        List<String> itemEmails = new ArrayList<String>();
        for(int i=0; i<itemNames.size() ;i++ ){
            String str = String.format(Locale.ENGLISH, "%s@gmail.com", itemNames.get(i));
            itemEmails.add(str);
        }

        // specify an adapter (see also next example)
        RecyclerView.Adapter rAdapter = new MyAdapter(itemImages, itemNames, itemEmails);
        recyclerView.setAdapter(rAdapter);

    }
}
