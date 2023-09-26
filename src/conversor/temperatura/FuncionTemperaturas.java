package conversor.temperatura;

import javax.swing.*;

public class FuncionTemperaturas {

     ConvertirTemperatura temperatura = new ConvertirTemperatura();


    public void convertirTemperatura(double Minput) {

        String seleccionConversion = (JOptionPane.showInputDialog(null, "Elije una opción de medida de Temperatura a convertir ", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Grados Celcius a Grados Fahrenheit", "Grados Celcius a Kelvin",
                                "Grados Fahrenheit a Grados Celcius","Grados Fahrenheit a Grados Kelvin",
                                "Grados Kelvin a Grados Celcius", "Grados Kelvin a Grados Fahrenheit"}, "Seleccion")).toString();


        switch (seleccionConversion){
            case "Grados Celcius a Grados Fahrenheit":
                temperatura.CelciusAFahrenheit(Minput);
                break;
            case "Grados Celcius a Kelvin":
                temperatura.CelciusAKelvin(Minput);
                break;
            case "Grados Fahrenheit a Grados Celcius":
                temperatura.FahrenheitACelcius(Minput);
                break;
            case "Grados Fahrenheit a Grados Kelvin":
                temperatura.FahrenheitAKelvin(Minput);
                break;
            case "Grados Kelvin a Grados Celcius":
                temperatura.KelvinACelcius(Minput);
                break;
            case "Grados Kelvin a Grados Fahrenheit":
                temperatura.KelvinAFahrenheit(Minput);
                break;
        }

    }
}
