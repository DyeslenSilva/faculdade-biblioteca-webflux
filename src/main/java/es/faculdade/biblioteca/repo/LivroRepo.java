package es.faculdade.biblioteca.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.biblioteca.model.Livro;
import reactor.core.publisher.Mono;

public interface LivroRepo extends R2dbcRepository<Livro, Integer> {

	public Mono<Void> updateLivro(Integer idLivro);
}
