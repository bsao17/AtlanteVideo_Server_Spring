package com.atlante.site.video;

public class Video {

    private String name;
    private String link;
    private String type;

    public Video(String name, String link, String type){
        this.name = name;
        this.link = link;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
