package com.fisher.demo.controller;

import com.fisher.demo.model.Guideline;
import com.fisher.demo.service.GuidelineService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/guidelines")
public class GuidelineController {
    @Autowired
    private GuidelineService guidelineService;

    @Operation(summary = "获取攻略列表")
    @GetMapping("/all")
    public List<Guideline> getGuidelines() {
        return guidelineService.getAllGuidelines();
    }

    @Operation(summary = "攻略详细内容")
    @GetMapping("/{id}")
    public Optional<Guideline> getGuidelineById(@PathVariable Long id) {
        return guidelineService.getGuidelineById(id);
    }
}
