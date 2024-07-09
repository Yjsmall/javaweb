package com.fisher.demo.service;

import com.fisher.demo.converter.BuildingConverter;
import com.fisher.demo.dto.BuildDTO;
import com.fisher.demo.model.Building;
import com.fisher.demo.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;

    public List<BuildDTO> getAllBuilds() {
        var res = new ArrayList<BuildDTO>();
        var builds = buildingRepository.findAll();
        for (var build : builds) {
            var buildDTO = BuildingConverter.convertBuild(build);
            res.add(buildDTO);
        }
        return res;
    }

    public Optional<Building> getBuildById(Long id) {
        return buildingRepository.findById(id);
    }
}

