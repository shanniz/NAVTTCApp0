package com.example.navttcapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.counter = 1;
        this.textView= findViewById(R.id.textView);

    }
    public void updateCounter(View view){
        this.textView.setText(counter+"");
        counter++;
    }

}