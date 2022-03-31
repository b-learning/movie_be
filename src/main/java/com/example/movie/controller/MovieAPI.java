package com.example.movie.controller;

import com.example.movie.entity.MovieEntity;
import com.example.movie.repository.MovieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieAPI {
    // nhận request của front end
    
    @Autowired // giúp new 1 cái object DI: Dependence Injection
    MovieRepository movieRepository;
    
    @GetMapping("/movie")
    public ResponseEntity getAllMovie(){
        // sẽ đc chạy
        // DataJPA dựa trên Hibernate
        List<MovieEntity> listMovie = movieRepository.findAll();
        return ResponseEntity.ok(listMovie);
    }
    
    
    //java.lang.NullPointerException
}
