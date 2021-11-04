package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCurrentTimeMillis {

    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis();
        // m�todo para medir o tempo de execu��o de algum trecho de c�digo
        //O m�todo System.currentTimeMillis() devolve os milissegundos que passaram desde 1 de janeiro de 1970

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam iuashdpuahsduiashduiashdiuashduiasdhsui");

        bw.close();

        long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

    }
}