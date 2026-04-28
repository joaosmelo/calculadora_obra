package com.obra.model;
import jakarta.persistence.*;
@Entity
public class Parede {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private double comprimento,altura,espessura;
 private boolean possuiJanela,possuiPorta;
 @ManyToOne private Vertice inicio;
 @ManyToOne private Vertice fim;
 public Parede(){}
 public double getComprimento(){return comprimento;}
 public void setComprimento(double comprimento){this.comprimento=comprimento;}
 public double getAltura(){return altura;}
 public void setAltura(double altura){this.altura=altura;}
}