package com.example.hp.uploadpdf;

import android.util.Log;

import com.google.firebase.auth.FirebaseUser;


/**
 * Created by Akanksha on 7/2/2018.
 */

public class Upload {

    public String name;
    public String url;
    //String user;

    public Upload() {
    }

    public Upload(String name, String url) {

        this.name = name;
        this.url = url;

    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

}
