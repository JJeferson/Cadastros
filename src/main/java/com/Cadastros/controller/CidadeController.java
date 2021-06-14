package com.Cadastros.controller;


import com.Cadastros.model.Cidade;
import com.Cadastros.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(value="/cadastros")
public class CidadeController {

    @Autowired
    CidadeRepository cidadeRepository;

    @Transactional
    @CacheEvict(value = "/cidade", allEntries = true)
    @PostMapping("/cidade")
    public ResponseEntity<Cidade> gravaCidade (@RequestBody Cidade cidade){
        return ResponseEntity.ok(cidadeRepository.save(cidade));
    }

    @GetMapping("/cidadepornome/{nome}")
    public ResponseEntity<List<Cidade>> listaCidadePorNome(@PathVariable(value="nome") String nome){
        List<Cidade> cidadePorNome = cidadeRepository.findByNome(nome);
        return ResponseEntity.ok(cidadePorNome);
    }


    @GetMapping("/cidadeporestado/{estado}")
    public ResponseEntity<List<Cidade>> listaCidadePorEstado(@PathVariable(value="estado") String estado){
        List<Cidade> cidadePorEstado = cidadeRepository.findByNome(estado);
        return ResponseEntity.ok(cidadePorEstado);
    }

    @GetMapping("/cidades")
    public ResponseEntity<List<Cidade>> cidadesTodos(){
        return ResponseEntity.ok(cidadeRepository.findAll());
    }


}