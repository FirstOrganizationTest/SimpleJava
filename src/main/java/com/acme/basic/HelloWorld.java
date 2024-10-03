package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests.");
     System.out.println("This method is not covered by unit tests123456.");
  }

  //changes introduced for release branch
void sub (){
  int a = 10;
  int b = 20;
  System.out.println("Result is: "+ (b-a));
}  

}
