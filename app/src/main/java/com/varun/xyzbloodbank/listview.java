package com.varun.xyzbloodbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listview extends AppCompatActivity {

    ListView lvMonths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        lvMonths = findViewById(R.id.lvMonth);

        ArrayList<String> names = new ArrayList<>();
        names.add("Total Donation");
        names.add("Under Testing");
        names.add("A+");
        names.add("B+");
        names.add("O+");
        names.add("O-");
        names.add("AB+");
        names.add("AB-");
        names.add("A-");
        names.add("B-");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.listviewblank,names);

        lvMonths.setAdapter(arrayAdapter);
        lvMonths.setOnItemClickListener(this::onItemClick);

    }

    public void onItemClick(@NonNull AdapterView<?> parent, View view, int i, long l){
        String names = parent.getItemAtPosition(i).toString();
        Toast.makeText(getApplicationContext(),"Clicked "+names,Toast.LENGTH_SHORT).show();
    }

}