package com.fisher.demo.service;

import com.fisher.demo.model.Guideline;
import com.fisher.demo.repository.GuidelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuidelineService {
    @Autowired
    private GuidelineRepository guidelineRepository;

    public List<Guideline> getAllGuidelines() {
        return guidelineRepository.findAll();
    }

    public Optional<Guideline> getGuidelineById(Long id) {
        return guidelineRepository.findById(id);
    }

}
