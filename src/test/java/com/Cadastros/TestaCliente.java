package com.Cadastros;

import com.Cadastros.model.Cliente;
import com.Cadastros.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.mock;



@SpringBootTest
public class TestaCliente {

    @Mock
    ClienteRepository clienteRepository ;
    @Test
    void  testaSaveCliente() {
        /*
        Cliente clienteTeste  = mock(Cliente.class);
        Cliente  salvaCliente  = clienteRepository.save(clienteTeste);
        assertEquals(notNull(),salvaCliente);

         */
    }


}
