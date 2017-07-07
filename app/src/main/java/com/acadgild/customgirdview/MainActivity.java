package com.acadgild.customgirdview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

    GridView gridview;
//Defining Two arrays
    public static String[] name = {
            "GingerBread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop"
    };
    public static int[] images = {
            R.drawable.g,
            R.drawable.h_1,
            R.drawable.i,
            R.drawable.j_1,
            R.drawable.k_1,
            R.drawable.l
            };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//loading the main layout
        //Binding the Arrays and adapter
        GridView_Adapter adapter = new GridView_Adapter(MainActivity.this, name, images);
        gridview=(GridView)findViewById(R.id.grid);
        gridview.setAdapter(adapter);//Setting the adapter

        }

    }
