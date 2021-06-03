package com.Cadastros;


import com.Cadastros.model.Cidade;
import com.Cadastros.repository.CidadeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.mock;

@SpringBootTest
public class TestaCidade {

    @Mock
    CidadeRepository cidadeRepository ;
    @Test
    void  testaSave() {
        /*
        Cidade cidadeTeste  = mock(Cidade.class);
        Cidade  salvaCidade  = cidadeRepository.save(cidadeTeste);
        assertEquals(notNull(),salvaCidade);
        */

    }

}
