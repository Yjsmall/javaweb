package com.fisher.demo.service;

import com.fisher.demo.converter.BuildConverter;
import com.fisher.demo.dto.BuildDTO;
import com.fisher.demo.model.Build;
import com.fisher.demo.repository.BuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BuildService {
    @Autowired
    private BuildRepository buildRepository;

    public List<BuildDTO> getAllBuilds() {
        var res = new ArrayList<BuildDTO>();
        var builds = buildRepository.findAll();
        for (var build : builds) {
            var buildDTO = BuildConverter.convertBuild(build);
            res.add(buildDTO);
        }
        return res;
    }

    public Optional<Build> getBuildById(Long id) {
        return buildRepository.findById(id);
    }
}

