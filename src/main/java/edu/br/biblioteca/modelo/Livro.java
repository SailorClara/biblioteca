package edu.br.biblioteca.modelo;

public class Livro {
  
	private String titulo;
	private int numPagina;
	private String autor;
	
	
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
