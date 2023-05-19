package com.example.productosycategorias.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.productosycategorias.models.Categoria;

public interface CategoryRepo extends CrudRepository<Categoria, Long>{

}
