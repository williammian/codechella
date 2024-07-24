package br.com.wm.codechella.ddd.vendas.aplicacao.usuario;

import br.com.wm.codechella.ddd.vendas.infra.usuario.Usuario;
import br.com.wm.codechella.ddd.vendas.infra.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public DadosUsuario cadastrarUsuario(DadosCadastroUsuario dadosUsuario) {
        Usuario usuario = new Usuario(dadosUsuario);
        repository.save(usuario);
        return converteDados(usuario);
    }

    public List<DadosUsuario> listarTodos() {
        return repository.findAll().stream()
                .map(u -> converteDados(u))
                .collect(Collectors.toList());
    }

    private DadosUsuario converteDados(Usuario usuario) {
        return new DadosUsuario(usuario.getId(), usuario.getCpf(),
                usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }
}
