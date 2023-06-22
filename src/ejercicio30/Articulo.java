package ejercicio30;

public class Articulo {

    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ejercicio30.Articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
