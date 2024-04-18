package controller;

public class SaoPauloStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(Imovel imovel) {
        return imovel.getAreaTotal() * 10 + imovel.getNumeroComodos() * 2;
    }
}