package com.spring.security.server.browser.handler;

import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: daiguoqing
 * @Date: 2020/5/8
 * @Time: 9:05 下午
 * @Version: spring-security-oauth 1.0
 */
@Component
@Slf4j
public class SecurityAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    //AuthenticationFailureHandler接口：登陆成功后进行处理的处理器
    //SimpleUrlAuthenticationFailureHandler是上面接口的实现类，记录了上一次请求的路径
    //HttpSessionRequestCache：提供了缓存客户端请求的能力
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        log.info("登陆失败");
        super.onAuthenticationFailure(request, response, exception);
    }
}