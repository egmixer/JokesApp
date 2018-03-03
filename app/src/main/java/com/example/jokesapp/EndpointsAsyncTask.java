package com.example.jokesapp;

import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

import jokesapp.example.com.myApi.MyApi;


class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {
    private static final String TAG = EndpointsAsyncTask.class.getSimpleName();
    private static MyApi myApiService = null;
    private TellJoke tellJoke;

    public EndpointsAsyncTask(TellJoke tellJoke) {
        this.tellJoke = tellJoke;
    }

    @Override
    protected String doInBackground(Void... voids) {
        if (myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://jokesapp-196716.appspot.com//_ah/api/");
            myApiService = builder.build();
        }
        try {
            Log.d(TAG, "doInBackground: " + myApiService.tellJokes().execute().getData());
            return myApiService.tellJokes().execute().getData();

        } catch (IOException e) {
            return e.getMessage();
        }

    }

    @Override
    protected void onPostExecute(String result) {
        tellJoke.tellJoke(result);
    }

}
