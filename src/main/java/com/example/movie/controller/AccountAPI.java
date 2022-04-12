package com.example.movie.controller;

import com.example.movie.dto.request.SignUpForm;
import com.example.movie.entity.AccountEntity;
import com.example.movie.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountAPI {
    
    @Autowired
    AccountRepository accountRepository;
    
    @PostMapping("/account")
    public ResponseEntity createAccount(@RequestBody SignUpForm form){
        AccountEntity newAccount = new AccountEntity();
        newAccount.setEmail(form.getEmail());
        newAccount.setUsername(form.getUsername());
        newAccount.setPassword(form.getPassword());
        newAccount.setAvatar("https://icon-library.com/images/anonymous-avatar-icon/anonymous-avatar-icon-9.jpg");
        newAccount.setRole("user");
        return ResponseEntity.ok(accountRepository.save(newAccount));
    }
}
