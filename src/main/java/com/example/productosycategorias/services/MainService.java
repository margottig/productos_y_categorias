package com.example.productosycategorias.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productosycategorias.models.Categoria;
import com.example.productosycategorias.models.Producto;
import com.example.productosycategorias.repositories.CategoryRepo;
import com.example.productosycategorias.repositories.ProductRepo;

@Service
public class MainService {
	
	@Autowired 
	private ProductRepo productRepo;
	@Autowired 
	private CategoryRepo categoryRepo;
//	@Autowired
//	private ProductsCategoriesRepo productcategoriesRepo;
	
	
	// SERVICIOS PARA PRODUCTO
	public Producto crearProducto(Producto producto) {
		return productRepo.save(producto);
	}
	
	//SERVICIOS PARA CATEGORIAS
	public Categoria crearCategoria(Categoria categoria) {
		return categoryRepo.save(categoria);
	}
	

}
