package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrencyButton(View view) {
        EditText cad = findViewById(R.id.cadAmountBox);
        double cadAmt = Double.parseDouble(cad.getText().toString());
        double inrAmt = cadAmt * 53.84;
        Toast.makeText(this, cadAmt + " CAD is ::: " + inrAmt + " INR.", Toast.LENGTH_LONG).show();
//        Log.i("INFO:","sssup");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
