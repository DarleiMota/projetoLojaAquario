package br.com.darleimota.aquario.model.ambientes;

import br.com.darleimota.aquario.model.animal.Animal;
import br.com.darleimota.aquario.model.animal.ReptilTerrario;

public class Terrario extends AquarioBase {

    @Override
    public void adicionarAnimal(Animal animal) {
        if (animal instanceof ReptilTerrario) {
            super.adicionarAnimal(animal);
        } else {
            System.out.println("Somente animais de terrario são permitidos neste aquário.");
        }
    }

    @Override
    public void listarAnimal() {
        super.listarAnimal();
    }
}
