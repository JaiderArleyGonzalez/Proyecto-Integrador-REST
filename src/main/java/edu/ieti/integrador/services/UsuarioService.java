package edu.ieti.integrador.services;

import edu.ieti.integrador.model.Usuario;
import edu.ieti.integrador.repository.UsuarioRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Data
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional
    public void deleteUserName(String userName) {
        usuarioRepository.deleteByUserName(userName);
    }

    public void updateUser(Usuario user) {
        if(usuarioRepository.existsById(user.getId())){
            usuarioRepository.save(user);
        }
    }

    public boolean login(String userName, String password) {
        Usuario user = usuarioRepository.findByUserNameAndPassword(userName, password);
        return user != null;
    }

    public Optional<Usuario> getUsuarioByUserName(String userName) {
        return usuarioRepository.findByUserName(userName);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public void registrarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public boolean existsById(int id) {
        return usuarioRepository.existsById(id);
    }

    public boolean existsByUserName(String userName) {
        return usuarioRepository.existsByUserName(userName);
    }
}
