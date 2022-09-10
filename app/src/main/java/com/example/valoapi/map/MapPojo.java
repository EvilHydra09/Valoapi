package com.example.valoapi.map;

import java.util.List;

 class Data {

    private String displayIcon;
    private String displayName;
    private String splash;

    public String getDisplayIcon() {

        return displayIcon;

    }

    public void setDisplayIcon(String displayIcon) {

        this.displayIcon = displayIcon;

    }

    public String getDisplayName() {

        return displayName;

    }

    public void setDisplayName(String displayName) {

        this.displayName = displayName;

    }

    public String getSplash() {

        return splash;

    }

    public void setSplash(String splash) {

        this.splash = splash;

    }

}


public class MapPojo {

    private List<Data> data;

    public List<Data> getData() {

        return data;

    }

    public void setData(List<Data> data) {

        this.data = data;

    }

}

