package com.hatchyard.todoservice.aspect;

import com.hatchyard.todoservice.entity.Todo;
import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
//@Aspect
//@Component
@Slf4j
public class TodoAspect {

//    private static final String TOPIC = "my_topic";

   /* @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;*/

    @Before(value = "execution(* com.hatchyard.todoservice.service.TodoService.*(..)) && args(todo)")
    public void beforeAdvice(JoinPoint joinPoint, Todo todo) {
        log.info("###### Before method:" + joinPoint.getSignature());

        log.info("###### Creating Tdo with name - " + todo.getTodoName());
}

    @After(value = "execution(* com.hatchyard.todoservice.service.TodoService.*(..)) && args(todo)")
    public void afterAdvice(JoinPoint joinPoint, Todo todo) {
        log.info("###### After method:" + joinPoint.getSignature());

        log.info("###### Successfully created Tdo with name - " + todo.getTodoName());
//        log.info("### Producing Kafka Message ");
//        this.kafkaTemplate.send(TOPIC, "##### A new TODO has been created : " + todo.getTodoName());
    }


   /* @Pointcut("execution(* com.hatchyard.todoservice.service.TodoService.getTodos(..))")
    public void getTodos(){
        log.info("###### Listing Todo's - " + todo.getTodoName());

    }*/
}
