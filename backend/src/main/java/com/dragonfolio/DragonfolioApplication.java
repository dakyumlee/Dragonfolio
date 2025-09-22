package com.dragonfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DragonfolioApplication {
    public static void main(String[] args) {
        SpringApplication.run(DragonfolioApplication.class, args);
    }
}

@Controller
class WebController {
    @GetMapping("/")
    public String index() { 
        return "forward:/index.html"; 
    }
    
    @GetMapping("/portfolio")
    public String portfolio() { 
        return "forward:/portfolio.html"; 
    }
    
    @GetMapping("/guestbook")
    public String guestbook() { 
        return "forward:/guestbook.html"; 
    }
    
    @GetMapping("/contact")
    public String contact() { 
        return "forward:/contact.html"; 
    }
    
    @GetMapping("/admin")
    public String admin() { 
        return "forward:/admin.html"; 
    }
}
