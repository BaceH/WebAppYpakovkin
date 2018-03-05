package com.ypakovkin.model;

public class MenuList extends Entity<String> {
    private String name;
    private String link;
    private String description;
    private boolean activ;

    public MenuList(String name, String link, String description, boolean activ) {
        this.name = name;
        this.link = link;
        this.description = description;
        this.activ = activ;
    }
    public MenuList() {
    }

    public String getName() {   return name;   }

    public void setName(String name) {  this.name = name;   }

    public String getLink() {   return link;    }

    public void setLink(String link) {  this.link = link;   }

    public String getDescription() {    return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Menu Item{id:" + getId() +
                "name:" + name +
                "link:" + link +
                "description:" + description + "}";
    }

    public boolean isActiv() {  return activ;   }

    public void setActiv(boolean activ) {   this.activ = activ; }
}
