package com.ygor.cursojava.aula74_exerc;

public class FarolThread implements Runnable {

    private Farol farol;
    public Thread t;
    private int tempo;

    public FarolThread(String nome, Farol farol, int tempo) {
        this.tempo = tempo;
        this.farol = farol;
        t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {
            int NUM = 10;
            try {
                if (t.getName().equalsIgnoreCase("Vermelho")) {

                    for (int i = 0; i < NUM; i++) {
                        farol.ficarVermelho(true, tempo);
                    }
                    farol.ficarVermelho(false, tempo);
                } else {
                    for (int i = 0; i < NUM; i++) {
                        farol.ficarVerde(true, tempo);
                    }
                    farol.ficarVerde(false, tempo);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}
