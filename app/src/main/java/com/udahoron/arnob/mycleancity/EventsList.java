package com.udahoron.arnob.mycleancity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by farha on 12-Nov-16.
 */

public class EventsList extends AppCompatActivity {
    ListView monthsListView;
    Toolbar toolbar;
    ArrayAdapter<String> arrayAdapter;
    private String[] eventsArray = { "21 January , 2017 - Bonani Mosques at 3 pm", "21 January , 2017 - Bonani Mosques at 1 am",
            "2 January , 2017 - kuril fly over at 3 pm", "7 February , 2017 - Khilkhet at 4 pm",
            "18 March , 2017 - Mirpur Road 10 circle area at 9 am" };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_list);

        monthsListView = (ListView) findViewById(R.id.list_item);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, eventsArray);
        monthsListView.setAdapter(arrayAdapter);
    }
}
