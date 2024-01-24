package system.project.boxd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.project.boxd.dao.IPedido;
import system.project.boxd.model.Pedido;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private IPedido dao;

    @GetMapping
    public List<Pedido> listaPedidos(){
        return (List<Pedido>) dao.findAll();
    }

    @PostMapping
    public Pedido criarPedido (@RequestBody Pedido pedido){
        Pedido novoPedido = dao.save(pedido);
        return novoPedido;
    }

    @PutMapping
    public Pedido editaPedido(@RequestBody Pedido pedido){
        Pedido novoPedido = dao.save(pedido);
        return novoPedido;
    }

    @DeleteMapping("/{idPedido}")
    public Optional<Pedido> deletaPedido(@PathVariable Integer id){
        Optional<Pedido> pedido = dao.findById(id);
        dao.deleteById(id);
        return pedido;
    }
}
