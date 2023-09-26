package conversor.aplicacion;

import conversor.distancia.FuncionDistancia;
import conversor.divisas.FuncionDivisas;
import conversor.temperatura.FuncionTemperaturas;
import conversor.validadores.Validador;

import javax.swing.*;

public class Portada extends Validador {


    public static void main(String[] args) {

        FuncionDivisas monedas = new FuncionDivisas();
        FuncionTemperaturas temperatura = new FuncionTemperaturas();
        FuncionDistancia distancia = new FuncionDistancia();

        String input;

        while (true) {
            String opciones = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                    "Conversor", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Conversor de Divisas", "Conversor de Temperatura","Conversor de Distancia"}, "Seleccion");

            input = JOptionPane.showInputDialog(null,"Ingrese el valor que desea convertir: ");


            if (validarNumero(input)) {
                double Minput = Double.parseDouble(input);

                switch (opciones){
                    case"Conversor de Divisas":
                        if(validarDivisa(Minput)){
                            monedas.convertirMonedas(Minput);
                        }
                        break;
                    case"Conversor de Temperatura":
                        temperatura.convertirTemperatura(Minput);
                        break;

                    case"Conversor de Distancia":
                        distancia.convertirDistancia(Minput);
                        break;
                }

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                if (respuesta != JOptionPane.OK_OPTION) {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido");

            }
        }
    }
}
