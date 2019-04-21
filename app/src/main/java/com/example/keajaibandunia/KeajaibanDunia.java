package com.example.keajaibandunia;

import android.os.Parcel;
import android.os.Parcelable;

public class KeajaibanDunia implements Parcelable {
    private String name, remarks, photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
    }

    public KeajaibanDunia() {
    }
    protected KeajaibanDunia(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
    }
    public static final Parcelable.Creator<KeajaibanDunia> CREATOR = new Parcelable.Creator<KeajaibanDunia>() {
        @Override
        public KeajaibanDunia createFromParcel(Parcel source) {
            return new KeajaibanDunia(source);
        }
        @Override
        public KeajaibanDunia[] newArray(int size) {
            return new KeajaibanDunia[size];
        }
    };
}
