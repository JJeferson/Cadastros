package com.Cadastros;

import com.Cadastros.model.Cidade;
import com.Cadastros.model.Cliente;
import com.Cadastros.repository.CidadeRepository;
import com.Cadastros.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
class CadastrosApplicationTests {

	@Mock
	CidadeRepository cidadeRepository ;
	@Test
	void  testaSaveCidade() {
		Cidade  cidadeTeste  = mock(Cidade.class);
		Cidade  salvaCidade  = cidadeRepository.save(cidadeTeste);
        assertEquals(notNull(),salvaCidade);
	}

	@Mock
	ClienteRepository clienteRepository ;
	@Test
	void  testaSaveCliente() {
		Cliente  clienteTeste  = mock(Cliente.class);
		Cliente  salvaCliente  = clienteRepository.save(clienteTeste);
		assertEquals(notNull(),salvaCliente);
	}

}
