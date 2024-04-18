package controller;
public class BeloHorizonteStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(Imovel imovel) {
        return imovel.getAreaTotal() * 7 + imovel.getNumeroQuartos() * 4;
    }
}