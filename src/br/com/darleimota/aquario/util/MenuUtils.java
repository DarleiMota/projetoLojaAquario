package br.com.darleimota.aquario.util;

import br.com.darleimota.aquario.model.ambientes.*;
import br.com.darleimota.aquario.model.animal.Animal;
import br.com.darleimota.aquario.model.animal.PeixeAguaDoce;
import br.com.darleimota.aquario.model.animal.PeixeAguaSalgada;
import br.com.darleimota.aquario.model.animal.ReptilTerrario;

import java.util.Scanner;

public class MenuUtils {

    private final Scanner scanner = new Scanner(System.in);

    public void menuPrincipal(Aquario aquario) {
        int opcao;
        do {
            System.out.println("\n=== MENU AQUÁRIO ===");
            System.out.println("1 - Adicionar ");
            System.out.println("2 - Remover ");
            System.out.println("3 - Listar ");
            System.out.println("4 - Buscar ");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarPeixe(aquario);
                case 2 -> removerPeixe(aquario);
                case 3 -> listarAnimal(aquario);
                case 4 -> buscarPeixe(aquario);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void adicionarPeixe(Aquario aquario) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Espécie: ");
        String especie = scanner.nextLine();

        System.out.print("pH Ideal: ");
        double ph = scanner.nextDouble();

        System.out.print("Temperatura Ideal: ");
        int temp = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Precisa de lampada UV, (S/N): ");
        String resporta = scanner.nextLine().trim().toUpperCase();
        boolean luzUV = resporta.equals("S");

        System.out.print("Comportamento: ");
        String comportamento = scanner.nextLine();

        Animal animal = null;

        if (aquario instanceof AquarioAguaDoce) {
            animal = new PeixeAguaDoce(nome, idade, descricao, especie, ph, temp, comportamento);
        } else if (aquario instanceof AquarioAguaSalgada) {
            animal = new PeixeAguaSalgada(nome, idade, descricao, especie, ph, temp, comportamento);
        } else if (aquario instanceof Terrario) {
            animal = new ReptilTerrario(nome, idade, descricao, especie, temp, luzUV, comportamento);
        }

        if (animal != null) {
            aquario.adicionarAnimal(animal);
        } else {
            System.out.println("Tipo de aquário não reconhecido.");
        }
    }

    private void removerPeixe(Aquario aquario) {
        System.out.print("Nome do peixe a remover: ");
        String nome = scanner.nextLine();
        aquario.removerAnimal(nome);
    }

    private void listarAnimal(Aquario aquario) {
        aquario.listarAnimal();
    }

    private void buscarPeixe(Aquario aquario) {
        System.out.print("Nome do peixe a buscar: ");
        String nome = scanner.nextLine();
        var resultado = aquario.buscarAnimal(nome);
        if (resultado != null) {
            System.out.println("\nPeixe encontrado:");
            System.out.println(resultado);
        } else {
            System.out.println("Peixe não encontrado.");
        }
    }
}