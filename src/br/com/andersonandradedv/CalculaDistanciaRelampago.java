package br.com.andersonandradedv;

/**
 * @author Anderson Andrade
 * Data da criação 15/10/2023
 * Neste projeto, você criará um programa que calcula a que distância, em pés, um ouvinte está da queda
 * de um relâmpago. O som viaja a aproximadamente 1.100 pés por segundo pelo ar. Logo conhecer o intervalo
 * entre o momento em que você viu um relâmpago e o momento em que o som alcançou lhe permitirá calcular
 * a distância do relâmpago. Para este projeto, assuma que o intervalo seja de 7.2 segundos.
 * Capitulo 02 Introdução a tipos de dados e operadores
 * Pagina 38
 */
public class CalculaDistanciaRelampago {

    private static final double VELOCIDADE_SOM_EM_PES = 1100.0;
    private final double intervalo;

    public CalculaDistanciaRelampago(double intervalo) {
        this.intervalo = intervalo;
    }

    public double distanciaRelampagoEmPes(){
        return intervalo * VELOCIDADE_SOM_EM_PES ;
    }
}
