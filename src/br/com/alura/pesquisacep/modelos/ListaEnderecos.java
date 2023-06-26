package br.com.alura.pesquisacep.modelos;

import br.com.alura.pesquisacep.api.Api;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class ListaEnderecos {

    private Scanner scanner;
    private List<Endereco> enderecos;

    public ListaEnderecos() {
        scanner = new Scanner(System.in);
        enderecos = new ArrayList<>();

    }

    public void adicionarEndereco() {
        System.out.println("Informe o CEP para busca: ");
        String cep = scanner.nextLine();

        if (!cep.isEmpty() && cep.matches("\\d{8}")) {
            try {
                String enderecoJson = Api.getEnderecoPesquisa(cep);
                Gson gson = new Gson();
                Endereco endereco = gson.fromJson(enderecoJson, Endereco.class);

                if (endereco.getComplemento() == null || endereco.getComplemento().isEmpty()) {
                    endereco.setComplemento("Vazio");
                }

                enderecos.add(endereco);

                System.out.println("Endereço adicionado com sucesso: ");
                System.out.println(endereco);
            } catch (IOException e) {
                System.out.println("Erro na consulta do endereço: " + e.getMessage());
            } catch (JsonSyntaxException e) {
                System.out.println("Erro na conversão do JSON: " + e.getMessage());
            }
        } else {
            System.out.println("CEP inválido. Tente novamente.");
        }
    }
    public void listarEnderecos() {
        System.out.println ("Lista de endereços: ");
        for (int i = 0; i < enderecos.size(); i++) {
            System.out.println ("Índice: " +  "[ " + i + " ] " + "\n" + enderecos.get (i) + "\n");
        }

    }

    public void removerEndereco () {
        System.out.println ("Digite o índice do endereço que deseja remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < enderecos.size()) {
            Endereco enderecoRemovido = enderecos.remove(indice);
            System.out.println ("Endereço \" " + enderecoRemovido.getCep() + "\" removido com sucesso!");
        } else {
            System.out.println ("Índice inválido. Tente novamente.");
        }
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

}
