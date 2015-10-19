package com.devilcity.messdl;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.devilcity.messdl.R;


public class WednesdayLunch extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday_lunch);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_wednesday_lunch, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(android.R.id.home == item.getItemId()) {
            Intent myIntent = new Intent(getApplicationContext(), DayActivityWednesday.class);
            startActivityForResult(myIntent, 0);
        }
        if(R.id.action_home == item.getItemId()) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        return true;

    }
}