package com.ejercicio;

public class SmartDevice {
    String modelo;
    int Bateria;
    boolean encendido;
    boolean autonomo;
    public SmartDevice(){

    }
    public SmartDevice(String modelo,int Bateria, boolean encendido, boolean autonomo){
        this.modelo = modelo;
        this.Bateria = Bateria;
        this.encendido = encendido;
        this.autonomo = autonomo;
    }

    public void conectarseRed(){

    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", Bateria=" + Bateria +
                ", encendido=" + encendido +
                ", autonomo=" + autonomo +
                '}';
    }
}
