package com.onlinemoviebooking.movie.dao;

import com.onlinemoviebooking.dto.Movie;
	public interface MovieDao
	{ 
		public void openConnection();                                      //Method OpenConnection
		public void close();                                               //Close Method
		public int addMovie(Movie movie);                                  //Add Method
		public int deleteMovie(int movieId);                               //DeleteMovie
		public boolean checkMovieId(int movieId);                          //CheckMovie
		
	}


