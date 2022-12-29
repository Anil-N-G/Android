package com.example.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.security.Provider

class ClassicServiceEx : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        Log.d("Service", "Classic Service Created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d("Service", "Classic Service Started")
        Log.d("Service Thread", Thread.currentThread().name)

        //stopSelf()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service", "Classic Service Stopped")
    }

}