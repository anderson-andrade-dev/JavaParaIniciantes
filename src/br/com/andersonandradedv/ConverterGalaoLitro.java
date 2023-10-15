package br.com.andersonandradedv;

/**
 * @author Anderson Andrade
 * Data da criação 15/10/2023
 * Capítulo 01 Fundamentos da Linguagem Java
 * Pagina 21
 * Tente isto 1-1
 * Crie um programa que converta galão em litros.
 * Compile o programa com javac
 * Execute o programa com java
 */
public class ConverterGalaoLitro {
    //Constante com o valor referente a 1 galão
    private static final double VALOR_REFERENCIA_GALAO = 3.78544;

    // Método que converte a quantidade de galões e devolve o valor em litros
    public double converte(double qtdGalao){
        return qtdGalao* VALOR_REFERENCIA_GALAO;
    }
}
