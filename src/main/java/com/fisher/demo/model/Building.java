package com.fisher.demo.model;
import jakarta.persistence.*;


@Entity
@Table(name = "building")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "building_name")
    private String buildingName;

    @Column(name = "building_name_en")
    private String buildingNameEn;


    @Column(name = "building_time")
    private String buildingTime;

    @Column(name = "building_addr")
    private String buildingAddr;

    @Column(name = "building_intro")
    private String buildingIntro;

    @Column(name = "label")
    private String label;

    @Column(name = "recommendation")
    private int recommendation;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "latitude")
    private String latitude;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBuildingTime() { return buildingTime; }
    public void setBuildingTime(String buildingTime) { this.buildingTime = buildingTime; }

    public String getBuildingAddr() { return buildingAddr; }
    public void setBuildingAddr(String buildingAddr) { this.buildingAddr = buildingAddr; }

    public String getBuildingIntro() { return buildingIntro; }
    public void setBuildingIntro(String buildingIntro) { this.buildingIntro = buildingIntro; }

    public String getLabel() { return label; }
    public void setLabel(String protectLevel) { this.label = protectLevel; }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingNameEn() {
        return buildingNameEn;
    }

    public void setBuildingNameEn(String buildingNameEn) {
        this.buildingNameEn = buildingNameEn;
    }

    public int getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(int recommendation) {
        this.recommendation = recommendation;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
