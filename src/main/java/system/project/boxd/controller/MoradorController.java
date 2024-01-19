package system.project.boxd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.project.boxd.dao.IMorador;
import system.project.boxd.model.Morador;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/moradores")
public class MoradorController {
    @Autowired
    private IMorador dao;

    @GetMapping
    public List<Morador> listaMorador(){
        return (List<Morador>) dao.findAll();
    }

    @PostMapping
    public Morador cadastrarMorador (@RequestBody Morador morador){
        Morador novoMorador = dao.save(morador);
        return novoMorador;
    }

    @PutMapping
    public Morador editaMorador(@RequestBody Morador morador){
        Morador novoMorador = dao.save(morador);
        return novoMorador;
    }

    @DeleteMapping("{/id}")
    public Optional<Morador> deletaMorador (@PathVariable Integer id){
        Optional<Morador> morador = dao.findById(id);
        dao.deleteById(id);
        return morador;
    }

}
