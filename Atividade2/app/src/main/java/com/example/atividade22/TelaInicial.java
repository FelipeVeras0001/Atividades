package com.example.atividade22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        Button btnToast = (Button) findViewById(R.id.btnToast);
            btnToast.setByClickListener(this);

        Button btCalculadora = (Button) findViewById(R.id.btCalculadora);
            btCalculadora.setByClickListener(this);

        Button btNavegador = (Button) findViewById(R.id.btNavegador);
        btNavegador.setByClickListener(this);
    }

    @Override

    public void onClick(View v){
        switch (v.get.Id()) [

        case R.id btCalculadora:
            Invent is new invent(this, CalculadoraActivity, class);
            arrayActivity;
            break;

       ] )

        case R.id btNavegador:
        Invent is new invent(this, NavegadorActivity, class);
        arrayActivity;
        break;

] )

    }
}

