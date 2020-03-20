package com.onlinemoviebooking.movie.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.onlinemoviebooking.dto.Movie;
import com.onlinemoviebooking.utils.MovieDBQueries;

public class MovieDaoImpl implements MovieDao 
{
      private Connection connection= null;
      private PreparedStatement pst;
    @Override
	   public void openConnection() {
    
    		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			    connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","arvind","tiger");
	             System.out.println("Connection Established");
	             }
    		catch(SQLException | ClassNotFoundException e)
    		{
    			e.printStackTrace();
    		}
    }
	
	@Override
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public int addMovie(Movie movie) {
		openConnection();
		int rows=0;
		try{
		pst=connection.prepareStatement(MovieDBQueries.addMovieQuery);
		pst.setInt(1, movie.getMovieId());
		pst.setString(2, movie.getMovieName());
		pst.setString(3, movie.getMovieGenre());
		pst.setString(4,movie.getDirector());
		pst.setInt(5, movie.getMovieLength());
		pst.setString(6, movie.getLanguage());
		Date sqldate=new Date(movie.getMovieReleaseDate().getTime());
		pst.setDate(7, sqldate);
		rows=pst.executeUpdate();
		
		
		
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return rows;
	}

	@Override
	public int deleteMovie(int movieId) {
		openConnection();
		int rows=0;
		try{
		pst=connection.prepareStatement(MovieDBQueries.deleteMovieQuery);
		pst.setInt(1,movieId);
		rows=pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return rows;
	}

	@Override
	public boolean checkMovieId(int movieId) {
		openConnection();
		boolean check=false;
		
		  try {
			
				pst=connection.prepareStatement(MovieDBQueries.checkMovieByIdQuery);
				pst.setInt(1,movieId);
				ResultSet rs=pst.executeQuery();
				if(rs.next())
				check=true;	
				else
				check=false;
			} 		  catch (SQLException e) {
				e.printStackTrace();
			}
		  close();
		  return check;
		
	}

}
	
	

	
		

	

	
	

	
	
	


