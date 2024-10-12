package ies.camas.mevoydeviajerepaso;

import android.os.Bundle;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    RadioGroup rgDestino, rgTransporte;
    Button btnInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgDestino = findViewById(R.id.rgDestino);
        rgTransporte = findViewById(R.id.rgTransporte);

        btnInfo = findViewById(R.id.btninformacion);

        btnInfo.setOnClickListener(view -> info());

    }
    public void info(){
       int destino = rgDestino.getCheckedRadioButtonId();
       int transporte = rgTransporte.getCheckedRadioButtonId();

       RadioButton destinoElegido = findViewById(destino);
       RadioButton transporteElegido = findViewById(transporte);

       String destinoFinal = destinoElegido.getText().toString();
       String transporteFinal = transporteElegido.getText().toString();

       Toast.makeText(this, "Me voy  a " +destinoFinal +" en " + transporteFinal , Toast.LENGTH_LONG).show();
    }
}