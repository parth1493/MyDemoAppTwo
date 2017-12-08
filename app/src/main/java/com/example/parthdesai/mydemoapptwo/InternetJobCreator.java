package com.example.parthdesai.mydemoapptwo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

/**
 * Created by parthdesai on 2017-12-08.
 */

class InternetJobCreator implements JobCreator {
    @Nullable
    @Override
    public Job create(@NonNull String tag) {
        return new NetworkConnectionCheck();
    }
}
