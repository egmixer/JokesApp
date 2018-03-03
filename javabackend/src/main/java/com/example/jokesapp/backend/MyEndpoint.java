package com.example.jokesapp.backend;

import com.example.jokesapp.jokesjavalib.Joke;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "com.example.jokesapp",
                ownerName = "com.example.jokesapp",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "tellJokes")
    public MyBean getJokes() {
        MyBean response = new MyBean();
        Joke joke = new Joke();
        response.setData(joke.tellAJoke());
        return response;
    }

}
