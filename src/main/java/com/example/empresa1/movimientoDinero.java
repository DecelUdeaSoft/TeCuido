package com.example.empresa1;

public class movimientoDinero {
    private Float montoDinero;
    private Float monto;
    private String concepto;
    private Float registro;

    public movimientoDinero(Float montoDinero, Float monto, String concepto, Float registro){
        this.montoDinero = montoDinero;
        this.setMonto(monto);
        this.setConcepto(concepto);
        this.setRegistro(registro);
    }

    public Float getMontoDinero(){
        return this.montoDinero;
    }
    public void setMontoDinero(float montoDinero){
        this.montoDinero = montoDinero;
    }


    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Float getRegistro() {
        return registro;
    }

    public void setRegistro(Float registro) {
        this.registro = registro;
    }
}
