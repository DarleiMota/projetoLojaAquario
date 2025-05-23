package br.com.darleimota.aquario.model.ambientes;

import br.com.darleimota.aquario.model.animal.Animal;

public interface Aquario {
    void adicionarAnimal(Animal animal);
    void removerAnimal(String nome);
    void listarAnimal();
    Animal buscarAnimal(String nome);
}
