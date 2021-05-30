package es.faculdade.biblioteca.model;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import es.faculdade.moodle.aluno.model.Aluno;
import es.faculdade.rh.rhns.model.Professor;
import lombok.Data;

@Data
@Table
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmprestimo;
	
	
	private Aluno aluno;
	
	private Professor professor;
	
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private LocalTime horaDeEmprestimo;
	private LocalTime horaDaDevolucao;

}
