package com.example.productosycategorias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.productosycategorias.models.Categoria;
import com.example.productosycategorias.services.MainService;

import jakarta.validation.Valid;

@Controller
public class CategoryController {

	@Autowired
	private MainService mainService;
	
	@GetMapping("/categories/new")
	public String formularioCategoria(@ModelAttribute("categoria") Categoria categoria) {
		System.out.println(" SI INGRESE POR AQUI");
		return "newcategory.jsp";
	}
	
	@PostMapping("/categories/new")
	public String nuevoProducto(@Valid @ModelAttribute("categoria") Categoria categoria, BindingResult resultado) {
		if(resultado.hasErrors()) {
			return "newcategory.jsp";
		}
		mainService.crearCategoria(categoria);
		return "redirect:/";
		
	}
}
