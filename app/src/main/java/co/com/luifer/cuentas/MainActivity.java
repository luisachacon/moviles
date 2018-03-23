package co.com.luifer.cuentas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ingreso=findViewById(R.id.MainbotonIngresar);
        Button registro=findViewById(R.id.botonregistro);

                ingreso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intento= new Intent(MainActivity.this,Login.class);
                        startActivity(intento);


                    }
                });
                registro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(MainActivity.this,Registro.class);
                        startActivity(intent);
                    }
                });
    }
}
