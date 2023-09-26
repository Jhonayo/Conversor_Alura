package conversor.temperatura;

import javax.swing.*;

public class ConvertirTemperatura {
    public double CelciusAFahrenheit(double minput) {
        double Fahrenheit = (minput * 1.8) + 32;
        Fahrenheit = (double) Math.round(Fahrenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +minput+ " Grados Celcius son " +Fahrenheit+ " Grados Farenheit ");
        return Fahrenheit;
    }

    public double CelciusAKelvin(double minput) {
        double kelvin = minput + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +minput+ " Grados Celcius son " +kelvin+ " Grados Kelvin");
        return  kelvin;
    }

    public double FahrenheitACelcius(double minput) {
        double celcius = (minput - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +minput+ " Grados Farenheit son " +celcius+ " Grados Celcius");
        return celcius;
    }

    public double FahrenheitAKelvin(double minput) {
        double Fahrenheitkelvin = (((minput+ 459.67)*5)/9);
        Fahrenheitkelvin	= (double) Math.round(Fahrenheitkelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +minput+ " Grados Farenheit son " +Fahrenheitkelvin+ " Grados Kelvin");
        return Fahrenheitkelvin;
    }
    public double KelvinACelcius(double minput) {
        double kelvinCelcius = minput - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
        JOptionPane.showMessageDialog(null, +minput+ " Grados Kelvin " +kelvinCelcius+ " Grados Celcius");
        return kelvinCelcius;
    }

    public double KelvinAFahrenheit (double minput) {
        double kelvinFahrenheit = (minput * 9/5)-459.67;
        kelvinFahrenheit	= (double) Math.round(kelvinFahrenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +minput+ " Grados Kelvin " +kelvinFahrenheit+ " Grados Farenheit");
        return kelvinFahrenheit;
        }
    }



