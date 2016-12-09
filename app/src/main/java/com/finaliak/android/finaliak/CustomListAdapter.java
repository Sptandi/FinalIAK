package com.finaliak.android.finaliak;

/**
 * Created by sptan on 04/12/2016.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.name;


public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final String[] email;
    private final String[] number;
    private final Integer[] imgid;


    public CustomListAdapter(Activity context, String[] itemname,String[] email,String[] number, Integer[] imgid) {
        super(context, R.layout.my_list,itemname);
        this.context = context;
        this.itemname = itemname;
        this.email = email;
        this.number = number;
        this.imgid = imgid;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_list,null,true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView imageText = (TextView) rowView.findViewById(R.id.item);
        TextView Number = (TextView) rowView.findViewById(R.id.textViewOne);
        TextView Email = (TextView) rowView.findViewById(R.id.textViewTwo);

        imageText.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        Number.setText(number[position]);
        Email.setText(email[position]);

        return rowView;
    }
}
