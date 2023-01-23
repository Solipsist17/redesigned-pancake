package com.ejercicio;

public class SmartWatch extends SmartDevice{
    String sistemaOperativo;
    String acabado;
    double pantallaPulgadas;
    int peso;
    double precio;
    public SmartWatch(){
    }

    public SmartWatch(String sistemaOperativo, String acabado, double pantallaPulgadas, int peso, double precio) {
        this.sistemaOperativo = sistemaOperativo;
        this.acabado = acabado;
        this.pantallaPulgadas = pantallaPulgadas;
        this.peso = peso;
        this.precio = precio;
    }

    public void conectarBluetooth(String sistemaOperativo){
        super.conectarseRed();
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", acabado='" + acabado + '\'' +
                ", pantallaPulgadas=" + pantallaPulgadas +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
}
