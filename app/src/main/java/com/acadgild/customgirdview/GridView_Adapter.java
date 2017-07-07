package com.acadgild.customgirdview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridView_Adapter extends BaseAdapter {
    private Context mContext;
    private final String[] name; //Declaring String array name
    private final int[] images;//Declaring Integer array images

    public GridView_Adapter(Context c,String[] name,int[] images ) {
        mContext = c;
        this.name = name;
        this.images = images;
    }

    @Override
    public int getCount() {

        return images.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_item, null);//Inflating the coustom grid view
            TextView textView = (TextView) grid.findViewById(R.id.names);
            ImageView imageView = (ImageView)grid.findViewById(R.id.images);
            imageView.setImageResource(images[position]);//setting the image at the desired position
            textView.setText(name[position]);//setting the text at the desired position

        } else {
            grid = (View) convertView;
        }
        return grid;
    }
}