package com.devti.aula.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //(name = "cid_cliente" caso se querer muda de nome no data)
public class Cidade implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id //ele anota qual  e a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //estrategia de chave, generate=auto incremento
	private Integer id;
	
	@Column //colunas
	private String nome;
	
	@Column //quiser muda de nome use o name 
	private String uf;
	
	
	
	public Cidade() {
		this(0,"","");
	}
	
	
	
	public Cidade(Integer id, String nome, String uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result= 1;
		result = prime * result + ((id == null)? 0 :id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (id==null) {
			if (other.id != null) {
				return false;
			}else if (!id.equals(other.id)) 
				return false;
					return true;
		}
		return Objects.equals(id, other.id);
	}



	
	
	
}
