package com.ywh.ec.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Video {
    private int id;
    private String title;
    private String summary; // 概要
    private int price;
    @JsonProperty("cover_img")
    private String coverImg; // 封面

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date createTime; // 创建时间

//    @JsonInclude(JsonInclude.Include.NON_NULL)  // 空字段不返回
    private List<Chapter> chapters;

    public Video(){

    }
    public Video(int id, String title) {
        this.id = id;
        this.title = title;
        this.createTime = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                ", coverImg='" + coverImg + '\'' +
                ", createTime=" + createTime +
                ", chapters=" + chapters +
                '}';
    }
}
