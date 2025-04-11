package com.mycompany.singletonprototype;

public class ConfigManager {

    private static ConfigManager instancia;
    private String configuracao;
    private Documento prototipoDocumento;

    private ConfigManager() {} // Construtor privado

    public static ConfigManager getInstancia(){
        if(instancia == null){
            instancia = new ConfigManager();
        }
        return instancia;
    }

    public String getConfiguracao(){
        return configuracao;
    }

    public void setConfiguracao(String config){
        this.configuracao = config;
    }

    public Documento getPrototipoDocumento(){
        return prototipoDocumento;
    }

    public void setPrototipoDocumento(Documento doc){
        this.prototipoDocumento = doc;
    }
}