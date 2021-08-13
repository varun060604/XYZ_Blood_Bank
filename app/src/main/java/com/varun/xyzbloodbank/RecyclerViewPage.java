package com.varun.xyzbloodbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewPage extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[],s2[];
    int images[] = {R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo,
                R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo};
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recycler_view_page);

            recyclerView = findViewById(R.id.recyclerView);

            s1 = getResources().getStringArray(R.array.Contact_name);
            s2 = getResources().getStringArray(R.array.Numbers);

            MyAdapter myAdapter = new MyAdapter(this, s1 ,s2 , images);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }