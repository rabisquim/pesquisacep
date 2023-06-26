package br.com.alura.pesquisacep.modelos;

import java.io.FileWriter;
import java.io.IOException;

public class GerarJson {

        FileWriter escrita = new FileWriter("Filmes.json");
        escrita.write(gson.toJson(enderecos));
        escrita.close();
}
