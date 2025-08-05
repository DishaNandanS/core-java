class Movie21 {
private String movieName;
private int duration;
private String genre;

static String[] movieTypes = {"Action", "Comedy", "Drama", "Horror"};

public static String[] getMovieTypes() {
return movieTypes;
}

public void setMovieName(String movieName) {
this.movieName = movieName;
}

public String getMovieName() {
return movieName;
}

public void setDuration(int duration) {
this.duration = duration;
}

public int getDuration() {
return duration;
}

public void setGenre(String genre) {
this.genre = genre;
}

public String getGenre() {
return genre;
}
}
