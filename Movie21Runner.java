class Movie21Runner {
public static void main(String[] args) {
Movie21[] movies = new Movie21[2];

Movie21 movie1 = new Movie21();
movie1.setMovieName("Inception");
movie1.setDuration(148);
movie1.setGenre("Sci-Fi");
movies[0] = movie1;

Movie21 movie2 = new Movie21();
movie2.setMovieName("3 Idiots");
movie2.setDuration(170);
movie2.setGenre("Drama");
movies[1] = movie2;

for (int i = 0; i < movies.length; i++) {
System.out.println("Movie======== " + (i + 1));
System.out.println("Name: " + movies[i].getMovieName());
System.out.println("Duration: " + movies[i].getDuration());
System.out.println("Genre: " + movies[i].getGenre());
}

System.out.println("Available Movie Types:");
for (String type : Movie21.getMovieTypes()) {
System.out.println(type);
}
}
}
