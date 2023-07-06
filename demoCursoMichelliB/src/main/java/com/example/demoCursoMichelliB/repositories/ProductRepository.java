package com.example.demoCursoMichelliB.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoCursoMichelliB.models.ProductModel;


public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
    
}
