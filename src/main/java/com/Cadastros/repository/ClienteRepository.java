package com.Cadastros.repository;

import com.Cadastros.model.Cidade;
import com.Cadastros.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    Cliente findById(long id);

    @Query("select c from Cliente c where c.NomeCompleto like %:Nome%")
    public List<Cliente> findByNome(String Nome);

}