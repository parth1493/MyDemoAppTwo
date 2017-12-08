package com.example.parthdesai.mydemoapptwo;

import android.app.Application;

import com.evernote.android.job.JobManager;
import com.evernote.android.job.JobRequest;

import java.util.concurrent.TimeUnit;

/**
 * Created by parthdesai on 2017-12-08.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JobManager.create(this).addJobCreator(new InternetJobCreator());

        new JobRequest.Builder(NetworkConnectionCheck.JOB_TAG)
                .setPeriodic(TimeUnit.SECONDS.toMillis(15), TimeUnit.SECONDS.toMillis(5))
                .setRequiredNetworkType(JobRequest.NetworkType.CONNECTED)
                .setRequirementsEnforced(true)
                .setUpdateCurrent(true)
                .build()
                .schedule();
    }
}
