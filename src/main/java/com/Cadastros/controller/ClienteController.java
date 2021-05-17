package com.Cadastros.controller;


import com.Cadastros.model.Cidade;
import com.Cadastros.model.Cliente;
import com.Cadastros.repository.CidadeRepository;
import com.Cadastros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(value="/cadastros")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @Transactional
    @CacheEvict(value = "/cliente", allEntries = true)
    @PostMapping("/cliente")
    public ResponseEntity<Cliente> gravaCliente (@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteRepository.save(cliente));
    }


    @Transactional
    @CacheEvict(value = "/cliente", allEntries = true)
    @PutMapping("/cliente")
    public ResponseEntity<Cliente> AlteraCliente (@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteRepository.save(cliente));
    }



    @GetMapping("/clientepornome/{nome}")
    public ResponseEntity<List<Cliente>> listaClientePorNome(@PathVariable(value="nome") String nome){
        List<Cliente> clientePorNome = clienteRepository.findByNome(nome);
        return ResponseEntity.ok(clientePorNome);
    }

    @GetMapping("/clienteporid/{id}")
    public ResponseEntity<Cliente> listaClientePorID(@PathVariable(value="id") long id){
        Cliente cliente = clienteRepository.findById(id);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/deletecliente")
    public ResponseEntity<Cliente>  deleteCliente(@RequestBody Cliente cliente){
        clienteRepository.delete(cliente);
        return ResponseEntity.ok(cliente);
    }
}

