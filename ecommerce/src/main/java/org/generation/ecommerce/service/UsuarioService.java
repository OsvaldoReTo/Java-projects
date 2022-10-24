package org.generation.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.generation.ecommerce.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}//constructor
	
	public List<Usuario> getUsuarios(){
		return usuarioRepository.findAll();
	}//getUsuarios
	
	public Usuario getUsuario(Long userId){
		return usuarioRepository.findById(userId).orElseThrow(
				()->new IllegalArgumentException("El Usuario con el id " + userId + " no existe.")
				);
	}//getProductos
	
	public Usuario deleteUsuario(Long userId) {
		Usuario tmpUser=null;
		if(usuarioRepository.existsById(userId)) {
			tmpUser = usuarioRepository.findById(userId).get();
			usuarioRepository.deleteById(userId);
		}//if exist
		return tmpUser;
	}//deleteProducto
	
	public Usuario addUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}//addProducto
	
	public Usuario updateUsuario(Long userId, String password, String newPassword) {
		Usuario tmpUser = null;
		if(usuarioRepository.existsById(userId)) {
			tmpUser = usuarioRepository.findById(userId).get();
			if((password!=null) && (newPassword!=null)){
				if (password.equals(tmpUser.getPassword())) {
					tmpUser.setPassword(newPassword);
					usuarioRepository.save(tmpUser);
				}//if password.equals
			}//if !=null
		}//if
		return tmpUser;
	}//updateUsuario
	
	public boolean validaUsuario(Usuario usuario) {
		boolean res  =false;
		Optional<Usuario> userByUsername = usuarioRepository.findByUsername(usuario.getUsername());
		if (userByUsername.isPresent()) {
			Usuario u = userByUsername.get();
			if(u.getPassword().equals(usuario.getPassword()) ) {
				res = true;
			}//if password
		}//if
		return res;
	}//validausuario
	
}
