package com.onlinemoviebooking.movie.application;

import java.util.Scanner;
import com.onlinemoviebooking.dto.Movie;
import com.onlinemoviebooking.movie.dao.MovieDao;
import com.onlinemoviebooking.movie.dao.MovieDaoImpl;
import com.onlinemoviebooking.movie.exception.MovieNotFoundException;
//import com.onlinemoviebooking.movie.dao.MovieDao;
//import com.onlinemoviebooking.movie.dao.MovieDaoImpl;
import com.onlinemoviebooking.movie.services.MovieService;
import com.onlinemoviebooking.movie.services.MovieServiceImpl;
import com.onlinemoviebooking.utility.DateConverter;



public class Application{

	public static void main(String[] args)  {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);                                    //Scanner statement
		
		MovieService service=new MovieServiceImpl();
		MovieDao dao = new MovieDaoImpl();
		
		int ch=0;
		do
		{
		System.out.println("**************Menu**************");                //CRUD Operations Menu
		System.out.println("1.Add movie details");
		System.out.println("2.Delete Movie");
		System.out.println("3.Exit");
		System.out.println("Choose your option");
		ch=sc.nextInt();                                                       //Enter Your Choice                                       
		switch(ch) 
		{
		case 1:{                                                                 //Adding the movie
			
		System.out.println("enter movieid");
		int movieid=sc.nextInt();
		while(!service.validateID(movieid))                                     //Validates MovieId
		{
			System.out.println("Invalid movieid");
			System.out.println("enter valid movieid");
			movieid=sc.nextInt();
			
		}
		System.out.println("enter moviename");
		String moviename=sc.next();
		System.out.println("enter movie genre");
		String moviegenre=sc.next();
		System.out.println("enter movie director");
		String moviedirector=sc.next();
		System.out.println("enter movie length");
		int movielength=sc.nextInt();
		System.out.println("enter movie language");
		String language=sc.next();
		System.out.println("enter movie release date");
		String releasedate = sc.next();
		
		Movie m=new Movie(movieid,moviename,moviegenre,moviedirector,movielength,language,DateConverter.convertDate(releasedate));
	    int rows=service.addMovie(m);
	    
		if(rows>0)
		{
			
			System.out.println("Movie is added!!!");
		}
		else
			System.out.println("U_U  movie not added.");
		break;
	
		}
		case 2:
		{                                                                    //Deleting the movie
		System.out.println("enter movie id to be deleted");
		int movieid=sc.nextInt();                                            //Enter MovieId to delete                       
		Movie m=new Movie();
		m.setMovieId(movieid);             
	    boolean check= dao.checkMovieId(movieid);
		if (check==true)                                                     //Checking movie is present or not in database
			System.out.println("Movie found");
		else                                 
			try { 
				throw new MovieNotFoundException("MovieID does not exist");
			} catch (MovieNotFoundException e){
				e.printStackTrace();
			}	
		MovieService service1=new MovieServiceImpl();
		service1.deleteMovie(movieid);
		break;
			
		}
		case 3:
			   System.out.println("Terminated Successfully");
		       System.exit(0);
		}
    }     while(ch<=2);
 }
}

