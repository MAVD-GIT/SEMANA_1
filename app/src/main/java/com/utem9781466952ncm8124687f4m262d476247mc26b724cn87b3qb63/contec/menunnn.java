package com.utem9781466952ncm8124687f4m262d476247mc26b724cn87b3qb63.contec;

import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menunnn extends AppCompatActivity {
    CircleImageView ventas, inventario, vendidas, registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menunnn);
        ventas=(CircleImageView) findViewById(R.id.ventas);
        ventas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(menunnn.this,ventassss.class);
                startActivity(docenteee);
            }
        });
        inventario=(CircleImageView) findViewById(R.id.inventario);
        inventario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(menunnn.this,inventariooo.class);
                startActivity(docenteee);
            }
        });
        vendidas=(CircleImageView) findViewById(R.id.vendidas);
        vendidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(menunnn.this,productovendido.class);
                startActivity(docenteee);
            }
        });
        registro=(CircleImageView) findViewById(R.id.registro);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(menunnn.this,registroinventario.class);
                startActivity(docenteee);
            }
        });
    }
}
