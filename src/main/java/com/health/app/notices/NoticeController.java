package com.health.app.notices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notices")
public class NoticeController {

    /**
     * 공지사항 목록 페이지
     */
    @GetMapping("")
    public String noticeList() {
        return "notices/list"; // /WEB-INF/views/notices/list.jsp
    }
}
