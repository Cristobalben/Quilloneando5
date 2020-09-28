package cl.isisur.quillone_ando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button MiBotonA,MiBotonB;
    private TextView MiTvPrueba;
    private Button MiBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MiBoton = (Button) findViewById(R.id.btAceptar);
        String MiNombre=getIntent().getStringExtra("MiNombre1");
        String MiApellido=getIntent().getStringExtra("MiApellido1");
        final Context context =getApplicationContext();
        Toast mensaje =Toast.makeText(context,"Mi Nombre es : "+MiNombre+" "+MiApellido,Toast.LENGTH_SHORT);
        mensaje.show();
        MiBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MiIntent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(MiIntent);
            }
        });

        MiBotonA= (Button) findViewById(R.id.btModuloA);
        MiBotonB= (Button) findViewById(R.id.btModuloB);
        MiTvPrueba= (TextView) findViewById(R.id.tVPrueba);
        MiBotonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // acá el codigo para el boton A
                MiTvPrueba.setText("Modulo A");
                Intent MiIntentA = new Intent(MainActivity2.this,MainActivity3.class);
                MiIntentA.putExtra("Modulo","Hola Modulo A desde Modulo Uno");
                MiIntentA.putExtra("Numero",33);
                startActivity(MiIntentA);
            }
        });
        MiBotonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Acá el codigo para el boton B
                MiTvPrueba.setText("Modulo B");
                Intent MiIntentB = new Intent(MainActivity2.this,MainActivity4.class);
                MiIntentB.putExtra("Modulo","Hola Modulo B desde Modulo Uno");
                MiIntentB.putExtra("Numero",33);
                startActivity(MiIntentB);
            }
        });


    }
}