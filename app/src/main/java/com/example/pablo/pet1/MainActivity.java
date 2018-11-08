package com.example.pablo.pet1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView   dogText;
        TextView    catText;
        TextView    lionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogText = (TextView) findViewById(R.id.dog_text);
        catText = (TextView) findViewById(R.id.cat_text);
        lionText = (TextView) findViewById(R.id.lion_textion_text);

    }
}
