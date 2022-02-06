package com.ygor.cursojava.aula65;

public @interface InformacaoAula {

    String autor();
    int aulaNumero();
    String blog() default "teste.com";
    String site() default "testando.aula";

}
