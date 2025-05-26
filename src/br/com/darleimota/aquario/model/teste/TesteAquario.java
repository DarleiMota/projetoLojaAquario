package br.com.darleimota.aquario.model.teste;

import br.com.darleimota.aquario.model.ambientes.Aquario;
import br.com.darleimota.aquario.model.ambientes.AquarioAguaDoce;
import br.com.darleimota.aquario.model.animal.PeixeAguaDoce;
import br.com.darleimota.aquario.model.animal.PeixeAguaSalgada;
import br.com.darleimota.aquario.model.animal.ReptilTerrario;

public class TesteAquario {

    public static void main(String[] args) {

        PeixeAguaDoce tetraNeon = new PeixeAguaDoce("TetraNeon", 1, "Peixe pequeno e colorido", "Peixe ornamental", 6.8, 24,"Brincalhão gosta de nadar meio aquario");
        PeixeAguaDoce paulistinha = new PeixeAguaDoce("Paulistinha", 1, "Peixe de Escama", "Agil e resistente", 7.2, 25,"Muito ativo otimo para plantados");
        PeixeAguaSalgada nemo = new PeixeAguaSalgada("Nemo", 2, "Peixe Palhaço", "Laranja e branco", 8.2, 27, "Vive dentro de uma anemola");
        ReptilTerrario iguana = new ReptilTerrario("Iguana", 5, "Iguana Verde", "Herbívora", 6, true,"Come insetos e gosta de ficar em rochas");

        Aquario aguaDoce = new AquarioAguaDoce();
        System.out.println("\n--- Teste Aquario de Agua Doce ---");
        aguaDoce.adicionarAnimal(tetraNeon);
        aguaDoce.adicionarAnimal(paulistinha);
        aguaDoce.listarAnimal();
        aguaDoce.buscarAnimal("betta");
        aguaDoce.buscarAnimal("paulistinha");
        aguaDoce.removerAnimal("TetraNeon");
        aguaDoce.listarAnimal();

    }
}