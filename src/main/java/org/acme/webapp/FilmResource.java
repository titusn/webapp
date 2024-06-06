package org.acme.webapp;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.acme.webapp.model.Film;
import org.acme.webapp.repository.FilmRepository;

import java.util.Optional;

@Path("/")
public class FilmResource {
    @Inject
    FilmRepository filmRepository;

    @GET
    @Path("/helloworld")
    @Produces("text/plain")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GET
    @Path("/film/")
    @Produces("text/plain")
    public String getFilm(Short filmId) {
        Optional<Film> film = filmRepository.getFilm(filmId);
        return film.isPresent() ? film.get().getTitle() : "Film not found";
    }
}
