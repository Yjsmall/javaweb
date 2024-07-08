package com.fisher.demo.converter;

import com.fisher.demo.dto.GuidelineDTO;
import com.fisher.demo.model.Guideline;

public class GuidelineConverter {
    public static GuidelineDTO convertGuideline(Guideline guideline) {
        var res = new GuidelineDTO();
        res.setId(guideline.getId());
        res.setTitle(guideline.getTitle());
        return res;
    }
}
