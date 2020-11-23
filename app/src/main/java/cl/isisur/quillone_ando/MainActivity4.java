package cl.isisur.quillone_ando;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    private Button button9,button10,button11,button12,button13,button14,btnvolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        btnvolver = (Button) findViewById(R.id.btnvolver);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity4.this,Mapaactivity6.class);
                startActivity(Intent16);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity4.this,Mapaactivity7.class);
                startActivity(Intent16);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity4.this,Mapaactivity8.class);
                startActivity(Intent16);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity4.this,Mapaactivity9.class);
                startActivity(Intent16);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity4.this,Mapaactivity10.class);
                startActivity(Intent16);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity4.this,Mapaactivity11.class);
                startActivity(Intent16);
            }
        });
        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(Intent16);
            }
        });
    }
}