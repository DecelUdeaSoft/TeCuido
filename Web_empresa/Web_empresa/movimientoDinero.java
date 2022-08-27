package Web_empresa;

public class movimientoDinero {
    private Double  montoDinero;
    private Double monto;
    private String concepto;
    private String  registro;

    public movimientoDinero(Double montoDinero, Double monto, String concepto, String  registro){
        this.montoDinero = montoDinero;
        this.setMonto(monto);
        this.setConcepto(concepto);
        this.setRegistro(registro);
    }

    public Double getMontoDinero(){

        return this.montoDinero;
    }
    public void setMontoDinero(Double montoDinero){

        this.montoDinero = montoDinero;
    }


    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String  getRegistro() {
        return registro;
    }

    public void setRegistro(String  registro) {
        this.registro = registro;
    }
}
