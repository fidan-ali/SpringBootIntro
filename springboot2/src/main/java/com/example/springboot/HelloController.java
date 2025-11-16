package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        // Format date and time as string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        // Return message
        return "Hello, current date and time: " + formattedDateTime;
    }
}
