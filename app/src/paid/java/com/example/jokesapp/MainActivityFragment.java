package com.example.jokesapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.androidjokes.JokeActivity;


public class MainActivityFragment extends Fragment implements TellJoke {
    private MaterialDialog dialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_activity, container, false);

        Button jokeBtn = rootView.findViewById(R.id.joke_b);
        jokeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getJokes();
            }
        });
        return rootView;
    }

    private void getJokes() {
        showLoading();
        new EndpointsAsyncTask(this).execute();
    }

    @Override
    public void tellJoke(String joke) {
        Intent intent = new Intent(getContext(), JokeActivity.class);
        intent.putExtra("joke", joke);
        dialog.dismiss();
        getContext().startActivity(intent);

    }

    private void showLoading() {
        if (dialog != null && dialog.isShowing())
            dialog.dismiss();
        dialog = new MaterialDialog.Builder(getContext())
                .title(R.string.loading)
                .content(R.string.wait)
                .progress(true, 0)
                .cancelable(false)
                .show();
    }

}
