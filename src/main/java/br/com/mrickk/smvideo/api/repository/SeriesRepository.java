package br.com.mrickk.smvideo.api.repository;

import br.com.mrickk.smvideo.api.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Serie, Long> {
}
