package org.ar.miguel.E47;

public class Vocal {
    String nombre;
    int cantidad;

    public Vocal(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Vocal() {
    }

    public Vocal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void increaseCantidad() {
        this.cantidad++;
    }

    @Override
    public String toString() {
        return "Vocal{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
