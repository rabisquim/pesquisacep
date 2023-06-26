package br.com.alura.pesquisacep.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ConverterArquivo {

        //private Gson gson;
        private ListaEnderecos lista;

        public ConverterArquivo (ListaEnderecos lista) {
                //this.gson = new Gson();
                this.lista = lista;
        }
        public void exportar()  {

                List<Endereco> enderecos = lista.getEnderecos();

                try {
                        Gson gson = new GsonBuilder().setPrettyPrinting().create();
                        FileWriter arquivo = new FileWriter("listagem_enderecos.json");
                        arquivo.write(gson.toJson(enderecos));
                        arquivo.close();
                        System.out.println("Arquivo de listagem de endereço exportado com sucesso!");
                } catch (IOException e) {
                        System.out.println("Erro ao exportar arquivo de listagem de endereços: " + e.getMessage());
                }

        }

}
