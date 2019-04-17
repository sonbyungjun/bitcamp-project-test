package bitcamp.project.test;

import bitcamp.project.test.service.DeviceService;
import bitcamp.project.test.service.Minus;
import bitcamp.project.test.service.Plus;
import bitcamp.project.test.service.Square;

public class App {
  public String getGreeting() {
    return "Hello world."; 
  }

  public static void main(String[] args) {
    System.out.println("hahahahahahahahahaha");
    Minus m = new Minus();
    m.minus();
    System.out.println("hohohohohohoho");
    System.out.println("---------------------------");
    Square square = new Square();
    square.execute();
    System.out.println("---------------------------");

    System.out.println("***************************");
    DeviceService d = new DeviceService();
    d.device();
    System.out.println("***************************");
    int a = 10;
    int b = 5;

    Mul m2 = new Mul();
    System.out.println(m2.mul(a, b));


    Plus plus1 = new Plus();           

    plus1.plus(10,20);

  }

}

