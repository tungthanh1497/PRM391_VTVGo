package com.vedz.tungthanh1497.tungtt_se04896_vtvgo.models;

import java.util.Date;

public class NewsModel {


    private int imgCover;
    private int imgAvatar;
    private String title;
    private Date datePublished;
    private int played;
    private int liked;
    private String detail;
    private String urlDirect;


    public NewsModel(int imgCover, int imgAvatar, String title, Date datePublished, int played, int liked, String detail, String urlDirect) {
        this.imgCover = imgCover;
        this.imgAvatar = imgAvatar;
        this.title = title;
        this.datePublished = datePublished;
        this.played = played;
        this.liked = liked;
        this.detail = detail;
        this.urlDirect = urlDirect;
    }

    public int getImgCover() {
        return imgCover;
    }

    public void setImgCover(int imgCover) {
        this.imgCover = imgCover;
    }

    public int getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(int imgAvatar) {
        this.imgAvatar = imgAvatar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUrlDirect() {
        return urlDirect;
    }

    public void setUrlDirect(String urlDirect) {
        this.urlDirect = urlDirect;
    }
}
