package com.example.dailyphrases;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] frases = {
      "Frase 01",
      "Frase 02",
      "Frase 03",
      "Frase 04",
      "Frase 05",
      "Frase 06",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textFrases);
        int randomNumber = new Random().nextInt(6);
        String frase = frases[randomNumber];
        texto.setText(frase);

    }

    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textFrases);
        StringBuilder textoResultado = new StringBuilder();
        for(String frase : frases){
            textoResultado.append(frase);
            textoResultado.append("\n");
        }
        texto.setText(textoResultado);
    }

}