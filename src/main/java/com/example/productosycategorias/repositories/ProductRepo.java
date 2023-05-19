package com.example.productosycategorias.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.productosycategorias.models.Producto;

public interface ProductRepo extends CrudRepository<Producto, Long> {

}
