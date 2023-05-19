package com.example.productosycategorias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.productosycategorias.models.Categoria;
import com.example.productosycategorias.models.Producto;

public interface CategoryRepo extends CrudRepository<Categoria, Long>{
	List<Categoria> findAll();
	List<Categoria> findByProductsNotContains(Producto producto);
}
