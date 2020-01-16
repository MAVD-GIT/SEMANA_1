package com.utem9781466952ncm8124687f4m262d476247mc26b724cn87b3qb63.contec;

import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnrestablecer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnrestablecer=(Button) findViewById(R.id.btnrestablecer);
        btnrestablecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docenteee=new Intent(MainActivity.this,menunnn.class);
                startActivity(docenteee);
                finish();
            }
        });
    }
}
