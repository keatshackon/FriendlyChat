package com.keatssalazar.friendlychat;

public class FriendlyMessage {
    private String text;
    private String name;
    private String photoUrl;
    private String date;

    public  FriendlyMessage(){

    }
    public FriendlyMessage(String text,String name,String photoUrl,String date){
        this.text=text;
        this.name=name;
        this.photoUrl=photoUrl;
        this.date=date;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDate() {
        return date;
    }
}
