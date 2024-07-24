package br.com.wm.codechella.mvc.controller;

import br.com.wm.codechella.mvc.model.UsuarioMVC;
import br.com.wm.codechella.mvc.service.UsuarioServiceMVC;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/mvc/usuarios")
public class UsuarioControllerMVC {

    @Autowired
    private UsuarioServiceMVC service;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid UsuarioMVC usuario, UriComponentsBuilder uriBuilder) {
        service.cadastrarUsuario(usuario);
        var uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(usuario);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioMVC>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

}
