package com.example.android.lab3albertsen;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private String[] schedule = {"Italian 313", "User Interface Design",
//            "CITA Capstone", "The Art of Translation", "App Development",
//            "Macroeconomics", "Cults and Conversion", "Lithography"};

    public ArrayAdapter<String> thing;
    public ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] schedule = getResources().getStringArray(R.array.schedule);


        thing = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, schedule);

        list = findViewById(R.id.class_schedule);
        list.setAdapter(thing);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(), "OnItemClick", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(), "OnItemLongClick", Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

    }
}
