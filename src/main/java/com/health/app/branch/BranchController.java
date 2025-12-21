package com.health.app.branch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/branches")
public class BranchController {

  
    @GetMapping("")
    public String branchList() {
        return "branch/list"; // /WEB-INF/views/branch/list.jsp
    }
}