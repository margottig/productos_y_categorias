package com.example.productosycategorias.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productosycategorias.models.Categoria;
import com.example.productosycategorias.models.Producto;
import com.example.productosycategorias.models.ProductosCategorias;
import com.example.productosycategorias.repositories.CategoryRepo;
import com.example.productosycategorias.repositories.ProductRepo;
import com.example.productosycategorias.repositories.ProductsCategoriesRepo;

@Service
public class MainService {
	
	@Autowired 
	private ProductRepo productRepo;
	@Autowired 
	private CategoryRepo categoryRepo;
	@Autowired
	private ProductsCategoriesRepo productcategoriesRepo;
	
	
	// SERVICIOS PARA PRODUCTO
	public Producto crearProducto(Producto producto) {
		return productRepo.save(producto);
	}
	public List<Producto> todosProductos(){
		return productRepo.findAll();
		}
	public Producto getProducto(Long idProducto) {
		return productRepo.findById(idProducto).orElse(null);
	}
	
	//SERVICIOS PARA CATEGORIAS
	public Categoria crearCategoria(Categoria categoria) {
		return categoryRepo.save(categoria);
	}
	public List<Categoria> todosCategorias(){
		return categoryRepo.findAll();
		}
	public List<Categoria> productoSinCategoria(Producto producto){
		return categoryRepo.findByProductsNotContains(producto);
	}
	
	
	//SERVICIOS TABLA INTERMEDIA
	public ProductosCategorias crearVinculo(ProductosCategorias productoscategorias) {
		return productcategoriesRepo.save(productoscategorias);
	}
	

}
