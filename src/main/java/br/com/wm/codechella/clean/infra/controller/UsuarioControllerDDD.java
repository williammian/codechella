package br.com.wm.codechella.clean.infra.controller;

import br.com.wm.codechella.clean.application.usecases.AlterarUsuario;
import br.com.wm.codechella.clean.application.usecases.CriarUsuario;
import br.com.wm.codechella.clean.application.usecases.ExcluirUsuario;
import br.com.wm.codechella.clean.application.usecases.ListarUsuarios;
import br.com.wm.codechella.clean.domain.entities.usuario.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clean/usuarios")
public class UsuarioControllerDDD {

    private final CriarUsuario criarUsuario;
    private final AlterarUsuario alterarUsuario;
    private final ExcluirUsuario excluirUsuario;
    private final ListarUsuarios listarUsuarios;

    public UsuarioControllerDDD(CriarUsuario criarUsuario, AlterarUsuario alterarUsuario, ExcluirUsuario excluirUsuario, ListarUsuarios listarUsuarios) {
        this.criarUsuario = criarUsuario;
        this.alterarUsuario = alterarUsuario;
        this.excluirUsuario = excluirUsuario;
        this.listarUsuarios = listarUsuarios;
    }

    @PostMapping
    public UsuarioDto cadastrarUsuario(@RequestBody UsuarioDto dto) {
        Usuario usuario = criarUsuario.cadastrarUsuario(new Usuario(dto.cpf(), dto.nome(), dto.nascimento(),
                dto.email()));

        return new UsuarioDto(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }

    @PutMapping("/{cpf}")
    public UsuarioDto atualizarUsuario(@PathVariable String cpf, @RequestBody UsuarioDto dto) {
        Usuario atualizado = alterarUsuario.alterarDadosUsuario(cpf,
                new Usuario(dto.cpf(), dto.nome(), dto.nascimento(), dto.email()));
        return new UsuarioDto(atualizado.getCpf(), atualizado.getNome(), atualizado.getNascimento(), atualizado.getEmail());
    }

    @DeleteMapping("/{cpf}")
    public void excluirUsuario(@PathVariable String cpf) {
        excluirUsuario.excluirUsuario(cpf);
    }

    @GetMapping
    public List<UsuarioDto> listarUsuarios() {
        return listarUsuarios.obterTodosUsuarios().stream()
                .map(u -> new UsuarioDto(u.getCpf(), u.getNome(), u.getNascimento(), u.getEmail()))
                .collect(Collectors.toList());
    }
}
