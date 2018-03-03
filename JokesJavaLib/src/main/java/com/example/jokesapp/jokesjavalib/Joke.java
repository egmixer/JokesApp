package com.example.jokesapp.jokesjavalib;

public class Joke {

    private String[] jokes = new String[]
            {
                    "What did the fish say when he swam into the wall?\n" +
                            "Dam.",
                    "What's the best way to carve wood?\n" +
                            "Whittle by whittle.",
                    "Where do skunks go to pray?\n" +
                            "The pew!",
                    "What does a vegan zombie eat?\n" +
                            "Graaaaaaaaaaaaaaaaaaaains!!",
                    "Did you know diarrhea is hereditary?\n" +
                            "It runs in your jeans!",
                    "A man walks into a bar.\n" +
                            "He's an alcoholic and it's destroying his family.",
                    "What do you call a donkey with a millon eyes and a millon legs?\n" +
                            "A monster.",
                    "What do rappers use in their laundry?\n" +
                            "Bleeee-otch!",
                    "What do you call an Eskimo who's a Peeping Tom?\n" +
                            "Itookalook",
                    "I slept with a woman who cooked a ton of pasta last night. She gave me carbs.",
                    "What did the fried rice say to the shrimp?\n" +
                            "Don't wok away from me!",
                    "What did the big chimney say to the little chimney?\n" +
                            "You're too young to be smoking!",
                    "What do you call a can opener that doesn't work?\n" +
                            "A can't opener!",
                    "What's large, grey, and doesn't matter?\n" +
                            "An irrelephant.",
                    "What did the midget say to the pint of beer?\n" +
                            "I could drink you under the table!",
                    "What kind of pictures do turtles take?\n" +
                            "Shellfies!",
                    "Where do cows go for a first date?\n" +
                            "To the moooovies!",
                    "What's red and bad for your teeth?\n" +
                            "A brick",
                    "What do you call a sketchy neighbourhood in Italy?\n" +
                            "A Spaghetto!",
                    "What do you call a microbiologist in an orchestra?\n" +
                            "A cell-ist!",
                    "Did you hear about that new movie called \"Constipation\"?\n" +
                            "No? That's because it hasn't come out yet...",
                    "How did Hitler tie his shoes?\n" +
                            "In little nazis",
                    "How did the hipster burn his mouth?\n" +
                            "He sipped his coffee before it was cool!"
            };

    public String tellAJoke() {
        return jokes[(int) (Math.random() * 23)];
    }

}
