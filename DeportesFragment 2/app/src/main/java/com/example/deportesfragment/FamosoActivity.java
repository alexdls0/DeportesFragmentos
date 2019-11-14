package com.example.deportesfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FamosoActivity extends AppCompatActivity {

    private static final String OPCION = "deportesfragment.OPCION";
    private String opcion;
    private ImageView ivFamoso;
    private TextView tvNombre, tvLogro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famoso);
        opcion = getIntent().getStringExtra(OPCION);

        ivFamoso = findViewById(R.id.ivFamoso);
        tvNombre = findViewById(R.id.tvNombre);
        tvLogro = findViewById(R.id.tvLogro);

        if(opcion.equalsIgnoreCase("basket")){
            ivFamoso.setImageResource(R.drawable.gasol);
            tvNombre.setText(R.string.f1);
            tvLogro.setText(R.string.l1);
        }

        if(opcion.equalsIgnoreCase("cycling")){
            ivFamoso.setImageResource(R.drawable.indurain);
            tvNombre.setText(R.string.f2);
            tvLogro.setText(R.string.l2);
        }

        if(opcion.equalsIgnoreCase("martial")){
            ivFamoso.setImageResource(R.drawable.perez);
            tvNombre.setText(R.string.f3);
            tvLogro.setText(R.string.l3);
        }
    }
}
