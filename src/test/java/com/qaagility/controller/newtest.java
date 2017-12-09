package com.qaagility.controller;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class newtest{

  public void testSlow() {
   System.out.println("slow");
  
  }
  public void testSlower() {
   System.out.println("slower");
  
  }
  public void testFast() {
   System.out.println("Fast");
  
  }
  
  @Test
  public void testCalc() {
   assertEquals("Result",9,9);
   }
  
}
