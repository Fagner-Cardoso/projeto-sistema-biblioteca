package br.com.fagner.classes;

public class Livro {

    // atributos de classe
    private String titulo;
    private String autor;
    private String anoDePulicacao;
    private String ISBN;
    private boolean isDisponivel;

    // Construtores

    public Livro(String titulo, String autor, String anoDePublicao, String ISBN, boolean isDisponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePulicacao = anoDePublicao;
        this.ISBN = ISBN;
        this.isDisponivel = isDisponivel;
    }


    // métodos de acesso

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getAnoDePublicacao(){
        return this.anoDePulicacao;
    }

    public String getISBN(){
        return this.ISBN;
    }

    private boolean getIsDisponivel(){
        return this.isDisponivel;
    }

    // métodos padrão

    public String checarDisponibilidade(){
        isDisponivel = getIsDisponivel();
        if(isDisponivel == true){
            return "Disponível";
        }
        else{
            return "Indisponível";
        }
    }


    public void imprimirInformacoes(){
        System.out.println("=======================");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de publicação: " + getAnoDePublicacao());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Disponibilidade: " + checarDisponibilidade());
        System.out.println("=======================");
    }
}
