package cl.isisur.quillone_ando;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button button2,button4,button7,button5,button6,button8,button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button2 = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button4);
        button7 = (Button) findViewById(R.id.button7);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button8 = (Button) findViewById(R.id.button8);
        button15 = (Button) findViewById(R.id.button15);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity3.this,MapsActivity.class);
                startActivity(Intent16);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity3.this,Mapaactivity1.class);
                startActivity(Intent16);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity3.this,Mainmapa2.class);
                startActivity(Intent16);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity3.this,Mapaactivity3.class);
                startActivity(Intent16);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity3.this,Mapaactivity4.class);
                startActivity(Intent16);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity3.this,Mapaactivity5.class);
                startActivity(Intent16);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(Intent16);
            }
        });
    }
}