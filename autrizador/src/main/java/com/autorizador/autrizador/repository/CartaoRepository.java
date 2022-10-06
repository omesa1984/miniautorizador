package com.autorizador.autrizador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autorizador.autrizador.entity.CartaoEntity;

@Repository
public interface CartaoRepository extends JpaRepository<CartaoEntity, String>{
    
}
