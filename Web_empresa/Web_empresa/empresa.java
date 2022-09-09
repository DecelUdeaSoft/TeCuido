package Web_empresa;

public class empresa {
    private String nombre;
    private String  direccion;
    private String telefono;
    private String nit;

    public empresa(String nombre, String direccion, String telefono, String nit){
        this.nombre = nombre;
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setNit(nit);
    }
// logre clonar las clases con github desktop
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
