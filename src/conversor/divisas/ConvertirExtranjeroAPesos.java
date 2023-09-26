package conversor.divisas;

import javax.swing.*;

public class ConvertirExtranjeroAPesos implements TasaCambio {
//"De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"
    public void ConvertirDollarAPesosCLP(double valor) {
        double DollarCLP = valor / CLP_Dolar;
        DollarCLP = (double) Math.round(DollarCLP * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor+ " Dolares equivalen a : " + DollarCLP + " Pesos");
    }
    public void ConvertirEuroAPesosCLP(double valor) {
        double EuroCLP = valor / CLP_Euro;
        EuroCLP = (double) Math.round(EuroCLP * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor+ " Euros equivalen a : " + EuroCLP + " Pesos");
    }
    public void ConvertirLibraAPesosCLP(double valor) {
        double LibraCLP = valor / CLP_Libra;
        LibraCLP = (double) Math.round(LibraCLP * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor+ " Libras equivalen a : " + LibraCLP + " Pesos");
    }

    public void ConvertirYenAPesosCLP(double valor) {
        double YenCLP = valor / CLP_Yen;
        YenCLP = (double) Math.round(YenCLP * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor+ " Yuanes equivalen a : " + YenCLP + " Pesos");
    }

    public void ConvertirWonAPesosCLP(double valor) {
        double WonCLP = valor / CLP_Won;
        WonCLP = (double) Math.round(WonCLP * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor+ " Wones equivalen a : " + WonCLP + " Pesos");
    }
}
