package com.example.model;

public class MailBox {
    private String languages;
    private String page_size;
    private boolean spams_filter;
    private String signature;

    public MailBox() {
    }

    public MailBox(String languages, String page_size, boolean spams_filter, String signature) {
        this.languages = languages;
        this.page_size = page_size;
        this.spams_filter = spams_filter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public boolean isSpams_filter() {
        return spams_filter;
    }

    public void setSpams_filter(boolean spams_filter) {
        this.spams_filter = spams_filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
