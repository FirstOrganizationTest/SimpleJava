package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!!");
	
	//New code smell in feature4 branch
	System.out.println("Hello Sonar !!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests.");
     System.out.println("This method is not covered by unit tests123456.");
  }

}
