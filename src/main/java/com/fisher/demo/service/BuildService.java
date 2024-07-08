package com.fisher.demo.service;

import com.fisher.demo.model.Build;
import com.fisher.demo.repository.BuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildService {
    @Autowired
    private BuildRepository buildRepository;

    public List<Build> getAllBuilds() {
        return buildRepository.findAll();
    }

    public Optional<Build> getBuildById(Long id) {
        return buildRepository.findById(id);
    }

    public Build saveBuild(Build build) {
        return buildRepository.save(build);
    }

    public void deleteBuildById(Long id) {
        buildRepository.deleteById(id);
    }
}

