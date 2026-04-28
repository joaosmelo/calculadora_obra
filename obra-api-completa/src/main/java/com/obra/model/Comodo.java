package com.obra.model;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Comodo {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nome;
 private double largura,comprimento,altura;
 @OneToMany private List<Parede> paredes;
 public Comodo(){}
 public String getNome(){return nome;}
 public void setNome(String nome){this.nome=nome;}
}