package com.test12052020.test12052020.controller;

import com.test12052020.test12052020.SocketTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

@RestController
public class HelloController {
    @RequestMapping("/")
   /* public String getHelloWorld() {
        public static void main (String[] args) throws IOException {
            try (Socket s =new Socket("time-a.nist.gov", 13);
                 Scanner in = new Scanner(s.getInputStream(), "UTF-8")){
                while ( in.hasNextLine()){
                    String line = in.nextLine();
                    //System.out.println(line);
                }
            }
        }*/
        //return "Hello world";
        return SocketTest();
    }
}
