package bitcamp.project.test;

import bitcamp.project.test.service.DeviceService;

public class App {

  public static void main(String[] args) {
    System.out.println("***************************");
    DeviceService d = new DeviceService();
    d.device();
    System.out.println("***************************");
  }

}
