package com.example.curso.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private String sexo;
	private double peso;
	private double altura;
	private List<Double> notas;
	
	
	
	public Aluno() {
		this("", "", 1, 0.1, new ArrayList<Double>());
	}
	
	
	public Aluno(String nome, String sexo, double peso, double altura, List<Double> notas) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.notas = notas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public List<Double> getNotas() {
		return notas;
	}


	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
}
	
	
	