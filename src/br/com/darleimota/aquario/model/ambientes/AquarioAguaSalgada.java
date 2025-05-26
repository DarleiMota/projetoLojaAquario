package br.com.darleimota.aquario.model.ambientes;

import br.com.darleimota.aquario.model.animal.Animal;
import br.com.darleimota.aquario.model.animal.PeixeAguaSalgada;

public class AquarioAguaSalgada extends AquarioBase {

    @Override
    public void adicionarAnimal(Animal animal) {
        if (animal instanceof PeixeAguaSalgada) {
            super.adicionarAnimal(animal);
        } else {
            System.out.println("Somente peixes de água salgada são permitidos neste aquário.");
        }
    }

    @Override
    public void listarAnimal() {
        super.listarAnimal();
    }
}
