package com.example.camara;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AResultado extends AppCompatActivity {

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvResultado = findViewById(R.id.tvResultado);

        // Verificar si el Intent tiene el extra "STNombre"
        if (getIntent().hasExtra("STNombre")) {
            // Obtener el nombre de la foto desde el Intent
            String nombreFoto = getIntent().getStringExtra("STNombre");

            // Mostrar el nombre de la foto en el TextView
            tvResultado.setText("Nombre de la foto: " + nombreFoto);
        } else {
            // Mostrar un mensaje si no se recibe ningún dato
            tvResultado.setText("No se recibió ningún nombre de foto.");
        }
    }
}
