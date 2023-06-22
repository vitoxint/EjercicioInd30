package ejercicio30;

public class Pago {

    private String fecha_pago;
    private double importe;
    private String direccion_facturacion;

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getDireccion_facturacion() {
        return direccion_facturacion;
    }

    public void setDireccion_facturacion(String direccion_facturacion) {
        this.direccion_facturacion = direccion_facturacion;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "fecha_pago='" + fecha_pago + '\'' +
                ", importe=" + importe +
                ", direccion_facturacion='" + direccion_facturacion + '\'' +
                '}';
    }
}
