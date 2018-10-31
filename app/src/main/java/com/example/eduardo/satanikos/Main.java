package com.example.eduardo.satanikos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;



public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(Main.this,SeccondView.class);
                EditText text = (EditText)findViewById(R.id.input);
                String message = text.getText().toString();
                intent.putExtra("Mensaje",message);
                startActivity(intent);

            }
        });
    }


}
