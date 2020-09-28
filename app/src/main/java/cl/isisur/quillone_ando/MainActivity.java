package cl.isisur.quillone_ando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button MiBoton;
    private EditText MiNombre;
    private EditText MiApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiBoton = (Button) findViewById(R.id.btnAceptar);
        MiNombre = (EditText) findViewById(R.id.editadordenombre);
        MiApellido =(EditText) findViewById(R.id.EditarApellido);
        final Context context =getApplicationContext();
        MiBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MiNombre.getText();
                Toast mensaje =Toast.makeText(context,"Mi Nombre es : "+MiNombre.getText()+"  "+MiApellido.getText(),Toast.LENGTH_SHORT);
                mensaje.show();
                Intent MiIntent =new Intent(MainActivity.this,MainActivity2.class);
                MiIntent.putExtra("MiNombre1",MiNombre.getText()+"");
                MiIntent.putExtra("MiApellido1",MiApellido.getText()+"");
                startActivity(MiIntent);
            }
        });
    }
}