package com.health.app.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * 메인 대시보드 페이지
     */
    @GetMapping("/")
    public String home() {
        // 나중에 "home"으로 변경될 수 있으나, 현재는 index.jsp를 사용
        return "index"; 
    }

    /**
     * 로그인 페이지
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}