package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!!");
  }

  int add(int a, int b){
    int abc = a + b;
    return abc;
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests.");
     System.out.println("This method is not covered by unit tests123456.");
     
    //new smell added to validate the second scenario
    System.out.println("This method is not covered by unit tests.");

    //one more new smell added to validate the second scenario
    System.out.println("This method is not covered by unit tests. Develop tests");
  }

}
