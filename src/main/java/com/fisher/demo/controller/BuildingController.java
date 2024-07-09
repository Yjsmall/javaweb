package com.fisher.demo.controller;

import com.fisher.demo.dto.BuildDTO;
import com.fisher.demo.model.Building;
import com.fisher.demo.service.BuildingService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/buildings")
public class BuildingController {
    @Autowired
    private BuildingService buildingService;

    @Operation(summary = "获取建筑列表")
    @GetMapping("/all")
    public List<BuildDTO> getAllBuilds() {
        return buildingService.getAllBuilds();
    }

    @Operation(summary = "建筑详细内容")
    @GetMapping("/all/{id}")
    public Optional<Building> getBuildById(@PathVariable Long id) {
        return buildingService.getBuildById(id);
    }
}
