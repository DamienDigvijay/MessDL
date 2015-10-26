package com.devilcity.messdl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import java.util.Calendar;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Calendar calendar =Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);


        if(day == Calendar.MONDAY) {
            if (hour >= 0 && hour < 9) {
                Intent i = new Intent(this, MondayBreakfast.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);

            }
            if (hour >= 9 && hour < 14) {
                Intent i = new Intent(this, MondayLunch.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
            if (hour >= 14 && hour <= 17 || hour == 18 && min <15) {
                Intent i = new Intent(this, MondaySnacks.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
            if (hour >= 19 && hour < 21 || hour == 18 && min > 15 || hour == 21 && min<30) {
                Intent i = new Intent(this, MondayDinner.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
            if (hour > 21 && hour <= 23 || hour == 21 && min > 30) {
                Intent i = new Intent(this, TuesdayBreakfast.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
        }

            if(day == Calendar.TUESDAY) {
                if (hour >= 0 && hour < 9) {
                    Intent i = new Intent(this, TuesdayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 9 && hour < 14) {
                    Intent i = new Intent(this, TuesdayLunch.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 14 && hour <= 17 || hour == 18 && min <15) {
                    Intent i = new Intent(this, TuesdaySnacks.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 19 && hour < 21 || hour == 18 && min > 15 || hour == 21 && min<30) {
                    Intent i = new Intent(this, TuesdayDinner.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour > 21 && hour <= 23 || hour == 21 && min > 30) {
                    Intent i = new Intent(this, WednesdayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
            }
            if(day == Calendar.WEDNESDAY) {
                if (hour >= 0 && hour < 9) {
                    Intent i = new Intent(this, WednesdayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 9 && hour < 14) {
                    Intent i = new Intent(this, WednesdayLunch.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 14 && hour <= 17 || hour == 18 && min <15) {
                    Intent i = new Intent(this, WednesdaySnacks.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 19 && hour < 21 || hour == 18 && min > 15 || hour == 21 && min<30) {
                    Intent i = new Intent(this, WednesdayDinner.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour > 21 && hour <= 23 || hour == 21 && min > 30) {
                    Intent i = new Intent(this, ThursdayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
            }
            if(day == Calendar.THURSDAY) {
                if (hour >= 0 && hour < 9) {
                    Intent i = new Intent(this, ThursdayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 9 && hour < 14) {
                    Intent i = new Intent(this, ThursdayLunch.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 14 && hour <= 17 || hour == 18 && min <15) {
                    Intent i = new Intent(this, ThursdaySnacks.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 19 && hour < 21 || hour == 18 && min > 15 || hour == 21 && min<30) {
                    Intent i = new Intent(this, ThursdayDinner.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour > 21 && hour <= 23 || hour == 21 && min > 30) {
                    Intent i = new Intent(this, FridayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
            }
            if(day == Calendar.FRIDAY) {
                if (hour >= 0 && hour < 9) {
                    Intent i = new Intent(this,FridayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 9 && hour < 14) {
                    Intent i = new Intent(this, FridayLunch.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 14 && hour <= 17 || hour == 18 && min <15) {
                    Intent i = new Intent(this, FridaySnacks.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 19 && hour < 21 || hour == 18 && min > 15 || hour == 21 && min<30) {
                    Intent i = new Intent(this, FridayDinner.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour > 21 && hour <= 23 || hour == 21 && min > 30) {
                    Intent i = new Intent(this, SaturdayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
            }
            if(day == Calendar.SATURDAY) {
                if (hour >= 0 && hour <= 9) {
                    Intent i = new Intent(this, SaturdayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour > 9 && hour < 14) {
                    Intent i = new Intent(this, SaturdayLunch.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 14 && hour <= 17 || hour == 18 && min <15) {
                    Intent i = new Intent(this, SaturdaySnacks.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 19 && hour < 21 || hour == 18 && min > 15 || hour == 21 && min<30) {
                    Intent i = new Intent(this, SaturdayDinner.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour > 21 && hour <= 23 || hour == 21 && min > 30) {
                    Intent i = new Intent(this, SundayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
            }
            if(day == Calendar.SUNDAY) {
                if (hour >= 0 && hour <= 9) {
                    Intent i = new Intent(this, SundayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour > 9 && hour < 14) {
                    Intent i = new Intent(this, SundayLunch.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 14 && hour <= 17 || hour == 18 && min <15) {
                    Intent i = new Intent(this, SundaySnacks.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour >= 19 && hour < 21 || hour == 18 && min > 15 || hour == 21 && min<30) {
                    Intent i = new Intent(this, SundayDinner.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                if (hour > 21 && hour <= 23 || hour == 21 && min > 30) {
                    Intent i = new Intent(this, MondayBreakfast.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
            }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
