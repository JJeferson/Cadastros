package com.Cadastros.controller;


import com.Cadastros.MQConfig.MqConfig;
import com.Cadastros.Mensagem.CustomMessage01;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping(value="/rabbitmq")
public class MessagePublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage01 message){
        message.setMessageID(UUID.randomUUID().toString());
        message.setMessageDate(new Date());
        message.setMessage("teste de mensagem");

        template.convertAndSend(MqConfig.EXCHANGE,
                MqConfig.ROUNTING_KEY,message);

    return "publicado";
    }

}
