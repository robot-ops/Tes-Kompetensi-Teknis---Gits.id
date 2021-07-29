package com.example.aplikasihelloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "HelloWorldActivity";
    private EditText mInputBilangan;
    private TextView mHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInputBilangan = findViewById(R.id.inputbilangan);
        mHasil = findViewById(R.id.hasil);

    }

    public void onCek(View view) {
        int bilangan;
        try {
            bilangan = getOperand(mInputBilangan);
        }catch (NumberFormatException nfe){
            Log.e(TAG, "NumberFormatException", nfe);
            mHasil.setText(getString(R.string.computationError));
            return;
        }

        if (bilangan%5 == 0 && bilangan%3 == 0){
            mHasil.setText("Hello World");
        }else if (bilangan%3 == 0){
            mHasil.setText("Hello");
        }else if (bilangan%5 == 0){
            mHasil.setText("World");
        }else {
            mHasil.setText("Bilangan Yang Anda Masukkan Tidak Habis dibagi 3 maupun 5");
        }
    }

    private static Integer getOperand(EditText operandEditText) {
        String operandText = getOperandText(operandEditText);
        return Integer.valueOf(operandText);
    }

    private static String getOperandText(EditText operandEditText) {
        return operandEditText.getText().toString();
    }
}