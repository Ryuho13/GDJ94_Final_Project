package com.health.app.statistics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    /**
     * 통계 페이지
     */
    @GetMapping("")
    public String statisticsView() {
        return "statistics/view"; // /WEB-INF/views/statistics/view.jsp
    }
}
