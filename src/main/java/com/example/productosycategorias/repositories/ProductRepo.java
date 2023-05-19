package com.example.productosycategorias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.productosycategorias.models.Producto;

public interface ProductRepo extends CrudRepository<Producto, Long> {
	
	List<Producto> findAll();

}
