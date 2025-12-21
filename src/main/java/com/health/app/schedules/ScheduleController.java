package com.health.app.schedules;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/schedules")
public class ScheduleController {

    /**
     * 일정 조회 페이지
     */
    @GetMapping("")
    public String scheduleView() {
        return "schedules/view"; // /WEB-INF/views/schedules/view.jsp
    }
}
