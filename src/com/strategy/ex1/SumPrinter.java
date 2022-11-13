package com.strategy.ex1;

public class SumPrinter {

  public void print(SumStrategy strategy, int n) {
    System.out.printf("The Sum of 1 - %d : ", n);
    System.out.println(strategy.get(n));
  }

}
