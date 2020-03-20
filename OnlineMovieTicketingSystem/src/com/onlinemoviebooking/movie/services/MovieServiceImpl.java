package com.onlinemoviebooking.movie.services;

import com.onlinemoviebooking.dto.Movie;
import com.onlinemoviebooking.movie.dao.MovieDao;
import com.onlinemoviebooking.movie.dao.MovieDaoImpl;

public class MovieServiceImpl implements MovieService {
	MovieDao dao=new MovieDaoImpl();
	@Override
	public int addMovie(Movie movie) {
		int rows=dao.addMovie(movie);
		return rows;
	}

	@Override
	public int updateMovie(Movie m) {
	
		return 0;
	}

	@Override
	public int deleteMovie(int movieId) {
		int rows=dao.deleteMovie(movieId);
		return rows;
		
	}

	
	

	@Override
	public boolean checkMovieById(int movieId) {
		
		return dao.checkMovieId(movieId);
	}

	@Override
	public boolean validateID(int movieId) {
		int count=0;
		int a =0;
		int temp=movieId;
		while(movieId!=0)
		{
			temp=movieId%10;
			movieId=movieId/10;
			a=temp;
			count++;
			
		}
		if(count>=4 && a==3)
		return true;
		else
			return false;
	}

			
		
}
