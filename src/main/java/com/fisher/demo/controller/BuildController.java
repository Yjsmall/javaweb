package com.fisher.demo.controller;

import com.fisher.demo.dto.BuildDTO;
import com.fisher.demo.model.Build;
import com.fisher.demo.service.BuildService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/builds")
public class BuildController {
    @Autowired
    private BuildService buildService;

    @Operation(summary = "获取建筑列表")
    @GetMapping("/all")
    public List<BuildDTO> getAllBuilds() {
        return buildService.getAllBuilds();
    }

    @Operation(summary = "建筑详细内容")
    @GetMapping("/all/{id}")
    public Optional<Build> getBuildById(@PathVariable Long id) {
        return buildService.getBuildById(id);
    }
}
