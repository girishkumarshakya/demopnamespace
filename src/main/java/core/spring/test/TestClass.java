package core.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestClass {
    public static  void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        String sql = "insert into emp(ID,NAME,SALARY) values(?,?,?)";
        int result = template.update(sql,2342,"ASHISH",123456);
        System.out.println("Row inserted successfully "+result);

    }
}
