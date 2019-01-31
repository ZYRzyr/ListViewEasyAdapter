package com.zyr.listvieweasyadapter.simple;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        ListView listView = findViewById(R.id.list_view);
        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        list.add("5555");
        list.add("6666");
        list.add("7777");
        list.add("8888");
        list.add("9999");
        listView.setAdapter(new SimpleAdapter(list));
    }
}
