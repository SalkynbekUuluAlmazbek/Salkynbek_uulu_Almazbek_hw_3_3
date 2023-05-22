package com.geeks.salkynbek_uulu_almazbek_hw_3_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Integer icon = getIntent().getIntExtra("image", 0);
        String title = getIntent().getStringExtra("title");
        String name = getIntent().getStringExtra("name");
        String color = getIntent().getStringExtra("color");
        String sum = getIntent().getStringExtra("sum");
        binding.image.setImageResource(icon);
        binding.textViewDTitle.setText(title);
        binding.textViewDescription.setText(description);
        binding.textViewDColor.setText(color);
        binding.textViewDSum.setText(sum);




    }
}