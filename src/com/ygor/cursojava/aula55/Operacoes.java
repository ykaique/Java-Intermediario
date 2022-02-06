package com.ygor.cursojava.aula55;

public enum Operacoes {

    SOMAR("+"){
        @Override
        public Double executarOperacao(Double x, Double y) {
            return x + y;
        }
    }, SUBTRAIR("-"){
        @Override
        public Double executarOperacao(Double x, Double y) {
            return x - y;
        }
    }, MULTIPLICAR("*"){
        @Override
        public Double executarOperacao(Double x, Double y) {
            return x * y;
        }
    }, DIVIDIR("/"){
        @Override
        public Double executarOperacao(Double x, Double y) {
            return x / y;
        }
    };

    private String valor;

    Operacoes(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Operacoes{" +
                "valor='" + this.getValor() + '\'' +
                '}';
    }

    public abstract Double executarOperacao(Double x, Double y);
}
