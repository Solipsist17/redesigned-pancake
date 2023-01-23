package com.ejercicio;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice("CR1000-X",50,true,false);
        SmartPhone smartPhone = new SmartPhone("Android","Negro",71.5,146.7,
                7.4,162,256,6.1,600);
        SmartWatch smartWatch = new SmartWatch("IOS","Rojo",1.81,
                200,40);

        System.out.println(smartDevice.toString());
        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());
    }
}
