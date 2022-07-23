package com.example.appgenicanva.fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appgenicanva.R;

public class Cadastro extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        button = findViewById(R.id.docadastroprologin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendocadastropraologin();
            }
        });
    }

    private void opendocadastropraologin() {
        Intent intent = new Intent(this, Login.class );
        startActivity(intent);

    }
}