package com.miniproject.dypiemr;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CalCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Date firstDayOfNewMonth = new Date();
        CompactCalendarView compactCalendarView;
        final SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());
        setContentView(R.layout.activity_cal_course);
        TextView t=(TextView)findViewById(R.id.textView53);
        t.setText(simpleDateFormat.format(firstDayOfNewMonth));
        compactCalendarView=(CompactCalendarView)findViewById(R.id.compactcalendar_view);
        compactCalendarView.setUseThreeLetterAbbreviation(true);

        Event ev=new Event(Color.BLUE,1509647400000L);
        Event ev2=new Event(Color.BLUE,1510425000000L);
        Event exam1=new Event(Color.RED,1511721000000L);
        Event exam2=new Event(Color.RED,1511893800000L);
        Event exam3=new Event(Color.RED,1512153000000L);
        Event exam4=new Event(Color.RED,1512412200000L);
        Event exam5=new Event(Color.RED,1512671400000L);

        compactCalendarView.addEvent(ev);
        compactCalendarView.addEvent(ev2);
        compactCalendarView.addEvent(exam1);
        compactCalendarView.addEvent(exam2);
        compactCalendarView.addEvent(exam3);
        compactCalendarView.addEvent(exam4);
        compactCalendarView.addEvent(exam5);

        compactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context= getApplicationContext();
                if(dateClicked.toString().compareTo("Fri Nov 03 00:00:00 GMT+05:30 2017")==0)
                    Toast.makeText(CalCourseActivity.this,"DBMS University Practicals (TY COMP)",Toast.LENGTH_SHORT).show();
                else if(dateClicked.toString().compareTo("Sun Nov 12 00:00:00 GMT+05:30 2017")==0)
                    Toast.makeText(CalCourseActivity.this,"SDL University Practicals (TY COMP)",Toast.LENGTH_SHORT).show();
                else if(dateClicked.toString().compareTo("Mon Nov 27 00:00:00 GMT+05:30 2017")==0)
                    Toast.makeText(CalCourseActivity.this,"First (TY) University Exam",Toast.LENGTH_SHORT).show();
                else if(dateClicked.toString().compareTo("Wed Nov 29 00:00:00 GMT+05:30 2017")==0)
                    Toast.makeText(CalCourseActivity.this,"Second (TY) University Exam",Toast.LENGTH_SHORT).show();
                else if(dateClicked.toString().compareTo("Sat Dec 02 00:00:00 GMT+05:30 2017")==0)
                    Toast.makeText(CalCourseActivity.this,"Third (TY) University Exam",Toast.LENGTH_SHORT).show();
                else if(dateClicked.toString().compareTo("Tue Dec 05 00:00:00 GMT+05:30 2017")==0)
                    Toast.makeText(CalCourseActivity.this,"Fourth (TY) University Exam",Toast.LENGTH_SHORT).show();
                else if(dateClicked.toString().compareTo("Fri Dec 08 00:00:00 GMT+05:30 2017")==0)
                    Toast.makeText(CalCourseActivity.this,"Fifth (TY) University Exam",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(CalCourseActivity.this,"No Event",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                TextView t=(TextView)findViewById(R.id.textView53);
                t.setText(simpleDateFormat.format(firstDayOfNewMonth));
            }
        });
    }
}
