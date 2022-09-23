
package com.example.valoapi.agent.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {

    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("displayIconSmall")
    @Expose
    private String displayIconSmall;
    @SerializedName("fullPortrait")
    @Expose
    private String fullPortrait;
    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("abilities")
    @Expose
    private List<Ability> abilities = null;
    @SerializedName("voiceLine")
    @Expose
    private VoiceLine voiceLine;

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

    public String getDisplayIconSmall() {
        return displayIconSmall;
    }

    public void setDisplayIconSmall(String displayIconSmall) {
        this.displayIconSmall = displayIconSmall;
    }

    public String getFullPortrait() {
        return fullPortrait;
    }

    public void setFullPortrait(String fullPortrait) {
        this.fullPortrait = fullPortrait;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public VoiceLine getVoiceLine() {
        return voiceLine;
    }

    public void setVoiceLine(VoiceLine voiceLine) {
        this.voiceLine = voiceLine;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayIconSmall");
        sb.append('=');
        sb.append(((this.displayIconSmall == null)?"<null>":this.displayIconSmall));
        sb.append(',');
        sb.append("fullPortrait");
        sb.append('=');
        sb.append(((this.fullPortrait == null)?"<null>":this.fullPortrait));
        sb.append(',');
        sb.append("background");
        sb.append('=');
        sb.append(((this.background == null)?"<null>":this.background));
        sb.append(',');
        sb.append("abilities");
        sb.append('=');
        sb.append(((this.abilities == null)?"<null>":this.abilities));
        sb.append(',');
        sb.append("voiceLine");
        sb.append('=');
        sb.append(((this.voiceLine == null)?"<null>":this.voiceLine));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
