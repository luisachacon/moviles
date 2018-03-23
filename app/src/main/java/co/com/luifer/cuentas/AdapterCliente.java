package co.com.luifer.cuentas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Luifer on 16/03/2018.
 */

public class AdapterCliente extends RecyclerView.Adapter<AdapterCliente.ViewHolderDatos> implements View.OnClickListener{

    ArrayList<LlenarDatosCliente> llenarCliente=new ArrayList<>();
    private  View.OnClickListener listener;

    public AdapterCliente(ArrayList<LlenarDatosCliente> listCliente){
        this.llenarCliente=listCliente;
    }

    public void setOnclickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_cliente,null,false);
        view.setOnClickListener(this);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.nombre.setText(llenarCliente.get(position).getNombre());

    }

    @Override
    public int getItemCount() {
        return llenarCliente.size() ;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView nombre;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.nombreCliente);

        }
    }

}
