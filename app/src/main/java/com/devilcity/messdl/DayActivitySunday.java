package com.devilcity.messdl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;



public class DayActivitySunday extends ActionBarActivity {
    private GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_activity_sunday);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Sunday");

        getSupportActionBar().setElevation(0);
        gestureDetector = new GestureDetector(new SwipeGestureDetector());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (gestureDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    private void onLeftSwipe() {
        Intent a = new Intent(this, DayActivityMonday.class);
        startActivity(a);
        overridePendingTransition(R.anim.left_in,R.anim.left_out);
    }

    private void onRightSwipe() {
        Intent a = new Intent(this, DayActivitySaturday.class);
        startActivity(a);
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }

    // Private class for gestures
    private class SwipeGestureDetector
            extends GestureDetector.SimpleOnGestureListener {
        // Swipe properties, you can change it to make the swipe
        // longer or shorter and speed
        private static final int SWIPE_MIN_DISTANCE = 80;
        private static final int SWIPE_MAX_OFF_PATH = 200;
        private static final int SWIPE_THRESHOLD_VELOCITY = 120;

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2,
                               float velocityX, float velocityY) {
            try {
                float diffAbs = Math.abs(e1.getY() - e2.getY());
                float diff = e1.getX() - e2.getX();

                if (diffAbs > SWIPE_MAX_OFF_PATH)
                    return false;

                    // Left swipe
                if (diff > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    DayActivitySunday.this.onLeftSwipe();

                    // Right swipe
                } else if (-diff > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    DayActivitySunday.this.onRightSwipe();
                }
            } catch (Exception e) {
                Log.e("YourActivity", "Error on gestures");
            }
            return false;
        }
    }

    public void breakfastClick(View v) {
        Intent i = new Intent(this, SundayBreakfast.class);
        startActivity(i);
    }

    public void lunchClick(View v) {
        Intent i = new Intent(this, SundayLunch.class);
        startActivity(i);
    }

    public void snacksClick(View v) {
        Intent i = new Intent(this, SundaySnacks.class);
        startActivity(i);
    }
    public void dinnerClick(View v) {
        Intent i = new Intent(this, SundayDinner.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_day_activity_sunday, menu);
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

