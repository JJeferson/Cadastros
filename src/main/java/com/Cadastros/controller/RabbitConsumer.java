package com.Cadastros.controller;

import com.Cadastros.MQConfig.MqConfig;
import com.Cadastros.Mensagem.CustomMessage01;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class RabbitConsumer {

    @RabbitListener(queues = MqConfig.QUEUE)
    public void consumeMessageFromQueue(CustomMessage01 message) {
        System.out.println("Mensagem recebida da queue : " + message);
    }
}
