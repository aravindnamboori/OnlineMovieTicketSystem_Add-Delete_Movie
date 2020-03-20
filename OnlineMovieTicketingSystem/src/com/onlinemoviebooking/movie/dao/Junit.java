package com.onlinemoviebooking.movie.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.onlinemoviebooking.dto.Movie;

public class Junit {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception 
	{
	
		
	}

	@Test
	public void test() 
	{
		MovieDaoImpl dao = new MovieDaoImpl();
		int rows = dao.deleteMovie(30002);
		assertEquals(rows, 1);
		
	}
	@Test
	public void testNegativeMovie() 
	{
		MovieDaoImpl dao = new MovieDaoImpl();
		int rows = dao.deleteMovie(30011);
		assertNotEquals(rows, 1);
		
	}
	
	@Test
	public void testAddMovie()
	{
		MovieDao moviedao= new MovieDaoImpl();
        Movie movie = new Movie(3023,"","",123,"","");
		int rows = moviedao.addMovie(movie);
		assertEquals(rows,1);
	}

	
	

}