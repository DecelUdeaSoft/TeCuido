package Web_empresa;

public class empleado{
    private String nombre;
    private String correo;
    private String empresa;
    private String rolempleado;

    public empleado(String nombre, String correo, String empresa, String rolempleado){
        this.nombre = nombre;
        this.setCorreo(correo);
        this.setEmpresa(empresa);
        this.setRolempleado(rolempleado);
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

    public String getRolempleado() {
        return rolempleado;
    }

    public void setRolempleado(String rolempleado) {
        this.rolempleado = rolempleado;
    }




