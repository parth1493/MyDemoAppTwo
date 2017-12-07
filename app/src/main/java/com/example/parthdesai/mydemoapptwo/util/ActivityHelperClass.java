package com.example.parthdesai.mydemoapptwo.util;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by parthdesai on 2017-12-06.
 */

public class ActivityHelperClass {

    public static void log(Context context, TextView tv, String message, boolean append) {
        if (tv != null && message != null && message.length() > 0) {
            if (append) {
                tv.append(message + "\n");
            } else {
                tv.setText(message);
            }
            Log.i(context.getClass().getSimpleName(), message);
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
