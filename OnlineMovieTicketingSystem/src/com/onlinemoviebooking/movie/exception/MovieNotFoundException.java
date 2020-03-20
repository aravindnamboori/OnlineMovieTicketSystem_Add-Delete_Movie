package com.onlinemoviebooking.movie.exception;


@SuppressWarnings("serial")
public class MovieNotFoundException extends Exception 
{
   public MovieNotFoundException(String msg) 
   {
   System.out.println(msg);
   }
}
