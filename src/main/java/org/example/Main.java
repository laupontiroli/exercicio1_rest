package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurante> restaurantesLista= new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n Menu");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");
            Integer opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o nome do restaurante: ");
                String nomeRestaurante = scanner.next();
                System.out.println("Digite a avaliacao do restaurante: ");
                Float avaliacao  = scanner.nextFloat();
                Restaurante restaurante = new Restaurante();
                restaurante.nome = nomeRestaurante;
                restaurante.avaliacao = avaliacao;
                restaurantesLista.add(restaurante);
                System.out.println("Restaurante "+ nomeRestaurante +" cadastrado com sucesso!");
            }
            else if (opcao ==2) {
                System.out.println("Restaurantes cadastrados:");
                for (int index =0; index <restaurantesLista.size(); index++) {
                    Restaurante rest = restaurantesLista.get(index);
                    System.out.println(index + ":" + rest.nome);
                    rest.imprimirMenu();
                }
            }
            else if (opcao == 3) {
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                Integer escolha = scanner.nextInt();
                Restaurante restauranteEscolhido = restaurantesLista.get(escolha);
                System.out.println("Digite o nome do item : ");
                String nomeItem = scanner.next();
                System.out.println("Digite o preco do item : ");
                Float precoItem = scanner.nextFloat();
                Item item = new Item();
                item.nome = nomeItem;
                item.preco = precoItem;
                restauranteEscolhido.adicionarItem(item);
                System.out.println("Item " + item.nome + "adicionado ao menu do restaurante " + restauranteEscolhido.nome + '!');
            }
            else if (opcao == 4) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            }
            else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}