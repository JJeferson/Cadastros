package com.Cadastros.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rabbitmq")
@RabbitListener(queues = "Tarefa-Teste")
public class Recebedor {

    private String msgRecebida="";

    @RabbitHandler
    public void recebeMSG (String msg){
        System.out.println(" [x] Received '" + msg + "'");
        msgRecebida=msg;
    }

    @GetMapping("/recebe")
    public String enviaMSG () {
        return " [x] Received '" + msgRecebida + "'";
       }
}
