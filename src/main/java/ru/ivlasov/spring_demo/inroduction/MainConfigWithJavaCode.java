package ru.ivlasov.spring_demo.inroduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfigWithJavaCode {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigWithJavaCode.class);



    }
}
