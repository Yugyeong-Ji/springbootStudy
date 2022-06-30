package com.jojoldu.admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.jojoldu.admin.web.HelloController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)//스프링부트 테스트와 JUnit 사이의 연결자 역할을 함.
@WebMvcTest(HelloController.class)//Controller 사용을 가능하도록 함.
public class HelloControllerTest {
    @Autowired//Bean을 주입받음.
    private MockMvc mvc;//스프링 MVC 테스트의 시작점. HTTP GET, POST 등에 대한 API 테스트 가능하게 함.

    @Test
    public void helloReturn() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))//MockMvc를 통해 url로 HTTP GET 요청
                .andExpect(status().isOk())//HTTP header의 Status를 검증. isOK()는 그중에서도 200(OK)인지 아닌지 검증.
                .andExpect(content().string(hello));//응답 본문의 내용을 검증. "hello"를 리턴하는게 맞는지 검증.
    }
}
