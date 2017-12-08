package com.example.parthdesai.mydemoapptwo;

import android.support.annotation.NonNull;
import android.util.Log;

import com.evernote.android.job.Job;

import java.security.acl.LastOwnerException;

/**
 * Created by parthdesai on 2017-12-08.
 */

class NetworkConnectionCheck extends Job {

    static final String JOB_TAG = "NETWORK_CHECK";

    @NonNull
    @Override
    protected Result onRunJob(@NonNull Params params) {

        Log.d("NETWORK CHECK",params.getTag());
        return Result.SUCCESS;
    }
}
