package controller;

public class PortoAlegreStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(Imovel imovel) {
        if (imovel.getAreaGaragem() > 0) {
            return imovel.getAreaTotal() * 7.5 + imovel.getAreaGaragem() * 2.5;
        } else {
            return imovel.getAreaTotal() * 8;
        }
    }
}
