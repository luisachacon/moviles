package co.com.luifer.cuentas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Registro extends AppCompatActivity {

    Spinner spinner;
    Button botonRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        botonRegistro= findViewById(R.id.registrar_usuario);
        spinner= findViewById(R.id.spinerSeleccion);

        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Registro.this,Principal_activity.class);
                startActivity(intent);
            }
        });

        ArrayList list=new ArrayList();
        list.add("Cliente");
        list.add("Consultor");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Registro.this,"Position"+String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        OkHttpClient cliente = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add("nombre", "Ana")
                .add("telefono", "1235")
                .add("cédula", "63346")
                .add("dirección", "cll5")
                .add("rol", "cliente")
                .build();

        Request request = new Request.Builder()
                .url("http://172.17.27.217:8080/saveOrUpdate")
                .post(formBody)
                .build();

        cliente.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                    String rta = response.body().string(); //{"success":1,"message":"Has hecho el reporte existosamente."}

                }
            }
        });

    }
}
