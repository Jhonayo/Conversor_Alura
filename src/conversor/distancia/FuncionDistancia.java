package conversor.distancia;

import javax.swing.*;

public class FuncionDistancia {

    ConvertirDistancia distancia = new ConvertirDistancia();

    public void convertirDistancia (double minput){

        String seleccionConversion = (JOptionPane.showInputDialog(null, "elije la unidad de medida de distancia a convertir","Distancia",
                JOptionPane.PLAIN_MESSAGE,null, new Object[]
                        {"Pulgadas a Centimetros","Centimetros a Pulgadas", "Pie a Centimetros","Centimetros a Pie", "Millas a Metros","Metros a Millas",
                                "Yardas a Metros","Metros a Yardas", "Metros a Kilometros","Kilometros a Metros","Centimetros a Metros","Metros a Centimetros"},
                "Selection")).toString();

        switch (seleccionConversion){
            case "Pulgadas a Centimetros":
                distancia.pulgadasACentimetros(minput);
                break;
            case "Centimetros a Pulgadas":
                distancia.centimetroAPulgada(minput);
                break;
            case "Pie a Centimetros":
                distancia.pieACentimetro(minput);
                break;
            case "Centimetros a Pie":
                distancia.centimetroAPie(minput);
                break;
            case "Millas a Metros":
                distancia.millaAMetro(minput);
                break;
            case "Metros a Millas":
                distancia.metrosAMillas(minput);
                break;
            case "Yardas a Metros":
                distancia.yardaAMetro(minput);
                break;
            case "Metros a Yardas":
                distancia.metroAYarda(minput);
                break;
            case "Metros a Kilometros":
                distancia.metroAKilometro(minput);
                break;
            case "Kilometros a Metros":
                distancia.kilometrosAMetros(minput);
                break;
            case "Centimetros a Metros":
                distancia.centimetrosAMetros(minput);
                break;
            case "Metros a Centimetros":
                distancia.metrosACentimetros(minput);
                break;
        }



    }
}
