package com.utem9781466952ncm8124687f4m262d476247mc26b724cn87b3qb63.contec;

import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class productovendido extends AppCompatActivity {
    LinearLayout actual,diciembre, noviembre, eneroocho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productovendido);
        actual=(LinearLayout) findViewById(R.id.actual);
        actual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(productovendido.this,estadisticadeventas.class);
                startActivity(docenteee);
            }
        });
        diciembre=(LinearLayout) findViewById(R.id.diciembre);
        diciembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(productovendido.this,estadisticadeventas.class);
                startActivity(docenteee);
            }
        });
        noviembre=(LinearLayout) findViewById(R.id.noviembre);
        noviembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(productovendido.this,estadisticadeventas.class);
                startActivity(docenteee);
            }
        });
        eneroocho=(LinearLayout) findViewById(R.id.eneroocho);
        eneroocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(productovendido.this,estadisticadeventas.class);
                startActivity(docenteee);
            }
        });
    }
}
