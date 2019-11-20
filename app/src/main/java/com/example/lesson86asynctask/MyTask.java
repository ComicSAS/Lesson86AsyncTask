package com.example.lesson86asynctask;

import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MyTask extends AsyncTask<Void, Void, Void> {

    private TextView mView;

    public MyTask(View mView) {
        this.mView = (TextView) mView;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mView.setText("Begin");
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        mView.setText("End");
    }
}
