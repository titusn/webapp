package org.acme.webapp.repository;

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.webapp.model.Film;
import org.acme.webapp.model.Film$;

import java.util.Optional;

@ApplicationScoped
public class FilmRepository {

    @Inject
    JPAStreamer jpaStreamer;

    public Optional<Film> getFilm(Short filmId) {
        return jpaStreamer.stream(Film.class)
                .filter(Film$.id.in(filmId))
                .findFirst();
    }
}
