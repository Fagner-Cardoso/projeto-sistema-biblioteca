package br.com.fagner.principal;

import br.com.fagner.classes.Livro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro l = new Livro("O lobo","Carlos Machado","1985","72359448",false);

        l.imprimirInformacoes();


    }
}