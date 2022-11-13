package com.strategy.ex1;

public class SimpSumStrategy implements SumStrategy {

  @Override
  public int get(int n) {
    int sum = n;

    for(long i = 0; i < n; i++) {
      sum += i;
    }

    return sum;
  }
  
}
