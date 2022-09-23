
package com.example.valoapi.agent.model;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Media implements Parcelable {

    @SerializedName("wave")
    @Expose
    private String wave;

    protected Media(Parcel in) {
        wave = in.readString();
    }

    public static final Creator<Media> CREATOR = new Creator<Media>() {
        @Override
        public Media createFromParcel(Parcel in) {
            return new Media(in);
        }

        @Override
        public Media[] newArray(int size) {
            return new Media[size];
        }
    };

    public String getWave() {
        return wave;
    }

    public void setWave(String wave) {
        this.wave = wave;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Media.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wave");
        sb.append('=');
        sb.append(((this.wave == null)?"<null>":this.wave));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(wave);
    }
}
