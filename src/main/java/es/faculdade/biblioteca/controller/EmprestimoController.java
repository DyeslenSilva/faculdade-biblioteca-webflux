package es.faculdade.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.biblioteca.model.Emprestimo;
import es.faculdade.biblioteca.repo.EmprestimoRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmprestimoController {
	
	@Autowired
	private EmprestimoRepo emprestimoRepo;
	
	@PostMapping("/emprestimoCad")
	public Mono<Emprestimo> cadastroEmprestimo(@RequestBody Emprestimo emprestimo){
		return emprestimoRepo.save(emprestimo);
	}
	
	@GetMapping("/emprestimos")
	public Flux<Emprestimo> listaEmprestimo(){
		return emprestimoRepo.findAll();
	}
	
	@GetMapping("/emprestimo/{idEmprestimo}")
	public Mono<Emprestimo>emprestimoPorID(@PathVariable Integer idEmprestimo){
		return emprestimoRepo.findById(idEmprestimo);
	}
	
	@PutMapping("/emprestimo/{idEmprestimo}")
	public Mono<Void> atualizarEmprestimo(@PathVariable Integer idEmprestimo){
		return emprestimoRepo.updateEmprestimo(idEmprestimo);
	}
	
	@DeleteMapping("emprestimo/{idEmprestimo}")
	public Mono<Void> deleteEmprestimo(@PathVariable Integer idEmprestimo){
		return emprestimoRepo.deleteById(idEmprestimo);
	}

}
