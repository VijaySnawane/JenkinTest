package com.example.fullstory

import android.app.Application
import android.util.Log
import com.fullstory.FS
import com.fullstory.FSOnReadyListener
import com.fullstory.FSSessionData


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        FS.setReadyListener(FSSessionReadyListener())
        FS.consent(true);
    }

    private class FSSessionReadyListener : FSOnReadyListener {
        override fun onReady(sessionData: FSSessionData) {
            val sessionUrl = sessionData.currentSessionURL
            Log.d("FullStory", "Session URL is: $sessionUrl")
        }
    }
}