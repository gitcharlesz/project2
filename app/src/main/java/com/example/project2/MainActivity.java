package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        List<content> contentList = new ArrayList<>();
        for (int i = 1; i <= 100; i++)
        {
            content mc = new content("item " + i);
            contentList.add(mc);
        }

        LinearLayoutManager lom = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lom);
        rvadapter rva = new rvadapter(contentList);

        recyclerView.setAdapter(rva);
    }
}

























