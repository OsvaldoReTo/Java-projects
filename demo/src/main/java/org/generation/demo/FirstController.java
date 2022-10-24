package org.generation.demo;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//CRUD -Create - Read - Update - Delete
//HTTP -POST  - *GET   - PUT  - *DELETE

@RestController
@RequestMapping(path="/api/productos/")//http://localhost:8080/api/gen
public class FirstController {
	private final ProductoService productoService;
	
	@Autowired
	public FirstController(ProductoService productoService) {
		super();
		this.productoService = productoService;
	}



	@GetMapping
	public List<Producto> getAllProducts(){
		return productoService.getProductos();
	}
	
	@GetMapping (path="{prodId}") // http://localhost:8080/api/productos/1
	public Producto getProduct(@PathVariable("prodId") Long id) {
		return productoService.getProducto(id);
	}//getProduct
	
	@DeleteMapping (path="{prodId}") // http://localhost:8080/api/productos/1
	public Producto deleteProduct(@PathVariable("prodId") Long id) {
		return productoService.deleteProducto(id);
	}//deleteProduct
	
	@PostMapping
	public Producto addProduct(@RequestBody Producto producto) {
		return productoService.addProducto(producto);
		
	}//addProduct
	
	@PutMapping (path="{prodId}")
	// http: //localhost:8080/api/productos
	public Producto updateProduct(@PathVariable("prodId") Long id, 
		@RequestParam(required = false) String nombre,
		@RequestParam(required = false) String descripcion,
		@RequestParam(required = false) String URL_imagen,
		@RequestParam(required = false) Double precio) {
		return productoService.updateProducto(id, nombre, descripcion, URL_imagen, precio);
		
	}//updateProduct
	
}//class FirstController 
	
//	//@GetMapping
//	public String getNombres() {
//		String nombres = "Nayeli, Mafer,  Gadi, Mel, Alam, Brandon, Gustavo, Osvaldo";
//		return nombres;
//	}
//	
//	@GetMapping
//	public List<String> inventaNombres() {
//		List<String> nombres = List.of("Nayeli", "Mafer",  "Gadi", "Mel", "Alam", "Brandon", "Gustavo", "Osvaldo");
//		return nombres;
//	}

