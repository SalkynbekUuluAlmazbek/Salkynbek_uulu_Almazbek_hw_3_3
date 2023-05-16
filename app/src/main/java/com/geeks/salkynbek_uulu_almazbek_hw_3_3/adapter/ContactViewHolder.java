package com.geeks.salkynbek_uulu_almazbek_hw_3_3.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.salkynbek_uulu_almazbek_hw_3_3.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    ImageView icon;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String name){

        findViewById();

        textView.setText(name);

    }
    private void findViewById(){
        textView = itemView.findViewById(R.id.textViewName);
        icon = itemView.findViewById(R.id.imageViewIcon);
    }
}
