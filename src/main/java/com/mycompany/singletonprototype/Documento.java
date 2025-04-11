package com.mycompany.singletonprototype;

public class Documento implements Cloneable {
    
    private String titulo;
    private String conteudo;
    private String formato;

    public Documento(String titulo, String conteudo, String formato){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.formato = formato;   
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar documento", e);
        }
    }

    public void exibirDocumento() {
        System.out.println("Documento gerado em formato " + formato.toUpperCase());
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
    }
}
