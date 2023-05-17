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
        arrayListNames.add("Madina Madinovna");
        arrayListNames.add("Yryskeldi Yryskeldiev");
        arrayListNames.add("Chyngyz Chyngyzov");
        arrayListNames.add("Radmir Radmirov");
        arrayListNames.add("Kamal Kamalov");
        arrayListNames.add("Iskender Iskenderov");
        arrayListNames.add("Almanbet Almanbetov");
        arrayListNames.add("Almazbek Almazbekov");
        arrayListNames.add("Almazbek Almazbekov");
        arrayListNames.add("Almazbek Almazbekov");
        arrayListNames.add("Almazbek Almazbekov");
        arrayListNames.add("Almazbek Almazbekov");
        arrayListNames.add("Almazbek Almazbekov");
        arrayListNames.add("Almazbek Almazbekov");
        arrayListNames.add("Almazbek Almazbekov");
        arrayListNames.add("Almazbek Almazbekov");

    }

    public void newElements(){
        adapter = new ContactAdapter(arrayListNames);
        recyclerView = findViewById(R.id.recyclerView);
    }
}