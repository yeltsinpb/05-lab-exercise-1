package com.batiancila.a05_lab_exercise_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String lastName = intent.getStringExtra(MainActivity.LAST_NAME);
        String firstName = intent.getStringExtra(MainActivity.FIRST_NAME);

        setContentView(R.layout.activity_display_message);
        TextView last_name = (TextView)findViewById(R.id.txt_last_name);
        TextView first_name = (TextView)findViewById(R.id.txt_first_name);

        last_name.setText( lastName);
        first_name.setText( firstName);

    }
}
