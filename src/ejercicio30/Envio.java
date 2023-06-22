package ejercicio30;

public class Envio {

    private String fecha_envio;
    private String direccion_envio;

    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "fecha_envio='" + fecha_envio + '\'' +
                ", direccion_envio='" + direccion_envio + '\'' +
                '}';
    }
}
