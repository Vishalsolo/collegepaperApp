package com.collegepaer.rai.bcasemester2nd;

public class Modelsecond {
    String sd , book,pdflink;

    public Modelsecond() {
    }

    public Modelsecond(String sd, String book, String pdflink) {
        this.sd = sd;
        this.book = book;
        this.pdflink = pdflink;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getPdflink() {
        return pdflink;
    }

    public void setPdflink(String pdflink) {
        this.pdflink = pdflink;
    }
}
