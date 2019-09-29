package com.projectTodo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.projectTodo.dao")
@EnableTransactionManagement
public class ProjectTodoApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProjectTodoApp.class);
    }
}
