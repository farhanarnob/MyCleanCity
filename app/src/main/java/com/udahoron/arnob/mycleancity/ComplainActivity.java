package com.udahoron.arnob.mycleancity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by farha on 12-Nov-16.
 */

public class ComplainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Toolbar toolbar;
    List<String> categories;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complain_submission);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.complain_selected_id);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        setSupportActionBar(toolbar);
        setTitle("Submit Complain");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Spinner Drop down elements
        categories = new ArrayList<String>();
        categories.add("Garbage not collected");
        categories.add("Drain has been broken");
        categories.add("Drain water overflow");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
