package com.baizhi.entity;

import java.io.Serializable;

public class Chapter implements Serializable {
    private Integer id;
    private String title;
    private String duration;
    private double size;
    private String audioPath;
    private String albumId;

    public Chapter() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public Chapter(Integer id, String title, String duration, double size, String audioPath, String albumId) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.size = size;
        this.audioPath = audioPath;
        this.albumId = albumId;
    }


    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", size=" + size +
                ", audioPath='" + audioPath + '\'' +
                ", albumId='" + albumId + '\'' +
                '}';
    }
}
