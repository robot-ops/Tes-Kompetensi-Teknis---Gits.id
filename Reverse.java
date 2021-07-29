package com.example.reverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mKalimat;
    private TextView mHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mKalimat = findViewById(R.id.inputkalimat);
        mHasil = findViewById(R.id.hasil);
    }

    public void onCek(View view) {
        String kalimat = mKalimat.getText().toString();
        StringBuilder stringBuilder = new StringBuilder(kalimat);
        mHasil.setText(stringBuilder.reverse().toString());
    }
}
