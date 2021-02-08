package com.sang.buttonlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you have just pressed the button", Toast.LENGTH_SHORT).show();
            }
        });

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button2.setOnClickListener(fusedListener);
        button3.setOnClickListener(fusedListener);
        button4.setOnClickListener(fusedListener);
    }

    View.OnClickListener fusedListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch(id){
                case R.id.button2:
                    Toast.makeText(MainActivity.this, "button 2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button3:
                    Toast.makeText(MainActivity.this, "button 3", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.button4:
                    Toast.makeText(MainActivity.this, "button 4", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    return;

            }
        }
    };
}