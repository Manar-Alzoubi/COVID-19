package com.example.covid19.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyRecordsController {

    @GetMapping("/myRecords")
    String getRecords()
    {
        return "myRecords";
    }
}
