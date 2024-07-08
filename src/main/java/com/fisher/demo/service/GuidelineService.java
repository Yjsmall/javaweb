package com.fisher.demo.service;

import com.fisher.demo.converter.GuidelineConverter;
import com.fisher.demo.dto.GuidelineDTO;
import com.fisher.demo.model.Guideline;
import com.fisher.demo.repository.GuidelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GuidelineService {
    @Autowired
    private GuidelineRepository guidelineRepository;

    public List<GuidelineDTO> getAllGuidelines() {
        var res = new ArrayList<GuidelineDTO>();
        var guidelines = guidelineRepository.findAll();
        for (var guideline : guidelines) {
            var guidelineDTO = GuidelineConverter.convertGuideline(guideline);
            res.add(guidelineDTO);
        }
        return res;
    }

    public Optional<Guideline> getGuidelineById(Long id) {
        return guidelineRepository.findById(id);
    }

}
