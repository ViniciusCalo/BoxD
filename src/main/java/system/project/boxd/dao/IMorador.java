package system.project.boxd.dao;

import org.springframework.data.repository.CrudRepository;
import system.project.boxd.model.Morador;

public interface IMorador extends CrudRepository<Morador, Integer> {
}
