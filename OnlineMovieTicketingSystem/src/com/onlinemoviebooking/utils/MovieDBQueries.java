package com.onlinemoviebooking.utils;
public class MovieDBQueries {
	public static String addMovieQuery="insert into Movie values(?,?,?,?,?,?,?)";
    public static String deleteMovieQuery ="delete from Movie where movieId=?";
    public static String checkMovieByIdQuery="select * from movie where movieid=?";
    //public static String getMovieById ="select * from Movie where movieId=?";

}
