package com.example.appgenicanva.fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appgenicanva.R;

public class Login extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //Ir Para a tela Inicial
        button = findViewById(R.id.irtelacomovaifuncionar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTelacomovaifuncionar();
            }
        });
    }

    private void openTelacomovaifuncionar() {

        Intent intent = new Intent(this, ComoFuncionar.class );
        startActivity(intent);
    }
}