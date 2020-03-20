package com.onlinemoviebooking.movie.services;

import com.onlinemoviebooking.dto.Movie;

public interface MovieService 
{
	public int addMovie(Movie m);
	public int deleteMovie(int movieId);
	public boolean checkMovieById(int movieId);
	public boolean validateID(int movieId);
	public int updateMovie(Movie m);
}
