package com.example.empresa1;

public class empleado{
    private String nombre;
    private String correo;
    private String empresa;
    private boolean rolempleado;

    public empleado(String nombre, String correo, String empresa, Boolean rolempleado){
        this.nombre = nombre;
        this.correo  = correo;
        this.empresa = empresa;
        this.rolempleado = rolempleado;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean getrolempleado() {
        return rolempleado;
    }

    public void setNit(boolean rolempleado) {
        this.rolempleado = rolempleado;
    }
}
