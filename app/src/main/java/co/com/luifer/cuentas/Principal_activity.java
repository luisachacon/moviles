package co.com.luifer.cuentas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal_activity extends AppCompatActivity {
Button cuentas,cliente, revista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_activity);

        cuentas=findViewById(R.id.opciones_cuenta_principal);
        cliente=findViewById(R.id.opciones_cliente_principal);
        revista=findViewById(R.id.opciones_Revista_principal);

        cuentas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Principal_activity.this,CuentaFragment.class);
                startActivity(intent);
            }
        });
        cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento= new Intent(Principal_activity.this,ClienteFragment.class);
                startActivity(intento);
            }
        });
        revista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento= new Intent(Principal_activity.this,Revista.class);
                startActivity(intento);
            }
        });
    }
}
