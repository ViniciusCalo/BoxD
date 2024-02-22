package system.project.boxd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.project.boxd.dao.IMoradia;
import system.project.boxd.model.Moradia;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/moradias")
public class MoradiaController {
    @Autowired
    private IMoradia dao;

    @GetMapping
    public List<Moradia> listaMoradia(){
        return (List<Moradia>) dao.findAll();
    }
    @PostMapping
    public Moradia registraMoradia (@RequestBody Moradia moradia){
        Moradia registraMoradia = dao.save(moradia);
        return registraMoradia;
    }
    @PutMapping
    public Moradia editaMoradia (@RequestBody Moradia moradia) {
        Moradia registraMoradia = dao.save(moradia);
        return registraMoradia;
    }
    @DeleteMapping("/{idMoradia}")
    public Optional<Moradia> deletaMoradia (@PathVariable Integer id) {
        Optional<Moradia> moradia = dao.findById(id);
        dao.deleteById(id);
        return moradia;
    }
}
