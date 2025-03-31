package br.com.ingressosOnLine.repository;

import br.com.ingressosOnLine.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
