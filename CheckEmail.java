package com.example.checkemail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText mEmail;
    TextView mReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmail = findViewById(R.id.input_email);
        mReport = findViewById(R.id.report);
    }

    public void onCek(View view) {

        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+]{1,20}+@[A-Z-a-z0-9]+(?:\\b.co.id\\b|\\b.id\\b)");
        Matcher matcher = pattern.matcher(mEmail.getText());

        if (matcher.matches()){
            mReport.setText("Alamat Email Valid");
        }else {
            mReport.setText("Alamat Email Tidak Valid");
        }
    }
}
