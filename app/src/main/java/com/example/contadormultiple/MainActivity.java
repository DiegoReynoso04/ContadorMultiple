package com.example.contadormultiple;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;


    TextView texto1, texto2, texto3, texto4, texto5;
    Button aumentar1, aumentar2, aumentar3, aumentar4, reset1, reset2, reset3, reset4, buttonResetAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);
        texto3 = findViewById(R.id.texto3);
        texto4 = findViewById(R.id.texto4);
        texto5 = findViewById(R.id.texto5);


        aumentar1 = findViewById(R.id.boton1);
        aumentar2 = findViewById(R.id.boton2);
        aumentar3 = findViewById(R.id.boton3);
        aumentar4 = findViewById(R.id.boton4);
        reset1 = findViewById(R.id.reset1);
        reset2 = findViewById(R.id.reset2);
        reset3 = findViewById(R.id.reset3);
        reset4 = findViewById(R.id.reset4);
        buttonResetAll = findViewById(R.id.buttonResetAll);


        aumentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                texto2.setText(String.valueOf(contador2));

                contador1 = contador2 + contador3 + contador4 + contador5;
                texto1.setText(String.valueOf(contador1));
            }
        });

        aumentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                texto3.setText(String.valueOf(contador3));

                contador1 = contador2 + contador3 + contador4 + contador5;
                texto1.setText(String.valueOf(contador1));
            }
        });

        aumentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                texto4.setText(String.valueOf(contador4));


                contador1 = contador2 + contador3 + contador4 + contador5;
                texto1.setText(String.valueOf(contador1));
            }
        });

        aumentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador5++;
                texto5.setText(String.valueOf(contador5));


                contador1 = contador2 + contador3 + contador4 + contador5;
                texto1.setText(String.valueOf(contador1));
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2 = 0;
                texto2.setText(String.valueOf(contador2));


                contador1 = contador2 + contador3 + contador4 + contador5;
                texto1.setText(String.valueOf(contador1));
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3 = 0;
                texto3.setText(String.valueOf(contador3));

                contador1 = contador2 + contador3 + contador4 + contador5;
                texto1.setText(String.valueOf(contador1));
            }

        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4 = 0;
                texto4.setText(String.valueOf(contador4));

                contador1 = contador2 + contador3 + contador4 + contador5;
                texto1.setText(String.valueOf(contador1));
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador5 = 0;
                texto5.setText(String.valueOf(contador5));

                contador1 = contador2 + contador3 + contador4 + contador5;
                texto1.setText(String.valueOf(contador1));
        }
        });

        buttonResetAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                contador5 = 0;

                texto1.setText(String.valueOf(contador1));
                texto2.setText(String.valueOf(contador2));
                texto3.setText(String.valueOf(contador3));
                texto4.setText(String.valueOf(contador4));
                texto5.setText(String.valueOf(contador5));
            }
        });

    }
}

