package com.teno;

import com.teno.entity.User;
import com.teno.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KssWebProjectApplicationTests {

    @Autowired
    private UserMapper mapper;

    @Test
    void testSelect() {
        System.out.println("(----- selectAll method test -----)");
        List<User> userList = mapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
