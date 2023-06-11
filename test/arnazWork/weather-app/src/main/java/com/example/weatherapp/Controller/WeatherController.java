package com.example.weatherapp.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/")
public class WeatherController {
	
	
//	@RequestMapping("/")
//    public String home() {
//        return "index";
//    }

    @GetMapping("/weather")
    public ResponseEntity<String> getWeather(@RequestParam("country") String country) {
        String apiKey = "your-api-key";
        String apiUrl = "https://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + country;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

        // You can add additional error handling and validation here
        
//        System.out.println("res"+response);

        return response;
    }
}
