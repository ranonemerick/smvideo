package br.com.mrickk.smvideo.api.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

import java.util.Optional;
import java.util.OptionalDouble;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Serie {

    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    private Categoria genero;
    private String atores;
    private String poster;
    private String sinopse;


    public Serie(DadosSerie dadosSerie) {
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0);
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
        this.atores = dadosSerie.atores();
        this.poster = dadosSerie.poster();
        this.sinopse = dadosSerie.sinopse();
    }
    
}
