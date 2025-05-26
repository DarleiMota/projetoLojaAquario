package br.com.darleimota.aquario.model.app;

import br.com.darleimota.aquario.model.ambientes.*;
import br.com.darleimota.aquario.util.MenuUtils;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aquario aquarioSelecionado = null;

        System.out.println("=== ESCOLHA O TIPO DE AMBIENTE ===");
        System.out.println("1 - Aquário de Água Doce");
        System.out.println("2 - Aquário de Água Salgada");
        System.out.println("3 - Terrário");
        System.out.print("Digite a opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> aquarioSelecionado = new AquarioAguaDoce();
            case 2 -> aquarioSelecionado = new AquarioAguaSalgada();
            case 3 -> aquarioSelecionado = new Terrario();
            default -> {
                System.out.println("Opção inválida. Encerrando...");
                System.exit(0);
            }
        }
        MenuUtils menu = new MenuUtils();
        menu.menuPrincipal(aquarioSelecionado);
    }
}