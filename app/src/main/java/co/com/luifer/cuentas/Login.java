

package co.com.luifer.cuentas;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button ingresarUsuario=findViewById(R.id.ingresarUsuarioLogin);

  ingresarUsuario.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intento= new Intent(Login.this,Principal_activity.class);
          startActivity(intento);
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
