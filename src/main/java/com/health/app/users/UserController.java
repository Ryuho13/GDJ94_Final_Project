package com.health.app.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    /**
     * 사용자 관리 목록 페이지
     */
    @GetMapping("")
    public String userList() {
        return "users/list"; // /WEB-INF/views/users/list.jsp
    }
}