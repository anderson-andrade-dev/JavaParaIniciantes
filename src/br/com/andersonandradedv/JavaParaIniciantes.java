package br.com.andersonandradedv;

/**
 * @author Anderson Andrade
 * Data da criação 15/10/2023
 */
public class JavaParaIniciantes {
    public static void main(String[] args) {
        primeiroPrograma();
    }

    private static void primeiroPrograma(){
        var converterGalaoLitro = new ConverterGalaoLitro();
        System.out.println("Convertendo 4 Galoes em litros = "+ converterGalaoLitro.converte(4));
    }
}
