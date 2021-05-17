package com.Cadastros.repository;


import com.Cadastros.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {
    Cidade findById(long id);

    @Query("select c from Cidade c where c.Nome like %:Nome%")
    public List<Cidade> findByNome(String Nome);

    @Query("select c from Cidade c where c.Estado like %:Estado%")
    public List<Cidade> findByEstado(String Estado);
}