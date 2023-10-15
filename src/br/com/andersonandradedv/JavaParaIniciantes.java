package br.com.andersonandradedv;
import java.util.Map;

/**
 * @author Anderson Andrade
 * Data da criação 15/10/2023
 */
public class JavaParaIniciantes {
    public static void main(String[] args) {
        //método para chamar o primeiro programa pagina 21 do livro
        primeiroPrograma();

        //método para chamar o segundo programa pagina 27 do livro
        segundoPrograma();

       // Valor do intervalo 7.2 conforme indicado no desafio
       // Programa da pagina 38 do livro
        terceiroPrograma(7.2);
    }

    private static void primeiroPrograma() {
        var converterGalaoLitro = new ConverterGalaoLitro();
        System.out.println("Convertendo 4 Galoes em litros = " + converterGalaoLitro.converter(4));
    }

    private static void segundoPrograma() {
        Map<Integer, Double> map = new ConverteGalaoLitroMelhorado(new ConverterGalaoLitro()).listaGalaoLitro();

        String str1 = """ 
                 -----------------------------------------
                 Tabela de Conversão de Galões para litros.
                 ------------------------------------------
                """;

        String str2 = """
                 ---------------------------------------------------
                 ---No Desafio é aqui que tem qua pular uma linha---
                 
                 -------- Galões----------|--------Litros------------
                          %s                       %s
                """;

        String str3 = """
                 -------------------------|---------------------------
                           %s                       %s
                               
                """;


        for (Integer key = 1; key <= map.size(); key++) {

            if (key == 1) {
                System.out.println(str1);
            }
            if ((key % 10) == 0) {
                System.out.printf(String.format(str2, key, map.get(key)));

            } else {
                System.out.printf(String.format(str3, key, map.get(key)));
            }
        }
    }

    private static void terceiroPrograma(double intervalo) {
        String str = """
                A distancia de um relâmpago em pés com um intervalo de : %s\s
                é de: %s
                """;
        var distancia = new CalculaDistanciaRelampago(intervalo).distanciaRelampagoEmPes();
        System.out.println("\n----------Programa Calcular Relâmpago em Pés--------------");
        System.out.println(String.format(str,intervalo,distancia));



    }
}
