package com.example.andreza.harvardmuseums.model;

import java.util.List;

public class MuseumResponse {
    private List<Artwork> records;

    public List<Artwork> getRecords() {
        return records;
    }

    public void setRecords(List<Artwork> records) {
        this.records = records;
    }
}