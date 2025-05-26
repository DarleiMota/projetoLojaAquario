package br.com.darleimota.aquario.model.ambientes;

import br.com.darleimota.aquario.model.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class AquarioBase implements Aquario {

    protected List<Animal> animals;

    public AquarioBase() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void adicionarAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Peixe " + animal.getNome() + " Adicionado com sucesso");
    }

    @Override
    public void removerAnimal(String nome) {
        boolean removed = animals.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
        if (removed) {
            System.out.println("Animal " + nome + " removido.");
        } else {
            System.out.println("Animal " + nome + " não encontrado.");
        }
    }

    @Override
    public void listarAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Nenhum animal encontrado");
        } else {
                System.out.println(" ");
                for (Animal pControle : animals) {
                System.out.println(pControle);
            }
        }
    }

    @Override
    public Animal buscarAnimal(String nome) {
        for (Animal pControle : animals) {
            if (pControle.getNome().equalsIgnoreCase(nome)) {
                return pControle;
            }
        }
        return null;
    }
}

