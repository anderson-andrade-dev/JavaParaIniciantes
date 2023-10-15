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
    Converte galoesLitro;
    public ConverteGalaoLitroMelhorado(Converte converte) {
        this.galoesLitro = converte;
    }

    //método para criar um map com as conversões de galão para litro.
    public Map<Integer, Double> listaGalaoLitro() {
        var galoesLitros = new HashMap<Integer, Double>();

        for (int i=1; i <= 100; i++) {
           galoesLitros.put(i,galoesLitro.converter(i));
        }

        return galoesLitros;
    }
}

