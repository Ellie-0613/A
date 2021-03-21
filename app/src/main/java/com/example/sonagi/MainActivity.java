package com.example.sonagi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    long now = System.currentTimeMillis();
    Date date= new Date(now);
    SimpleDateFormat dtNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String formatDate = dtNow.format(date);

    TextView date_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date_time = (TextView) findViewById(R.id.date_time);
        date_time.setText(formatDate);
    }
}