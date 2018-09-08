package com.batiancila.a05_lab_exercise_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String LAST_NAME = "com.batiancila.a05_lab_exercise_1";
    public final static String FIRST_NAME = "first_name";
    public final static String GENDER = "gender";
    private String[] courses = {
            "ABM",
            "BSIT",
            "BSCS",
            "BSCpE",
            "MSIT",
            "MSCS"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.submit_form);
        ArrayList<String> courseDataSet = new ArrayList<>(Arrays.asList(courses));
        Spinner courseSpinner = findViewById(R.id.course_spinner);
        StudentsSpinnerAdapter adapter = new StudentsSpinnerAdapter(this, R.layout.course_spinner_item_layout, courseDataSet);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        courseSpinner.setAdapter(adapter);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this , DisplayMessageActivity.class);
        EditText lastName = (EditText)findViewById(R.id.edit_last_name);
        EditText firstName = (EditText)findViewById(R.id.edit_first_name);
        RadioGroup genderGroup = findViewById(R.id.gender_radioGroup);
        String gender;

        genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                 @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                     switch (checkedId){
                         case R.id.male_radioButton:
                             break;

                         case R.id.female_radioButton:
                             break;

                     }
            }
        });
        intent.putExtra(LAST_NAME, lastName.getText().toString());
        intent.putExtra(FIRST_NAME, firstName.getText().toString());
        startActivity(intent);
    }
}
