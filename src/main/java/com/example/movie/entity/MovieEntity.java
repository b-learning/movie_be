package com.example.movie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// entity => sẽ đc lưu trong database
// lombok
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {
    
    // id khóa chính
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    String title;
    String description;
    String poster_img;
    String background_img;
    String trailer;
    String dateRelease;
    int rate;
    String comment;
}
