package com.fisher.demo.model;
import jakarta.persistence.*;


@Entity
@Table(name = "build")
public class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "build_name")
    private String buildName;

    @Column(name = "buid_name_en")
    private String buildNameEn;


    @Column(name = "build_time")
    private String buildTime;

    @Column(name = "build_addr")
    private String buildAddr;

    @Column(name = "build_intro")
    private String buildIntro;

    @Column(name = "label")
    private String label;

    @Column(name = "recommendation")
    private int recommendation;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBuildTime() { return buildTime; }
    public void setBuildTime(String buildTime) { this.buildTime = buildTime; }

    public String getBuildAddr() { return buildAddr; }
    public void setBuildAddr(String buildAddr) { this.buildAddr = buildAddr; }

    public String getBuildIntro() { return buildIntro; }
    public void setBuildIntro(String buildIntro) { this.buildIntro = buildIntro; }

    public String getLabel() { return label; }
    public void setLabel(String protectLevel) { this.label = protectLevel; }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getBuildNameEn() {
        return buildNameEn;
    }

    public void setBuildNameEn(String buildNameEn) {
        this.buildNameEn = buildNameEn;
    }

    public int getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(int recommendation) {
        this.recommendation = recommendation;
    }
}
