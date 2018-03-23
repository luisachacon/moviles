package co.com.luifer.cuentas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luifer on 17/03/2018.
 */

public class AdapterProducto extends RecyclerView.Adapter<AdapterProducto.ViewHolderDatos> implements View.OnClickListener{

    ArrayList<Producto> llenarProducto=new ArrayList<>();
    private  View.OnClickListener listener;

    public AdapterProducto(ArrayList<Producto> listProduct)
    {
        this.llenarProducto=listProduct;
    }

    @Override
    public AdapterProducto.ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.descripcion_cuenta,null,false);
        view.setOnClickListener(this);
        return new AdapterProducto.ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
         holder.nombre.setText(llenarProducto.get(position).getNombre());
         holder.cantidad.setText(Integer.toString(llenarProducto.get(position).getCantidad()));
         holder.precioUnidad.setText(Integer.toString((int) llenarProducto.get(position).getPrecioUnidad()));
         holder.porcentajeUnidad.setText(Integer.toString((int)llenarProducto.get(position).getPorcentajeUnidad()));
         holder.fotoProducto.setImageResource((llenarProducto.get(position).getFoto()));
         holder.porcentajeTotal.setText(Integer.toString((int)llenarProducto.get(position).getPorcentajeTotal()));
         holder.TotalAPagar.setText(Integer.toString((int)llenarProducto.get(position).getTotalAPagar()));
    }

    @Override
    public int getItemCount() {
        return llenarProducto.size();
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

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView nombre;
        TextView cantidad;
        TextView precioUnidad;
        TextView porcentajeUnidad;
        TextView porcentajeTotal;
        TextView TotalAPagar;
        ImageView fotoProducto;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.LlenarnombreProducto);
            cantidad=itemView.findViewById(R.id.Llenarcantidad);
            precioUnidad=itemView.findViewById(R.id.llenarprecio);
            porcentajeUnidad=itemView.findViewById(R.id.llenarporcentajeUnidad);
            porcentajeTotal=itemView.findViewById(R.id.llenarporcentajeTotal);
            TotalAPagar=itemView.findViewById(R.id.llenarprecioTotal);
            fotoProducto=itemView.findViewById(R.id.fotoProducto);

        }
    }
}
