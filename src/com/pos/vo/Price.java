package com.pos.vo;

import java.sql.Date;

import com.pos.FruitType;

public class Price {

  
  Fruit fruit;
  
  float price;
  FruitType fruitType;
  Date date;

  public Price() {   
  }
  

  public FruitType getFruitType() {
    return fruitType;
  }
  public void setFruitType(FruitType fruitType) {
    this.fruitType = fruitType;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }


  public Fruit getFruit() {
    return fruit;
  }


  public void setFruit(Fruit fruit) {
    this.fruit = fruit;
  }


  public float getPrice() {
    return price;
  }


  public void setPrice(float price) {
    this.price = price;
  }
  
  
  
  
  
}
