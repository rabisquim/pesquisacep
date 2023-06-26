package br.com.alura.pesquisacep.modelos;


import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private ListaEnderecos lista;
    private ConverterArquivo arquivo;

    public Menu() {
        scanner = new Scanner(System.in);
        lista = new ListaEnderecos();
        arquivo = new ConverterArquivo(lista);


    }
    public void exibeMenu () {

        int opcao;

        do {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Buscar/adicionar novo endereço");
            System.out.println("2 - Listar endereços");
            System.out.println("3 - Remover endereços da listagem");
            System.out.println("4 - Exportar arquivo 'listagem de endereços'.");
            System.out.println("0 - Sair");
            System.out.print("Opção escolhida: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    try {
                        lista.adicionarEndereco();
                    } catch (Exception e) {
                        System.out.println("Erro ao adicionar endereço: " + e.getMessage());
                    }
                    break;
                case 2:
                    lista.listarEnderecos();
                    break;
                case 3:
                    lista.removerEndereco();
                    break;
                case 4:
                    arquivo.exportar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}

