package br.com.alura.pesquisacep.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Api {
    private static String API_URL = "https://viacep.com.br/ws/";
    private static final String CEP = "/%s/json/";

    public static String getEnderecoPesquisa(String cep) throws IOException {
        String url = String.format(API_URL + CEP, cep.replaceAll("[^0-9]", ""));
        URL apiUrl = new URL (url);

        HttpURLConnection connection = null;
        BufferedReader reader = null;
        StringBuilder response = new StringBuilder();

        try {

            connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
            // Tratar a exceção de IO aqui
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    // Tratar a exceção de IO aqui
                }
            }
            if (connection != null) {
                connection.disconnect();
            }
        }

        return response.toString();
    }
}
