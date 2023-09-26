package conversor.validadores;


import javax.swing.*;

public class Validador {

    protected static boolean validarNumero(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    protected static boolean validarDivisa(double Minput) {
        if (Minput >= 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Valor no puedes ser igual a cero o un valor negativo");
            return false;
        }
    }
}
    

