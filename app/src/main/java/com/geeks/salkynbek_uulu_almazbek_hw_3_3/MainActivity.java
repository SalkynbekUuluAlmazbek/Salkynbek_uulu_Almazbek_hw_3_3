package com.geeks.salkynbek_uulu_almazbek_hw_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.geeks.salkynbek_uulu_almazbek_hw_3_3.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListNames = new ArrayList<>();

    ContactAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newElements();

        addName();

        recyclerView.setAdapter(adapter);

    }
    public void addName(){
        arrayListNames.add("Madina");
        arrayListNames.add("Yryskeldi");
        arrayListNames.add("Chyngyz");
        arrayListNames.add("Radmir");
        arrayListNames.add("Kamal");
        arrayListNames.add("Iskender");
        arrayListNames.add("Almanbet");
        arrayListNames.add("Almazbek");
        arrayListNames.add("Almazbek");
        arrayListNames.add("Almazbek");
        arrayListNames.add("Almazbek");
        arrayListNames.add("Almazbek");
        arrayListNames.add("Almazbek");
        arrayListNames.add("Almazbek");
        arrayListNames.add("Almazbek");
    }

    public void newElements(){
        adapter = new ContactAdapter(arrayListNames);
        recyclerView = findViewById(R.id.recyclerView);
    }
}