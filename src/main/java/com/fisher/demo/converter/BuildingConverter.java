package com.fisher.demo.converter;

import com.fisher.demo.dto.BuildDTO;
import com.fisher.demo.model.Building;

public class BuildingConverter {
    public static BuildDTO convertBuild(Building building) {
        var res = new BuildDTO();
        res.setId(building.getId());
        res.setName(building.getBuildingName());
        res.setLabel(building.getLabel());
        res.setRecommendation(building.getRecommendation());

        return res;
    }
}
