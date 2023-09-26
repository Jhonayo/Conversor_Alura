package conversor.distancia;

import conversor.temperatura.MedidasdeConversionDistancia;

import javax.swing.*;

public class ConvertirDistancia implements MedidasdeConversionDistancia {

    public double pulgadasACentimetros(double minput){
        double centimetro = minput * pulgadaCentimetro;
        centimetro = (double) Math.round(centimetro*100d)/100;
        JOptionPane.showMessageDialog(null,minput+" pulgadas son: "+centimetro+" centimetros" );
        return centimetro;
    }
    public double centimetroAPulgada(double minput){
        double pulgada = minput * centimetroPulgada;
        pulgada = (double) Math.round(pulgada*100d)/100;
        JOptionPane.showMessageDialog(null,minput+" centimetros son: "+pulgada+" pulgadas" );
        return pulgada;
    }
    public double pieACentimetro(double minput){
        double centimetro = minput * pieCentimetro;
        centimetro=(double) Math.round(centimetro*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" pies son: "+centimetro+" centimetros");
        return centimetro;
    }
    public double centimetroAPie(double minput){
        double pie = minput * centimetroPie;
        pie = (double) Math.round(pie*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" centimetros son : "+pie+" pies");
        return pie;
    }
    public double millaAMetro(double minput){
        double metro = minput * millaMetro;
        metro = (double) Math.round(metro*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" millas son : "+metro+" metros");
        return metro;
    }
    public double metrosAMillas(double minput){
        double millas = minput * metroMilla;
        millas = (double) Math.round(millas*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" metros son : "+millas+" millas");
        return millas;
    }
    public double yardaAMetro(double minput){
        double metro = minput * yardaMetro;
        metro = (double) Math.round(metro*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" yardas son : "+metro+" metros");
        return metro;
    }
    public double metroAYarda(double minput){
        double yarda = minput * metroYarda;
        yarda = (double) Math.round(yarda*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" metros son : "+yarda+" yardas");
        return yarda;
    }
    public double metroAKilometro(double minput){
        double kilometro = minput * metroKilometro;
        kilometro = (double) Math.round(kilometro*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" metros son : "+kilometro+" kilometros");
        return kilometro;
    }
    public double kilometrosAMetros(double minput){
        double kilometros = minput * kilometroMetro;
        kilometros = (double) Math.round(kilometros*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" kilometros son : "+kilometros+" metros");
        return kilometros;
    }
    public double centimetrosAMetros(double minput){
        double metros = minput * centimetroMetro;
        metros = (double) Math.round(metros*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" centimetros son : "+metros+" metros");
        return metros;
    }
    public double metrosACentimetros(double minput){
        double centimetros = minput * metroCentimetro;
        centimetros = (double) Math.round(centimetros*100d)/100;
        JOptionPane.showMessageDialog(null, minput+" metros son : "+centimetros+" centimetros");
        return centimetros;
    }
}
