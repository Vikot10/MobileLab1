package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle args = getIntent().getExtras();
        Flower flower;
        if(args != null)
        {
            flower = (Flower) args.getSerializable(Flower.class.getSimpleName());
            printFlower(flower);
        }
    }

    private void printFlower(Flower flower){
        String s = "Вы заказали: \n";
        switch (flower.getMainFlower()){
            case 1:
                s += "100 роз  (15000 руб.)\n";
                break;
            case 2:
                s += "Синии хризантемы (5000 руб.)\n";
                break;
            case 3:
                s += "Пионы (12000 руб.)\n";
                break;
            case 4:
                s += "Ромашки (1000 руб.)\n";
                break;
        }
        switch (flower.getWrapper()){
            case 1:
                s += "Красная (300 руб.)\n";
                break;
            case 2:
                s += "Синяя (320 руб.)\n";
                break;
            case 3:
                s += "Прозрачная (250 руб.)\n";
                break;
            case 4:
                s += "Без обёртки (бесплатно)\n";
                break;
        }
        switch (flower.getRibbon()){
            case 1:
                s += "Красная (30 руб.)\n";
                break;
            case 2:
                s += "Синяя (30 руб.)\n";
                break;
            case 3:
                s += "Белая (30 руб.)\n";
                break;
            case 4:
                s += "Без ленточки (бесплатно)\n";
                break;
        }
        switch (flower.getCard()){
            case 1:
                s += "Да (3000 руб.)\n";
                break;
            case 2:
                s += "Нет (бесплатно)\n";
                break;
        }

        s += "Итого к оплате:\n" + flower.getAllCost();
        TextView tv = findViewById(R.id.textView);
        tv.setText(s);
    }
}