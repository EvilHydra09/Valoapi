
package com.example.valoapi.agent.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VoiceLine {

    @SerializedName("mediaList")
    @Expose
    private List<Media> mediaList = null;

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VoiceLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mediaList");
        sb.append('=');
        sb.append(((this.mediaList == null)?"<null>":this.mediaList));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
