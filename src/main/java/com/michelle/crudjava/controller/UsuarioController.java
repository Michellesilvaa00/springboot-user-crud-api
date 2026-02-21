package com.michelle.crudjava.controller;
import com.michelle.crudjava.model.Usuario;
import com.michelle.crudjava.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository){
        this.repository = repository;
    }
    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }
    @GetMapping
    public List<Usuario>listar(){
        return repository.findAll();
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }
    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado){

        return repository.findById(id)
                .map(usuario ->{
                    usuario.setNome(usuarioAtualizado.getNome());
                    usuario.setEmail(usuarioAtualizado.getEmail());
                    return repository.save(usuario);
                })
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
}
