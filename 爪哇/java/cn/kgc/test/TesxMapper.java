package cn.kgc.test;

import cn.kgc.entity.Users;
import cn.kgc.mapper.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesxMapper {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper bean = ctx.getBean(UserMapper.class);
        Users user = new Users(null,null,null,null,null,null,"a83e73f434f8040e1b4186ea37471c0c.jpeg");
        Integer integer = bean.updateUser(user);
        System.out.println(integer);
    }
}
