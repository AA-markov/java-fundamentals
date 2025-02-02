package com.epam.courses.java.fundamentals.oop.practice.task3.Stationery.Writing;

import com.epam.courses.java.fundamentals.oop.practice.task3.Stationery.Stationery;

public abstract class Writing extends Stationery {

  COLOUR colour;

  enum COLOUR {PLAIN, BLUE, BLACK, GREEN, RED, MULTICOURED}

  Writing(double price, String brand, COLOUR colour) {
    super(price, brand);
    this.colour = colour;
  }
  @Override
  public String toString() {
    return super.toString() + ", " + colour;
  }
}
