package com.example.atividade22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

public class Calculadora extends AppCompatActivity {

        EditText valor1, valor2;
        Button btsomar,btsubtrair,btproduto,btdivisao,btporcentagem;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewbyId(R.id.valor1);
        valor2 = (EditText) findViewbyId(R.id.valor2);
        btsomar = (Button) findViewbyId(R.id.btSomar);
        btsubtrair = (Button) findViewbyId(R.id.btSubtrair);
        btproduto = (Button) findViewbyId(R.id.btProduto);
        btdivisao = (Button) findViewbyId(R.id.btDivisao);
        btporcentagem = (Button) findViewbyId(R.id.btporcentagem);

        btsomar.setOnClickListener(new View.OnClickListener() (
        @Override
                public void onClick(View v) [
            double num1 = Double.parseDouble(
               valor1.getText().toString());
            double num2 = Double.parseDouble(
                valor2.getText().toString());
            double soma = num1 + num2;
            AlertDialog.Builder dialogo = new
                    AlertDialog.Builder(Calculadora.this);
            dialogo.setTitle("Resultado soma");
            dialogo.setTitle("A soma é" + soma);
            dialogo.setNeutralButton("Ok", null);
            dialogo.show();
        ]
            ));

        btsubtrair.setOnClickListener(new View.OnClickListener() (
        @Override
        public void onClick(View v) [
        double num1 = Double.parseDouble(
                valor1.getText().toString());
        double num2 = Double.parseDouble(
                valor2.getText().toString());
        double subtração = num1 - num2;
        AlertDialog.Builder dialogo = new
                AlertDialog.Builder(Calculadora.this);
        dialogo.setTitle("Resultado subtração");
        dialogo.setTitle("A subtração é" + subtração);
        dialogo.setNeutralButton("Ok", null);
        dialogo.show();
        ]
            ));

        btproduto.setOnClickListener(new View.OnClickListener() (
        @Override
        public void onClick(View v) [
        double num1 = Double.parseDouble(
                valor1.getText().toString());
        double num2 = Double.parseDouble(
                valor2.getText().toString());
        double produto = num1 * num2;
        AlertDialog.Builder dialogo = new
                AlertDialog.Builder(Calculadora.this);
        dialogo.setTitle("Resultado produto");
        dialogo.setTitle("O produto é" + produto);
        dialogo.setNeutralButton("Ok", null);
        dialogo.show();
        ]
            ));

        btdivisao.setOnClickListener(new View.OnClickListener() (
        @Override
        public void onClick(View v) [
        double num1 = Double.parseDouble(
                valor1.getText().toString());
        double num2 = Double.parseDouble(
                valor2.getText().toString());
        double divisao = num1 / num2;
        AlertDialog.Builder dialogo = new
                AlertDialog.Builder(Calculadora.this);
        dialogo.setTitle("Resultado divisão");
        dialogo.setTitle("A divisão é" + divisao);
        dialogo.setNeutralButton("Ok", null);
        dialogo.show();
        ]
            ));

        btporcentagem.setOnClickListener(new View.OnClickListener() (
        @Override
        public void onClick(View v) [
        double num1 = Double.parseDouble(
                valor1.getText().toString());
        double num2 = Double.parseDouble(
                valor2.getText().toString());
        double porcentagem = num1/100*num2;
        AlertDialog.Builder dialogo = new
                AlertDialog.Builder(Calculadora.this);
        dialogo.setTitle("Resultado porcentagem");
        dialogo.setTitle("A porcentagem é" + porcentagem);
        dialogo.setNeutralButton("Ok", null);
        dialogo.show();
        ]
            ));

    }
}
