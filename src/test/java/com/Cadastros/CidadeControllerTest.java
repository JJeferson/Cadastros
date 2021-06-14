package com.Cadastros;


import com.Cadastros.model.Cidade;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.mockito.Mock;

@SpringBootTest
@AutoConfigureMockMvc
public class CidadeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void cidadesTodos() throws Exception{
        mockMvc.perform(get("/cadastros/cidades")).andExpect(status().isOk());
    }

    @Test
    public void gravaCidade() throws Exception{

        Cidade cidadeTeste = new Cidade("teste","RS");
        mockMvc.perform(post("/cadastros/cidade").
                contentType("application/json").
                content(objectMapper.writeValueAsString(cidadeTeste))).
                andExpect(status().isOk());

    }

}
