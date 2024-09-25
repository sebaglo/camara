package com.example.camara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnHacerFoto;
    private EditText etNombreFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHacerFoto = findViewById(R.id.btnHacerFoto);
        etNombreFoto = findViewById(R.id.ETNombreFoto);

        btnHacerFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stNombre = etNombreFoto.getText().toString().trim();

                // Verificar que el nombre de la foto no esté vacío
                if (!stNombre.isEmpty()) {
                    // Crear un Intent para iniciar AResultado
                    Intent sIntent = new Intent(MainActivity.this, AResultado.class);
                    // Enviar el nombre de la foto
                    sIntent.putExtra("STNombre", stNombre);
                    // Iniciar la nueva Activity
                    startActivity(sIntent);
                } else {
                    // Mostrar un mensaje si el campo está vacío
                    Toast.makeText(MainActivity.this, "Por favor ingresa un nombre para la foto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
