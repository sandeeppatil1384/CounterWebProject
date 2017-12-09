package com.qaagility.controller;

public class newtest{

  public int testSlow() {
   System.out.println("slow");
  
  }
  public int testSlower() {
   System.out.println("slower");
  
  }
  public int testFast() {
   System.out.println("Fast");
  
  }
  
  @Test
  public int testCalc() {
   System.out.println("Result",9,9);
  
  }
  
}
