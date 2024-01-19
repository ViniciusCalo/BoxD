package system.project.boxd.dao;

import org.springframework.data.repository.CrudRepository;
import system.project.boxd.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}
