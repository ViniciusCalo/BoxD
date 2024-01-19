package system.project.boxd.dao;

import org.springframework.data.repository.CrudRepository;
import system.project.boxd.model.Pedido;

public interface IPedido extends CrudRepository<Pedido, Integer> {
}
