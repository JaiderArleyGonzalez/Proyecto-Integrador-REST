package edu.ieti.integrador.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import edu.ieti.integrador.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    Usuario findByUserNameAndPassword(String userName, String password);
    boolean existsByUserName(String nombre);
    boolean existsById(int id);
    void deleteByUserName(String userName);
    Optional<Usuario> findByUserName(String userName);
}
