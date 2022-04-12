
package com.example.movie.repository;

import com.example.movie.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AccountRepository extends JpaRepository<AccountEntity, Long>{
    
}
