package com.example.productosycategorias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.productosycategorias.models.Producto;
import com.example.productosycategorias.services.MainService;

import jakarta.validation.Valid;

@Controller
public class ProductController {
	
	@Autowired
	private MainService mainService;
	
	@GetMapping("/products/new")
	public String formularioProducto(@ModelAttribute("producto") Producto producto) {
		return "newproduct.jsp";
	}
	
	@PostMapping("/products/new")
	public String nuevoProducto(@Valid @ModelAttribute("producto") Producto producto, BindingResult resultado) {
		if(resultado.hasErrors()) {
			return "newproduct.jsp";
		}
		mainService.crearProducto(producto);
		return "redirect:/";
		
	}

}
