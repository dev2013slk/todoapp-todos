package com.hatchyard.todoservice.adapter.out.context;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
@Aspect
@Component
@Slf4j
public class TodoAspectAdapter {

   /* private static final String TOPIC = "my_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Before(value = "execution(* com.hatchyard.todoservice.service.TodoService.*(..)) && args(todoDomain)")
    public void beforeAdvice(JoinPoint joinPoint, TodoDomain todoDomain) {
        log.info("###### Before method:" + joinPoint.getSignature());

        log.info("###### Creating Tdo with name - " + todoDomain.getTodoName());
}

    @After(value = "execution(* com.hatchyard.todoservice.service.TodoService.*(..)) && args(todoDomain)")
    public void afterAdvice(JoinPoint joinPoint, TodoDomain todoDomain) {
        log.info("###### After method:" + joinPoint.getSignature());

        log.info("###### Successfully created Tdo with name - " + todoDomain.getTodoName());
        log.info("### Producing Kafka Message ");
        this.kafkaTemplate.send(TOPIC, "##### A new TODO has been created : " + todoDomain.getTodoName());
    }*/


   /* @Pointcut("execution(* com.hatchyard.todoservice.usecase.CreateUseCase.getTodos(..))")
    public void getTodos(){
        log.info("###### Listing TodoDomain's - " + todoDomain.getTodoName());

    }*/
}
