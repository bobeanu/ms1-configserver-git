package com.example.ms1configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ms1ConfigserverApplication {

  public static void main(String[] args) {
    SpringApplication.run(Ms1ConfigserverApplication.class, args);
    System.out.print("asdfas");
  }

}
