package com.finaliak.android.finaliak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Jenie",
            "Brella",
            "John",
            "Kiddow",
            "Dowes",
            "Laura",
            "Cinta",
            "Lidya",
            "Steve",
            "Cathrine",
            "Jokyo",
            "Alex",
            "Johanna",
            "Anna",
    };

    String[] number = {
            "08990426512",
            "08122142312",
            "08122412312",
            "08572185423",
            "08574213331",
            "08122123112",
            "08572199002",
            "08181231456",
            "08990425213",
            "02747428851",
            "02747713482",
            "08188232132",
            "08997564728",
            "08825277421",
    };

    String[] email = {
            "Jeniew@gmail.com",
            "Brellas@gmail.com",
            "John@gmail.com",
            "Kiddow@gmail.com",
            "Dowes@gmail.com",
            "Laura@gmail.com",
            "CintaLove@gmail.com",
            "Lidya@gmail.com",
            "Steve@gmail.com",
            "Cathrine@gmail.com",
            "Jokyo@gmail.com",
            "AlexLex@gmail.com",
            "JohannaW@yahoo.com",
            "Anna21@gmail.com",
    };

    Integer[] imgid =  {
            R.drawable.girl,
            R.drawable.hippie,
            R.drawable.man,
            R.drawable.man1,
            R.drawable.man2,
            R.drawable.woman,
            R.drawable.woman1,
            R.drawable.woman2,
            R.drawable.man3,
            R.drawable.woman3,
            R.drawable.man4,
            R.drawable.man5,
            R.drawable.woman4,
            R.drawable.woman5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Contact");
        CustomListAdapter adpater = new CustomListAdapter(this,itemname,number,email,imgid);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adpater);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemname[+position];
                Toast.makeText(getApplicationContext(),selectedItem, Toast.LENGTH_SHORT).show();
            }
        });

    }
}