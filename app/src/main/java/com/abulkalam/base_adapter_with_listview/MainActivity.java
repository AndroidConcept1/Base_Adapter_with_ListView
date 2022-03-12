package com.abulkalam.base_adapter_with_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] country_name ={"India","Pakistan","Bangladesh","Nepal","Bhutan","Sri-Lanka","Myanmar","Afghanistan","China"};

    int[] flags = {R.drawable.food1, R.drawable.food2, R.drawable.food3, R.drawable.food4, R.drawable.food5,
            R.drawable.food6, R.drawable.food7, R.drawable.food8, R.drawable.food9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listView = findViewById(R.id.simpleListView);

        //Creating object of custom_adapter
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), country_name, flags);
        listView.setAdapter(customAdapter);
    }
}