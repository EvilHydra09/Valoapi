package com.example.valoapi;

import java.util.List;

public class AgentPojo {

    private List<Data> data;

    public List<Data> getData() {

        return data;

    }

    public void setData(List<Data> data) {

        this.data = data;

    }

}

class Data {

    private List<Abilities> abilities;
    private String displayIcon;
    private String displayName;
    private String description;
    private String fullPortrait;

    public String getFullPortrait() {
        return fullPortrait;
    }

    public void setFullPortrait(String fullPortrait) {
        this.fullPortrait = fullPortrait;
    }

    public List<Abilities> getAbilities() {

        return abilities;

    }

    public void setAbilities(List<Abilities> abilities) {

        this.abilities = abilities;

    }



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

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

}

class Abilities {

    private String displayIcon;
    private String displayName;
    private String description;

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

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

}
