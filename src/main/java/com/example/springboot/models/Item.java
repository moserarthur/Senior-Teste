package com.example.springboot.models;
import java.util.UUID;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Item {

@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String description;
    private double value;
    private char type;
    
  public Item(String description, double value, char type) {
    this.description = description;
    this.value = value;
    this.type = type;
  }

  public double getValue() {
    return value;
  }
  public void setValue(double value) {
    this.value = value;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.descricao = descricao;
  }
  public UUID getId() {
    return id;
  }
}