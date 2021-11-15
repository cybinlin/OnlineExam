package com.onlineexam.backend;
import com.onlineexam.backend.mapper.LoginMapper;;
import com.onlineexam.backend.service.impl.LoginServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {
    @Autowired
    LoginMapper loginMapper;
    @Autowired
    LoginServiceImpl loginService;

    @Test
    void contextLoads() {
        System.out.println(loginService.studentLogin(211027058,"123456"));
    }
}
