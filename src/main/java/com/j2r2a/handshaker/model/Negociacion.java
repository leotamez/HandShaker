package com.j2r2a.handshaker.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Negociacion{
	
	private long id_negociacion;	
	private Usuario usuario1;
	private Usuario usuario2;
	private List<Comentario> lista_comentarios;
	private boolean aceptada;
	
	@Id
    @GeneratedValue
	public long getId_negociacion() {
		return id_negociacion;
	}
	public void setId_negociacion(long id_negociacion) {
		this.id_negociacion = id_negociacion;
	}
		
	@OneToOne(targetEntity=Usuario.class) //Una negociacion es de un usuario
	public Usuario getUsuario1() {
		return usuario1;
	}
	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}
	
	@OneToOne(targetEntity=Usuario.class) //Una negociacion es de otro usuario
	public Usuario getUsuario2() {
		return usuario2;
	}
	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}
	
	@OneToMany(targetEntity=Comentario.class) //Una negociacion tiene n comentarios tipo Comentario
	@JoinColumn(name="id_negociacion") 
	public List<Comentario> getLista_comentarios() {
		return lista_comentarios;
	}
	public void setLista_comentarios(List<Comentario> lista_comentarios) {
		this.lista_comentarios = lista_comentarios;
	}
	
	public boolean isAceptada() {
		return aceptada;
	}
	public void setAceptada(boolean aceptada) {
		this.aceptada = aceptada;
	}
		
}