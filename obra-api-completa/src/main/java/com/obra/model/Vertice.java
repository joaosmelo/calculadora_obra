package com.obra.model;
import jakarta.persistence.*;
@Entity
public class Vertice {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private double x;
 private double y;
 public Vertice(){}
 public Vertice(double x,double y){this.x=x;this.y=y;}
 public Long getId(){return id;}
 public double getX(){return x;}
 public double getY(){return y;}
 public void setX(double x){this.x=x;}
 public void setY(double y){this.y=y;}
}