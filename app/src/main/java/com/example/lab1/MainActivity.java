package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private Flower flower = new Flower();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioClick(View view){
        try{
            RadioButton radioButton = findViewById(R.id.radioButton1);
            if(radioButton.isChecked()) flower.setMainFlower(1, 15000);
            radioButton = findViewById(R.id.radioButton2);
            if(radioButton.isChecked()) flower.setMainFlower(2, 5000);
            radioButton = findViewById(R.id.radioButton3);
            if(radioButton.isChecked()) flower.setMainFlower(3, 12000);
            radioButton = findViewById(R.id.radioButton4);
            if(radioButton.isChecked()) flower.setMainFlower(4, 1000);

            radioButton = findViewById(R.id.radioButton5);
            if(radioButton.isChecked()) flower.setWrapper(1, 300);
            radioButton = findViewById(R.id.radioButton6);
            if(radioButton.isChecked()) flower.setWrapper(2, 320);
            radioButton = findViewById(R.id.radioButton7);
            if(radioButton.isChecked()) flower.setWrapper(3, 250);
            radioButton = findViewById(R.id.radioButton8);
            if(radioButton.isChecked()) flower.setWrapper(4, 0);

            radioButton = findViewById(R.id.radioButton9);
            if(radioButton.isChecked()) flower.setRibbon(1, 30);
            radioButton = findViewById(R.id.radioButton10);
            if(radioButton.isChecked()) flower.setRibbon(2, 30);
            radioButton = findViewById(R.id.radioButton11);
            if(radioButton.isChecked()) flower.setRibbon(3, 30);
            radioButton = findViewById(R.id.radioButton12);
            if(radioButton.isChecked()) flower.setRibbon(4, 0);

            radioButton = findViewById(R.id.radioButton13);
            if(radioButton.isChecked()) flower.setCard(1, 3000);
            radioButton = findViewById(R.id.radioButton14);
            if(radioButton.isChecked()) flower.setCard(2, 0);

        }
        catch (Exception e) { }
    }
    public void getCost(View view) {
        try{
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra(Flower.class.getSimpleName(), flower);
            startActivity(intent);
        }
        catch (Exception e) { }
    }
}