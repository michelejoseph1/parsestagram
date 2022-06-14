package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MfxZnMERXG14Bc1VSEd1ujvgSM92KAuE5rKK8qu5")
                .clientKey("D5E81azIulxnqgCZERfs0G9WodUsNGeUe2rNF2Kb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}