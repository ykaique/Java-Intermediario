package com.ygor.cursojava.aula75_84;

public class Aula76 {
    public static void main(String[] args) {

        String java = "Java";
        String curso = "Curso";
        String cursoJava = curso + java;

        System.out.println(cursoJava);

        String resultado2com2 = "Resultado 2+2 = " + (2 + 2);
        System.out.println(resultado2com2);

        String um = String.valueOf(1);
        System.out.println(um);

        //String sao imutaveis, quando mudamos o valor de uma String, estamos mudando a sua referencia na verdade
        String concatenacao = "O Lorem Ipsum é um texto modelo da indústria tipográfica" +
                " e de impressão. O Lorem Ipsum tem vindo a ser o texto padrão usado por" +
                " estas indústrias desde o ano de 1500, quando uma misturou os caracteres" +
                " de um texto para criar um espécime de livro. Este texto não só" +
                " sobreviveu 5 séculos, mas também o salto para a tipografia electrónica," +
                " mantendo-se essencialmente inalterada. Foi popularizada nos anos 60" +
                " com a disponibilização das folhas de Letraset, que continham passagens" +
                " com Lorem Ipsum, e mais recentemente com os programas de publicação" +
                " como o Aldus PageMaker que incluem versões do Lorem Ipsum.";

        System.out.println(concatenacao);
    }
}
