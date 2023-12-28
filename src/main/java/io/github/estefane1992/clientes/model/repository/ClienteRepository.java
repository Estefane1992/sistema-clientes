package io.github.estefane1992.clientes.model.repository;

import io.github.estefane1992.clientes.model.entily.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
