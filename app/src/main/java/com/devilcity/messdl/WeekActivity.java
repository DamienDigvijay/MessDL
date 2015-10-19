package com.devilcity.messdl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.devilcity.messdl.R;

public class WeekActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }

    public void mondayClick(View v){
        Intent i = new Intent(this, DayActivityMonday.class);
        startActivity(i);
    }

    public void tuesdayClick(View v){
        Intent i = new Intent(this, DayActivityTuesday.class);
        startActivity(i);
    }

    public void wednesdayClick(View v){
        Intent i = new Intent(this, DayActivityWednesday.class);
        startActivity(i);
    }
    public void thursdayClick(View v){
        Intent i = new Intent(this, DayActivityThursday.class);
        startActivity(i);
    }

    public void fridayClick(View v){
        Intent i = new Intent(this, DayActivityFriday.class);
        startActivity(i);
    }

    public void saturdayClick(View v){
        Intent i = new Intent(this, DayActivitySaturday.class);
        startActivity(i);
    }
    public void sundayClick(View v){
        Intent i = new Intent(this, DayActivitySunday.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_week, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(R.id.action_home == item.getItemId()) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        return true;
    }
}
