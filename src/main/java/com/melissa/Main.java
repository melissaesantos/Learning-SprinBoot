package com.melissa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//import java.util.Objects;

//
@SpringBootApplication
//needed for get,post,mapping will be exposed as rest endpoints that clients can call
@RestController
public class Main {
    // inorder for this to be a spring boot application we have to add a couple of things

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
//rest endpoint that clients can use as get requests
    //local host 8080 is the root when /
    @GetMapping("/greet")
    public GreetResponse greet(){
        //returns a JSON object
        //this is also the response we want to send back to the client
        GreetResponse response= new GreetResponse("Hello World",
                List.of("Java", "Golang", "JavaScript"),
                new Person("Alex",25,30_000)
                );
        return response;
    }
    record Person(String name, int age, double savings){}

    //this is a class
    //record is a class that helps us achieve immutability
    record GreetResponse(
            //these are the keys and in the greet() method we have the values
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ) {}
//this is what Jackson is doing for us: It turns the Java objects into JSOn objecs without us having to do anything






    // the class GreetResponse is the same as doing record GreetResponse{}
//    class GreetResponse {
//        private final String greet;
//        private
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{"+
//                    "greet='" + greet + '\''+ '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hashCode(greet);
      // }
    //}
}
