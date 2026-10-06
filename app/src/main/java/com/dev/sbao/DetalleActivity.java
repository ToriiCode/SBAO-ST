package com.dev.sbao;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    private TextView tvBienvenida;
    private Button btnVercel, btnInstagram, btnLlamar, btnCorreo, btnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tvBienvenida = findViewById(R.id.tvBienvenida);
        btnVercel = findViewById(R.id.btnVercel);
        btnInstagram = findViewById(R.id.btnInstagram);
        btnLlamar = findViewById(R.id.btnLlamar);
        btnCorreo = findViewById(R.id.btnCorreo);
        btnMapa = findViewById(R.id.btnMapa);

        // RECIBIR EL DATO EXPLÍCITO DE LA PANTALLA ANTERIOR
        String nombre = getIntent().getStringExtra("NOMBRE_USUARIO");
        if (nombre != null) {
            tvBienvenida.setText("Bienvenido al Hub, " + nombre);
        }

        // EVENTO IMPLÍCITO 1: Abrir URL de Vercel (ACTION_VIEW)
        btnVercel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tu-proyecto.vercel.app"));
                startActivity(intentWeb);
            }
        });

        // (Bonus) Abrir Instagram (Mismo tipo de intent que el anterior)
        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentIg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/santo_tomas"));
                startActivity(intentIg);
            }
        });

        // EVENTO IMPLÍCITO 2: Abrir Marcador Telefónico (ACTION_DIAL)
        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLlamar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+56912345678"));
                startActivity(intentLlamar);
            }
        });

        // EVENTO IMPLÍCITO 3: Enviar Correo (ACTION_SENDTO)
        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCorreo = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:contacto@sbao.cl"));
                intentCorreo.putExtra(Intent.EXTRA_SUBJECT, "Contacto desde la App");
                startActivity(intentCorreo);
            }
        });

        // EVENTO IMPLÍCITO 4: Abrir Google Maps (geo:)
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Coordenadas de ejemplo (Centro de Santiago), pon las de tu sede
                Intent intentMapa = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-33.4372,-70.6506?q=Santo+Tomas"));
                startActivity(intentMapa);
            }
        });
    }
}