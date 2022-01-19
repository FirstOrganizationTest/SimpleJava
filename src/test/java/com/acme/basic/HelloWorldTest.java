package com.acme.basic;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }

  @Test
  public void notcovered() {
    new HelloWorld().notCovered();
  }

}
