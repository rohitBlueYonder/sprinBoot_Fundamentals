package com.spring.boot.restAPI.SpringBootRestAPI.MovieRecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationsController {

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return Arrays.asList(new Movie(1,"Happy Potter", 9.8),
                new Movie(2,"Lord of the rings", 8.9),
                new Movie(3,"Kung Fu Panda", 9.99),
                new Movie(4,"Avengers",9.5),
                new Movie(5,"Endgame", 6.8),
                new Movie(6,"BigHero 6",9)
        );
    }
}

/*
1) Web layer
- Web interface

2) Service Layer
- Service Interface
- Service Implementation

3) Data Access Layer
- DAO Interface
- DAO Implementation

4) DATABASE

 */