package com.collegepaer.rai;

public class Model {
    String textbook,id,img,pdfLink,videoLink;

    public Model() {
    }

    public Model(String textbook, String id, String img, String pdfLink, String videoLink) {
        this.textbook = textbook;
        this.id = id;
        this.img = img;
        this.pdfLink = pdfLink;
        this.videoLink = videoLink;
    }

    public String getTextbook() {
        return textbook;
    }

    public void setTextbook(String textbook) {
        this.textbook = textbook;
    }

    public String getid() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPdfLink() {
        return pdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pdfLink = pdfLink;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
