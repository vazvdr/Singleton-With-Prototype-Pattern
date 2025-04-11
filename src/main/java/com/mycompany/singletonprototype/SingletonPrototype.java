package com.mycompany.singletonprototype;

import java.util.Scanner;

public class SingletonPrototype {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o formato do documento (txt/json): ");
        String formato = scanner.nextLine().toLowerCase();

        if (!formato.equals("txt") && !formato.equals("json")) {
            System.out.println("Formato inválido. Escolha apenas txt ou json.");
            return;
        }

        ConfigManager config = ConfigManager.getInstancia();
        config.setPrototipoDocumento(new Documento("Título Padrão", "Este é um conteúdo de exemplo.", formato));

        Documento novoDoc = config.getPrototipoDocumento().clone();
        novoDoc.exibirDocumento();

        scanner.close();
    }
}

