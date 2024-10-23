package com.example.turystyka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int licznik;
    private Button buttonPolub;
    private Button buttonUsun;
    private Button buttonZapisz;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView10);

        buttonPolub =findViewById(R.id.button4);
        buttonPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik++;
                textView.setText(String.valueOf(licznik+" polubień"));
            }
        });

        buttonUsun = findViewById(R.id.button5);
        buttonUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (licznik > 0){
                    licznik--;
                    textView.setText(String.valueOf(licznik+" polubień"));
                }
            }
        });

        buttonZapisz = findViewById(R.id.button6);
        buttonZapisz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}