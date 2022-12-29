package com.example.services

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class JobIntentEx : JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        Log.d( "Service", "Job Intent Service is Started ")
        Log.d( "Service", Thread.currentThread().name)

    }

    companion object{

        fun myBackgroundService(context: Context, intent: Intent ){

            enqueueWork(context, JobIntentEx::class.java, 1, intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d( "Service", "Job Intent Service is Stopped ")
    }


}