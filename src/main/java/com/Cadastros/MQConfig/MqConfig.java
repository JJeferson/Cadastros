package com.Cadastros.MQConfig;

 import org.springframework.amqp.core.Binding;
 import org.springframework.amqp.core.BindingBuilder;
 import org.springframework.amqp.core.Queue;
 import org.springframework.amqp.core.TopicExchange;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;

@Configuration
public class MqConfig {
    public static final String QUEUE = "message_queue";
    public static final String EXCHANGE="message_exchange";
    public static final String ROUNTING_KEY="message_rountingKey";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(EXCHANGE);
    }

    public Binding binding(Queue queue,TopicExchange exchange){
        return BindingBuilder.bind(queue)
                .to(exchange).with(ROUNTING_KEY);
    }//parei em 9:57
    //https://www.youtube.com/watch?v=5kxLeR_YuIk&ab_channel=DailyCodeBuffer
}
