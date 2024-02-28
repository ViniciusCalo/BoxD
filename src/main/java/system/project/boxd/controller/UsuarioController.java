package system.project.boxd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import system.project.boxd.dao.IUsuario;
import system.project.boxd.model.Usuario;

import java.net.PasswordAuthentication;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuario dao;
    @Autowired
    private PasswordEncoder encoder;

    @GetMapping("/cadastro")
    public List<Usuario> listaUsuario(){
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario cadastrarUsuario (@RequestBody Usuario usuario){
        Usuario novoUsuario = dao.save(usuario);
        return novoUsuario;
    }
    @PutMapping
    public Usuario editaUsuario(@RequestBody Usuario usuario){
        Usuario novoUsuario = dao.save(usuario);
        return novoUsuario;
    }
    @DeleteMapping("/{idUsuario}")
    public Optional<Usuario> deletaUsuario (@PathVariable Integer id){
        Optional<Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }
}
