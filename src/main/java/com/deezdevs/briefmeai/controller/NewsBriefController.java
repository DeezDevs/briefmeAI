package com.deezdevs.briefmeai.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news-brief")
public class NewsBriefController {

    @GetMapping(value = "/general-brief", produces = MediaType.APPLICATION_JSON_VALUE)
    public NewsSummaryResponse generalBrief() {
        return NewsBriefService.generateGeneralNewsBrief();
    }

    @GetMapping(value = "/general-brief/render", produces = MediaType.TEXT_HTML_VALUE)
    public NewsSummaryResponse generalBrief() {
        return NewsBriefService.generateGeneralNewsBrief();
    }
}
