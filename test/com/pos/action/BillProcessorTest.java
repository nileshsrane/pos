package com.pos.action;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.pos.FruitType;
import com.pos.vo.Basket;
import com.pos.vo.Fruit;
import com.pos.vo.Price;

public class BillProcessorTest {

  Date date = new Date();
  
  @Test
  public void testProcessBasket(){
      
    BillProcessor billProcessor = new BillProcessor();
    Basket basket = new Basket();
    
    Fruit fruit = new Fruit();
    fruit.setFruitType(FruitType.Apple);
    fruit.setCount(3);
    
    Price price = new Price();
    price.setFruit(fruit);
    fruit.setPrice(price);
    
    price.setPrice((float)19.19);
  
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    price.setDate(sqlDate);
    
    basket.add(fruit);
    
    float totalPrice =  billProcessor.processBasket(basket);
    Assert.assertEquals(57.57, totalPrice, 0.01);
    
    
  }
  
  @Test
  public void test2(){
    
    BillProcessor billProcessor = new BillProcessor();
    Basket basket = new Basket();
    
    Fruit fruit = createItem(FruitType.Banana, 1, (float)4.4);
    
    basket.add(fruit);
    
    float totalPrice =  billProcessor.processBasket(basket);
    Assert.assertEquals(4.4, totalPrice, 0.01);
    
    
  }
  
  @Test
  public void test3(){
    
    BillProcessor billProcessor = new BillProcessor();
    Basket basket = new Basket();
    
    Fruit fruit = createItem(FruitType.Banana, 1, (float)4.4);
    basket.add(fruit);
    fruit = createItem(FruitType.Apple, 4, (float)19.19);
    basket.add(fruit);
    fruit = createItem(FruitType.Leamon, 6, (float)5.4);
    basket.add(fruit);
    
    float totalPrice =  billProcessor.processBasket(basket);
    Assert.assertEquals(113.56, totalPrice, 0.01);
    
    
  }
  
  
  
  private Fruit createItem(FruitType fruitType, int count, float itemPrice){
    
    Fruit fruit = new Fruit();
    fruit.setFruitType(FruitType.Apple);
    fruit.setCount(count);
    
    Price price = new Price();
    price.setFruit(fruit);
    fruit.setPrice(price);
    
    price.setPrice(itemPrice);
    
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    price.setDate(sqlDate);
    
    return fruit;
    
  }
  
  
}
