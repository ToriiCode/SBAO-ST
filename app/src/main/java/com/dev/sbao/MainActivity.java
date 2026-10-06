package com.dev.sbao;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dev.sbao.AyudaActivity;
import com.dev.sbao.ConfigActivity;
import com.dev.sbao.DetalleActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private Button btnIngresar, btnConfig, btnAyuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnConfig = findViewById(R.id.btnConfig);
        btnAyuda = findViewById(R.id.btnAyuda);

        // EVENTO EXPLÍCITO 1: Ir a Detalles (Con validación y extra)
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreIngresado = etNombre.getText().toString().trim();

                // Validación requerida por la rúbrica
                if (nombreIngresado.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Debes ingresar tu nombre", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intentDetalle = new Intent(MainActivity.this, DetalleActivity.class);
                    intentDetalle.putExtra("NOMBRE_USUARIO", nombreIngresado);
                    startActivity(intentDetalle);
                }
            }
        });

        // EVENTO EXPLÍCITO 2: Ir a Configuración
        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentConfig = new Intent(MainActivity.this, ConfigActivity.class);
                startActivity(intentConfig);
            }
        });

        // EVENTO EXPLÍCITO 3: Ir a Ayuda
        btnAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAyuda = new Intent(MainActivity.this, AyudaActivity.class);
                startActivity(intentAyuda);
            }
        });
    }
}