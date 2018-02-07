package com.ypakovkin.model;

public class ItemMenu extends Entity<String> {
    private String name;
    private String link;
    private String description;
    private String title;
    private String keywords;
    private String pictures;
    private String text;
    private String time;


    public ItemMenu(String name, String link, String description, String title, String keywords, String pictures, String text, String time) {
        this.name = name;
        this.link = link;
        this.description = description;
        this.title = title;
        this.keywords = keywords;
        this.pictures = pictures;
        this.text = text;
        this.time = time;
    }
    public ItemMenu() {

    }


    public String getName() {   return name;    }

    public void setName(String name) {  this.name = name;   }

    public String getLink() {   return link;    }

    public void setLink(String link) {  this.link = link;   }

    public String getDescription() {    return description; }

    public void setDescription(String description) {    this.description = description; }

    public String getTitle() {   return title;  }

    public void setTitle(String title) {    this.title = title; }

    public String getKeywords() {   return keywords;    }

    public void setKeywords(String keywords) {  this.keywords = keywords;   }

    public String getPictures() {   return pictures;    }

    public void setPictures(String pictures) {  this.pictures = pictures;   }

    public String getText() {   return text;    }

    public void setText(String text) {  this.text = text;   }

    public String getTime() {   return time;    }

    public void setTime(String time) {  this.time = time;   }
}
