package es.faculdade.biblioteca.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.biblioteca.model.Emprestimo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmprestimoRepo extends R2dbcRepository<Emprestimo, Integer> {

	public Mono<Void> updateEmprestimo(Integer idEmprestimo);
	
}
