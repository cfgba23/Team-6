package com.example.back.repositories;

import com.example.back.model.Entrepreneur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepreneurRepository extends JpaRepository<Entrepreneur,Long> {
    Entrepreneur findByEmailAndPassword(String email, String password);


}
