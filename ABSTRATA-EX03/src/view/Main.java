package view;

import controller.BeloHorizonteStrategy;
import controller.CuritibaStrategy;
import controller.Imovel;
import controller.ImpostoStrategy;
import controller.PortoAlegreStrategy;
import controller.SaoPauloStrategy;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel();
        imovel.setAreaTotal(100.0);
        imovel.setNumeroComodos(5);
        imovel.setNumeroQuartos(3);
        imovel.setAreaGaragem(20.0);
        imovel.setIdade(30);

        ImpostoStrategy saoPaulo = new SaoPauloStrategy();
        ImpostoStrategy beloHorizonte = new BeloHorizonteStrategy();
        ImpostoStrategy portoAlegre = new PortoAlegreStrategy();
        ImpostoStrategy curitiba = new CuritibaStrategy();

        System.out.println("Imposto em São Paulo: " + saoPaulo.calcularImposto(imovel));
        System.out.println("Imposto em Belo Horizonte: " + beloHorizonte.calcularImposto(imovel));
        System.out.println("Imposto em Porto Alegre: " + portoAlegre.calcularImposto(imovel));
        System.out.println("Imposto em Curitiba: " + curitiba.calcularImposto(imovel));
    }
}