package com.onlinemoviebooking.dto;

import java.sql.Date;

public class Movie {
       	private int movieId;
       	private String movieName;
       	private String movieGenre;
       	private String director;
       	private int movieLength;
       	private String language;
       	private Date movieReleaseDate;
       	public Movie()
       	{                                                                                                                   //Constructor
       		
       	}
		public Movie(int movieId, String movieName, String movieGenre, String director, int movieLength,
				String language, Date movieReleaseDate) {
			super();
			this.movieId = movieId;
			this.movieName = movieName;
			this.movieGenre = movieGenre;
			this.director = director;
			this.movieLength = movieLength;
			this.language = language;
			this.movieReleaseDate = movieReleaseDate;
		}
	
		public int getMovieId() {
			return movieId;
		}
		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}
		public String getMovieName() {
			return movieName;
		}
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}
		public String getMovieGenre() {
			return movieGenre;
		}
		public void setMovieGenre(String movieGenre) {
			this.movieGenre = movieGenre;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public int getMovieLength() {
			return movieLength;
		}
		public void setMovieLength(int movieLength) {
			this.movieLength = movieLength;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public Date getMovieReleaseDate() {
			return movieReleaseDate;
		}
		public void setMovieReleaseDate(Date movieReleaseDate) {
			this.movieReleaseDate = movieReleaseDate;
		}
       	
       	

}
