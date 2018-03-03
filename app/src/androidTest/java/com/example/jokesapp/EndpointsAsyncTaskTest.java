package com.example.jokesapp;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertTrue;

public class EndpointsAsyncTaskTest implements TellJoke {
    private String joke = null;

    @Test
    public void doInBackground() throws Exception {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(this);
        try {
            endpointsAsyncTask.execute();
            joke = endpointsAsyncTask.get(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            fail("Interrupted Exception " + e);
        } catch (ExecutionException e) {
            fail("ExecutionException: " + e);
        } catch (TimeoutException e) {
            fail("Timed out Exception: " + e);
        }
        assertTrue("Error: we found this Joke = " + joke, joke != null);

    }

    @Override
    public void tellJoke(String joke) {
        this.joke = joke;
    }
}