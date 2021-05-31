package es.faculdade.biblioteca.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.biblioteca.model.Livro;
import es.faculdade.biblioteca.repo.LivroRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class LivroController {

	private LivroRepo livroRepo;
	
	@PostMapping("/cadastroLivro")
	public Mono<Livro> cadastroLivro(@RequestBody Livro livro){
		return livroRepo.save(livro);
	}
	
	@GetMapping("/livros")
	public Flux<Livro> listaLivros(){
		return livroRepo.findAll();
	}
	
	@GetMapping("/livro/{idLivro}")
	public Mono<Livro> encontrarLivro(@PathVariable Integer idLivro){
		return livroRepo.findById(idLivro);
	}
	
	
	@GetMapping("/livro/{nome}")
	public Mono<Livro> encontrarLivroNome(@PathVariable String nome){
		return livroRepo.encontrarLivroPorNome(nome);
	}
	
	@GetMapping("/livro/{genero}")
	public Mono<Livro> encontrarLivroPorGenero(@PathVariable String genero){
		return livroRepo.encontrarLivroPorGenero(genero);
	}
	
	@PutMapping("/livro/{idLivro}")
	public Mono<Void> atualizarLivro(@PathVariable Integer idLivro){
		return livroRepo.updateLivro(idLivro);
	}
	
	@DeleteMapping("/livro/idLivro")
	public Mono<Void> deleteLivro(@PathVariable Integer idLivro){
		return livroRepo.deleteById(idLivro);
	}
	
}
