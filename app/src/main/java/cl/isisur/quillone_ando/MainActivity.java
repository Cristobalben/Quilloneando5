package cl.isisur.quillone_ando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import cl.isisur.quillone_ando.modelo.Usuarios;

public class MainActivity extends AppCompatActivity {
    private Button MiBoton;
    private EditText MiNombre;
    private EditText MiApellido;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiBoton = (Button) findViewById(R.id.MiBoton);
        MiNombre = (EditText) findViewById(R.id.MiNombre);
        MiApellido =(EditText) findViewById(R.id.MiApellido);
        final Context context =getApplicationContext();
        inicializarFireBase();
        MiBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuarios usuarios= new Usuarios(UUID.randomUUID().toString(),MiNombre.getText().toString(),MiApellido.getText().toString());
                databaseReference.child("Usuarios").child(usuarios.getId_usuario()).setValue(usuarios);
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
    private void inicializarFireBase(){
        FirebaseApp.initializeApp(this);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();


    }
}