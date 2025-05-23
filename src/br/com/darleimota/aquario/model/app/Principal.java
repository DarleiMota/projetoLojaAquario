package br.com.darleimota.aquario.model.app;

import br.com.darleimota.aquario.model.ambientes.AquarioAguaDoce;
import br.com.darleimota.aquario.model.animal.PeixeAguaDoce;

public class Principal {

    public static void main(String[] args) {

        AquarioAguaDoce aquario = new AquarioAguaDoce();
        aquario.adicionarAnimal(new PeixeAguaDoce("Dourado", 3,"Peixe de Escama",
                "Rapido e forte, cor dourada",7.0, 26));
        aquario.listarAnimal();

    }
}
