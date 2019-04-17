package bitcamp.project.test;

import bitcamp.project.test.service.DeviceService;
import bitcamp.project.test.service.Square;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
      System.out.println("---------------------------");
       Square square = new Square();
       square.execute();
       System.out.println("---------------------------");
       
       System.out.println("***************************");
       DeviceService d = new DeviceService();
       d.device();
       System.out.println("***************************");
    }
}
