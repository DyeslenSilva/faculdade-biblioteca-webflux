package es.faculdade.biblioteca.model;

import lombok.Data;

@Data
public class Livro {

	private Integer idLivro;
	
	private String isbn;
	private String nomeDoLivro;
	private String autor;
	private Integer volume;
	
	
}
