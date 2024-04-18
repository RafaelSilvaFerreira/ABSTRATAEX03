package controller;
public class CuritibaStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(Imovel imovel) {
        double imposto = imovel.getAreaTotal() * 5;
        int idadeImovel = imovel.getIdade();

        if (idadeImovel > 50) {
            imposto += idadeImovel * 3;
        } else if (idadeImovel < 20) {
            imposto += idadeImovel * 2;
        } else {
            imposto += idadeImovel * 2.5;
        }

        return imposto;
    }
}