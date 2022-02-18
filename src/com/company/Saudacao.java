package com.company;

public class Saudacao {

    public static String cumprimentar(int hr){
        if (hr >= 4 && hr < 12){
            return "Bom dia";
        }else if (hr >= 12 && hr < 18){
            return "Boa Tarde";
        }else if ((hr >= 18 && hr < 24)||(hr >= 1 && hr < 4)){
            return "Boa Noite";
        }else {
            return "Hora invalida";
        }
    }

}
