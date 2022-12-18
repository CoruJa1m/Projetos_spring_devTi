package com.example.curso.services;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.curso.model.Aluno;

@Service
public class AlunoService {
	
	Aluno aluno= new Aluno();
	List<Aluno> lista=new ArrayList<Aluno>();
	
	public Aluno cadastrarAluno(Aluno  a) {
		aluno = a;
		lista.add(a);
		return aluno;
	}
	
	public List<Aluno>listarTodos(){
		return lista;
	}
	
	public double getImc() {
		return aluno.getPeso() / (aluno.getAltura()*aluno.getAltura());
		
	}
	public double getMedia(Aluno a) {
		double soma=0;
		for (Double nota:a.getNotas()) {
			soma+=nota;
		}
			return soma / aluno.getNotas().size();
		}
	
	public String avaliaImc() {
		double imc=getImc();
		DecimalFormat df= new DecimalFormat("###.00");
		if (imc<18.5) {
			return "abaixo do peso ("+df.format(imc)+")";
		}else if (imc>30) {
		return "acima do peso ("+df.format(imc)+")";
		}
		return "peso normal ("+df.format(imc)+")";
	}
	
	public  String avaliaMedia(Aluno a) {
		DecimalFormat df=new DecimalFormat();
		double media=getMedia(a);
		if (media>=7) 
			return aluno.getNome()+": APROVADO(A) - MEDIA :"+df.format(media);
			
			return aluno.getNome()+": REPROVADO(A) - MEDIA :"+df.format(media);
		
	}
	
	public Aluno buscarAluno(String nome){
	
		for (Aluno aluno : lista) {
			if (aluno.getNome().equals(nome)) {
				return aluno;
			}
		}
		return new Aluno();
	}
	
	
	
	public List<Aluno> listarAprovados(){
	List<Aluno> aprovados = new ArrayList<>();
	for (Aluno aluno : lista) {
		if (getMedia(aluno)>=7) {
			aprovados.add(aluno);
		}
	}
	return aprovados;
	
	
	}
	
	public List<Aluno> listarReprovados(){
		List<Aluno> reprovados = new ArrayList<>();
		for (Aluno aluno : lista) {
			if (getMedia(aluno)<=7) {
				reprovados.add(aluno);
			}
		}
		return reprovados;
		}
	
	
	
	
	}

