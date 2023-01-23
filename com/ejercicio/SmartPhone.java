package com.ejercicio;

public class SmartPhone extends SmartDevice{
    String sistemaOperativo;
    String acabado;
    double anchura;
    double altura;
    double grosor;
    int peso;
    int capacidad;
    double pantallaPulgadas;
    double precio;

    public SmartPhone(){
    }

    public SmartPhone(String sistemaOperativo, String acabado, double anchura, double altura,
                      double grosor, int peso, int capacidad, double pantallaPulgadas, double precio) {
        this.sistemaOperativo = sistemaOperativo;
        this.acabado = acabado;
        this.anchura = anchura;
        this.altura = altura;
        this.grosor = grosor;
        this.peso = peso;
        this.capacidad = capacidad;
        this.pantallaPulgadas = pantallaPulgadas;
        this.precio = precio;
    }
    public void conectarseWifi(String sistemaOperativo){
        super.conectarseRed();
    }
    public void conectarseBluetooth(String sistemaOperativo){
        super.conectarseRed();
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", acabado='" + acabado + '\'' +
                ", anchura=" + anchura +
                ", altura=" + altura +
                ", grosor=" + grosor +
                ", peso=" + peso +
                ", capacidad=" + capacidad +
                ", pantallaPulgadas=" + pantallaPulgadas +
                ", precio=" + precio +
                '}';
    }
}
