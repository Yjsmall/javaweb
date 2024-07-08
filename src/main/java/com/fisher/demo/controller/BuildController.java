package com.fisher.demo.controller;

import com.fisher.demo.model.Build;
import com.fisher.demo.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/builds")
public class BuildController {
    @Autowired
    private BuildService buildService;

    @GetMapping
    public List<Build> getAllBuilds() {
        return buildService.getAllBuilds();
    }

    @GetMapping("/{id}")
    public Optional<Build> getBuildById(@PathVariable Long id) {
        return buildService.getBuildById(id);
    }

    @PostMapping
    public Build createBuild(@RequestBody Build build) {
        return buildService.saveBuild(build);
    }

    @PutMapping("/{id}")
    public Build updateBuild(@PathVariable Long id, @RequestBody Build buildDetails) {
        Optional<Build> optionalBuild = buildService.getBuildById(id);
        if (optionalBuild.isPresent()) {
            Build build = optionalBuild.get();
            build.setBuildTime(buildDetails.getBuildTime());
            build.setBuildAddr(buildDetails.getBuildAddr());
            build.setBuildIntro(buildDetails.getBuildIntro());
            build.setLabel(buildDetails.getLabel());
            return buildService.saveBuild(build);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBuild(@PathVariable Long id) {
        buildService.deleteBuildById(id);
    }
}
