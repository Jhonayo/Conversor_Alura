package conversor.divisas;

import javax.swing.*;

public class FuncionDivisas {

    ConvertirPesos pesos = new ConvertirPesos();
    ConvertirExtranjeroAPesos divisa = new ConvertirExtranjeroAPesos();

    public void convertirMonedas(double Minput) {

        String seleccionCambio = (JOptionPane.showInputDialog(null, "Elije la moneda a la que desea convertir su dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"},
                "Seleccion")).toString();

        switch (seleccionCambio){
            case "De Pesos a Dólar":
                pesos.ConvertirPesosADolares(Minput);
                break;
            case "De Pesos a Euro":
                pesos.ConvertirPesosAEuro(Minput);
                break;
            case "De Pesos a Libras":
                pesos.ConvertirPesosALibras(Minput);
                break;
            case "De Pesos a Yen":
                pesos.ConvertirPesosAYen(Minput);
                break;
            case "De Pesos a Won Coreano":
                pesos.ConvertirPesosAWonCoreano(Minput);
                break;
            case "De Dólar a Pesos":
                divisa.ConvertirDollarAPesosCLP(Minput);
                break;
            case "De Euro a Pesos":
                divisa.ConvertirEuroAPesosCLP(Minput);
                break;
            case "De Libras a Pesos":
                divisa.ConvertirLibraAPesosCLP(Minput);
                break;
            case "De Yen a Pesos":
                divisa.ConvertirYenAPesosCLP(Minput);
                break;
            case "De Won Coreano a Pesos":
                divisa.ConvertirWonAPesosCLP(Minput);
                break;

        }

    }
}
