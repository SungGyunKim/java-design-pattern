package com.strategy.ex1;

public class MainEntry {
  public static void main(String[] args) {
    SumPrinter sumPrinter = new SumPrinter();

    sumPrinter.print(new SimpSumStrategy(), 100);
    sumPrinter.print(new GaussSumStrategy(), 100);
  }
}
