package org.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.generation.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;


@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;	
	
	@Test
	@DisplayName("Prueba el m�todo PUT deproductos y valida el resultado")
	public void pruebaPut() throws Exception{
		this.mockMvc.perform(put("/api/productos/12")
				.queryParam("precio", "65.55"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("65.55")));
	}//PRUEBA PUT
	
	
	@Test
	@DisplayName("Prueba el m�todo POST deproductos y valida el resultado")
	public void pruebaPost() throws Exception{
		Producto p = new Producto();
		p.setNombre("Cuaderno Profesional Scribe Cl�sico / Raya / 100 hojas");
		p.setDescripcion("Pasta semir�gida / Espiral met�lico / Recubrimiento continuo resistente / Gramaje de papel 56 gr. / Margen rojo en escuadra / Cubierta traslucida");
		p.setURL_imagen("producto_7.jpg");
		p.setPrecio(74.22);
		this.mockMvc.perform(post("/api/productos/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p)))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("74.22")));
	}//pruebaPost
	
	public static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString

	
	@Test
	@Disabled
	@DisplayName("Prueba el m�todo DELETE de productos y el resultado")
	public void pruebaDelete() throws Exception{
		this.mockMvc.perform(delete("/api/productos/12"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("MARCADORES")));
	}//pruebaDelete
	
	
	@Test
	@DisplayName("Prueba el m�todo GET de productos con ID 1, 2 y 3 y su contenido")
	public void pruebaGets() throws Exception{
		this.mockMvc.perform(get("/api/productos/1"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Norma 580814")));
		
		this.mockMvc.perform(get("/api/productos/2"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Unicampus")));
		
		this.mockMvc.perform(get("/api/productos/3"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Color 360")));
	}//prueba Gets

}//class EcommerceApplicationTest