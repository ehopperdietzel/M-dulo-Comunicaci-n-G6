package com.example.eduardo.satanikos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SeccondView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccond_view);
        TextView text = (TextView)findViewById(R.id.textView);

        text.setText(getIntent().getStringExtra("Mensaje"));
    }
}
