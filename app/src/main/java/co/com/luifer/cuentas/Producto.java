package co.com.luifer.cuentas;

/**
 * Created by Luifer on 17/03/2018.
 */

public class Producto {

    private String nombre;
    private int cantidad;
    private int foto;
    private double precioUnidad;
    private double porcentajeUnidad;
    private  double porcentajeTotal;
    private double totalAPagar;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, double precioUnidad, double porcentajeUnidad, double porcentajeTotal, double totalAPagar, int foto) {
        this.foto=foto;
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precioUnidad=precioUnidad;
        this.porcentajeUnidad=porcentajeUnidad;
        this.porcentajeTotal=porcentajeTotal;
        this.totalAPagar=totalAPagar;
    }



    public double getPorcentajeUnidad() {
        return porcentajeUnidad;
    }

    public void setPorcentajeUnidad(double porcentajeUnidad) {
        this.porcentajeUnidad = porcentajeUnidad;
    }

    public double getPorcentajeTotal() {
        return porcentajeTotal;
    }

    public void setPorcentajeTotal(double porcentajeTotal) {
        this.porcentajeTotal = porcentajeTotal;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
