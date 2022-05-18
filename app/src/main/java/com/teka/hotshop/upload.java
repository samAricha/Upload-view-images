package com.teka.hotshop;

public class upload {
    private String mName;
    private String mImgUrl;

    public upload(){}

    public upload(String imgUrl, String name){
        if(name.trim().equals("")){
            mName = "No name";
        }
        mName = name;
        mImgUrl = imgUrl;

    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImgUrl() {
        return mImgUrl;
    }

    public void setmImgUrl(String mImgUrl) {
        this.mImgUrl = mImgUrl;
    }
}
