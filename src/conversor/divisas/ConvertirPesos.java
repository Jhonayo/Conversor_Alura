package conversor.divisas;

import javax.swing.*;

public class ConvertirPesos implements TasaCambio{

    public void ConvertirPesosADolares(double valor) {
        double pesoDollar = valor * CLP_Dolar;
        pesoDollar = (double) Math.round(pesoDollar * 100d)/100;
        JOptionPane.showMessageDialog(null, valor+ " Pesos equivalen a : " + pesoDollar + " Dolares");
    }
    public void ConvertirPesosAEuro(double valor) {
        double pesoEuro = valor * CLP_Euro;
        pesoEuro = (double) Math.round(pesoEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, valor+ " Pesos equivalen a : " + pesoEuro + " Euros");
    }
    public void ConvertirPesosALibras(double valor) {
        double pesoLibra = valor * CLP_Libra;
        pesoLibra = (double) Math.round(pesoLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, valor+ " Pesos equivalen a : " + pesoLibra + " Libras");
    }
    public void ConvertirPesosAYen(double valor) {
        double pesoYen = valor * CLP_Yen;
        pesoYen = (double) Math.round(pesoYen * 100d)/100;
        JOptionPane.showMessageDialog(null, valor+ " Pesos equivalen a : " + pesoYen + " Yuanes");
    }
    public void ConvertirPesosAWonCoreano(double valor) {
        double pesoWonCoreano = valor * CLP_Won;
        pesoWonCoreano = (double) Math.round(pesoWonCoreano * 100d)/100;
        JOptionPane.showMessageDialog(null, valor+ " Pesos equivalen a : " + pesoWonCoreano + " Wones");
    }




}
