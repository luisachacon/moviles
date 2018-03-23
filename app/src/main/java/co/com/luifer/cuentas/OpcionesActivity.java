package co.com.luifer.cuentas;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OpcionesActivity extends AppCompatActivity {
    ClienteFragment fragmentcliente;
    RevistaFragment fragmentrevista;
    CuentaFragment fragmentcuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        fragmentcliente=new ClienteFragment();
        fragmentcuenta=new CuentaFragment();
        fragmentrevista=new RevistaFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragmento,fragmentcliente).commit();
    }

    public void onClick(View view) {

        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

        switch (view.getId()){

            case R.id.clientboton:
                Toast.makeText(getBaseContext(),"noooo entroooo",Toast.LENGTH_SHORT).show();
                transaction.replace(R.id.contenedorFragmento,fragmentcliente);
                break;
            case R.id.Cuentaboton:
                transaction.replace(R.id.contenedorFragmento,fragmentcuenta);
                break;
            case R.id.revistboton:
                transaction.replace(R.id.contenedorFragmento,fragmentrevista);
                break;
        }
        transaction.commit();

    }
}
