package com.fisher.demo.converter;

import com.fisher.demo.dto.BuildDTO;
import com.fisher.demo.model.Build;

public class BuildConverter {
    public static BuildDTO convertBuild(Build build) {
        var res = new BuildDTO();
        res.setId(build.getId());
        res.setName(build.getBuildName());
        res.setLabel(build.getLabel());
        res.setRecommendation(build.getRecommendation());

        return res;
    }
}
