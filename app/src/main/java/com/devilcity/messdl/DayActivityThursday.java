package com.devilcity.messdl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class DayActivityThursday extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_activity_thursday);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Thursday");

        getSupportActionBar().setElevation(0);
    }

    public void breakfastClick(View v) {
        Intent i = new Intent(this, ThursdayBreakfast.class);
        startActivity(i);
    }

    public void lunchClick(View v) {
        Intent i = new Intent(this, ThursdayLunch.class);
        startActivity(i);
    }

    public void snacksClick(View v) {
        Intent i = new Intent(this, ThursdaySnacks.class);
        startActivity(i);
    }
    public void dinnerClick(View v) {
        Intent i = new Intent(this, ThursdayDinner.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_day_activity_thursday, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(android.R.id.home == item.getItemId()) {
            Intent myIntent = new Intent(getApplicationContext(), WeekActivity.class);
            startActivityForResult(myIntent, 0);
        }
        if(R.id.action_home == item.getItemId()) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        return true;

    }
}

