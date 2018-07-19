package com.example.hp.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;

import static android.widget.AdapterView.*;

public class MainActivity extends AppCompatActivity implements
        OnItemSelectedListener{
    Spinner mlabelspinner;
    String mSpinnerLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlabelspinner=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Subject, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        mlabelspinner.setAdapter(adapter);
        mlabelspinner.setOnItemSelectedListener(this);
    }

    public void eamil(View view) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(getApplicationContext(),"selected item is "+mSpinnerLabel,Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
