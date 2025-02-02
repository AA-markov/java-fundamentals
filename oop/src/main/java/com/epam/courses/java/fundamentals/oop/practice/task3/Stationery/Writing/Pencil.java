package com.epam.courses.java.fundamentals.oop.practice.task3.Stationery.Writing;

import com.epam.courses.java.fundamentals.oop.practice.task3.Stationery.Stationery;

import java.util.ArrayList;

public class Pencil extends Writing {

  HARDNESS hard;
  enum HARDNESS{H, HB, B}

  private Pencil(double price, String brand, COLOUR colour, HARDNESS hard) {
    super(price, brand, colour);
    this.hard = hard;
  }

  private Pencil(double price) {
    super(price, "Koh-i-noor", COLOUR.PLAIN);
    this.hard = HARDNESS.HB;
  }

  public static ArrayList<Stationery> getNewbySet() {
    ArrayList<Stationery> set = new ArrayList<>();
    set.add(new Pencil(20));
    set.add(new Pencil(20));
    set.add(new Pencil(20));
    set.add(new Pencil(60, "Derwent", COLOUR.PLAIN, HARDNESS.B));
    return set;
  }

  @Override
  public String toString() {
    return super.toString() + ", " + hard;
  }
}
