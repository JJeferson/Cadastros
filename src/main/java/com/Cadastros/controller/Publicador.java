package com.Cadastros.controller;


import com.rabbitmq.client.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


@RestController
@RequestMapping(value="/rabbitmq")
public class Publicador {


    @PostMapping("/envia")
    public String enviaMSG () {


        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare("Tarefa-Teste", true, false, false, null);

            String message = String.join(" ", "argumentos");

            channel.basicPublish("", "Tarefa-Teste",
                    MessageProperties.PERSISTENT_TEXT_PLAIN,
                    message.getBytes("UTF-8"));
            System.out.println(" [x] Sent '" + message + "'");
        } catch (TimeoutException e) {
            return "Deu ruim"+e;
        } catch (IOException e) {
            return "Deu ruim"+e;
        }

        return "feito";
    }

}
