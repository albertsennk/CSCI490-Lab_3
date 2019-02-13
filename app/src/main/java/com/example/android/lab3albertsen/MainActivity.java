package com.example.android.lab3albertsen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] schedule = {"Italian 313", "User Interface Design",
            "CITA Capstone", "The Art of Translation", "App Development",
            "Macroeconomics", "Cults and Conversion", "Lithography"};

    public ArrayAdapter<String> thing;
    public ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thing = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, schedule);

        list = findViewById(R.id.class_schedule);
        list.setAdapter(thing);

    }
}
