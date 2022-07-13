package com.example.java_4_4_3.model;



import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;


public class User implements Parcelable {
    private int age;
    private String name;

    public User(int age,String name){
        this.age=age;
        this.name=name;
    }

    protected User(Parcel in) {
        age = in.readInt();
        name = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public String toString(){
        return "User{Name="+name+", Age="+age+'}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(age);
        parcel.writeString(name);
    }
}