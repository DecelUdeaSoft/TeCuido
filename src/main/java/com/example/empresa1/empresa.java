package com.example.empresa1;

public class empresa {
    private String nombre;
    private String  direccion;
    private Float telefono;
    private Float nit;

    public empresa(String nombre, String direccion, Float telefono, float nit){
        this.nombre = nombre;
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setNit(nit);
    }

    public String getNombre (){
        return this.nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Float getTelefono() {
        return telefono;
    }

    public void setTelefono(Float telefono) {
        this.telefono = telefono;
    }

    public Float getNit() {
        return nit;
    }

    public void setNit(Float nit) {
        this.nit = nit;
    }
}
