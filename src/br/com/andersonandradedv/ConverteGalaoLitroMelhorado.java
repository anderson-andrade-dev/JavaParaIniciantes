package br.com.andersonandradedv;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anderson Andrade
 * Data da criação 15/10/2023
 * Capítulo 01 Fundamentos da Linguagem Java
 * Pagina 27
 * Tente isto 1-2
 * Essa versão melhorada do conversor de galões em litros desenvolvida no primeiro projeto
 * exibirá uma tabela de conversões começando com 1 galão e terminando em 100 galões a cada 10
 * galões, uma linha em branco será exibida.
 */
public class ConverteGalaoLitroMelhorado {
    Converte converte;

    public ConverteGalaoLitroMelhorado(Converte converte) {
        this.converte = converte;
    }

    public Map<Double, Double> listaGalaoLitro() {
        var galoesLitros = new HashMap<Double, Double>();

        for (i=1; i <= 100; i++) {
           galoesLitros.put(i,converte.converter(i));
        }

        return galoesLitros;
    }
}

