package com.pos.action;

import java.util.Iterator;

import com.pos.vo.Basket;
import com.pos.vo.Fruit;

public class BillProcessor {

  
  
  public float processBasket(Basket basket){
    
    
    float totalPrice = 0;
    
    for (Iterator iterator = basket.iterator(); iterator.hasNext();) {
      Fruit fruit = (Fruit) iterator.next();
      float price = fruit.getCount() * fruit.getPrice().getPrice();
      totalPrice = totalPrice + price;
      
      
    }
    
    System.out.println("Total Price is :"+totalPrice);
    return totalPrice;
    
  }
  
}
