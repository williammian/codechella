package br.com.wm.codechella.clean.config;

import br.com.wm.codechella.clean.application.gateways.RepositorioDeUsuario;
import br.com.wm.codechella.clean.application.usecases.AlterarUsuario;
import br.com.wm.codechella.clean.application.usecases.CriarUsuario;
import br.com.wm.codechella.clean.application.usecases.ExcluirUsuario;
import br.com.wm.codechella.clean.application.usecases.ListarUsuarios;
import br.com.wm.codechella.clean.infra.gateways.RepositorioDeUsuarioJpa;
import br.com.wm.codechella.clean.infra.gateways.UsuarioEntityMapper;
import br.com.wm.codechella.clean.infra.persistence.UsuarioRepositoryDDD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new CriarUsuario(repositorioDeUsuario);
    }

    @Bean
    AlterarUsuario alterarUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new AlterarUsuario(repositorioDeUsuario);
    }

    @Bean
    ExcluirUsuario excluirUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new ExcluirUsuario(repositorioDeUsuario);
    }

    @Bean
    ListarUsuarios listarUsuarios(RepositorioDeUsuario repositorioDeUsuario){
        return new ListarUsuarios(repositorioDeUsuario);
    }

    @Bean
    RepositorioDeUsuarioJpa criarRepositorioJpa(UsuarioRepositoryDDD repositorio, UsuarioEntityMapper mapper){
        return new RepositorioDeUsuarioJpa(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper(){
        return new UsuarioEntityMapper();
    }
}
