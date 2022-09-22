
package com.example.valoapi.agent.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Ability {

    @SerializedName("slot")
    @Expose
    private String slot;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("displayIcon")
    @Expose
    private Object displayIcon;

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
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

    public Object getDisplayIcon() {
        return displayIcon;
    }

    public void setDisplayIcon(Object displayIcon) {
        this.displayIcon = displayIcon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("slot");
        sb.append('=');
        sb.append(((this.slot == null)?"<null>":this.slot));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayIcon");
        sb.append('=');
        sb.append(((this.displayIcon == null)?"<null>":this.displayIcon));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
