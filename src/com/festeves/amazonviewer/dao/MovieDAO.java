package com.festeves.amazonviewer.dao;


import java.util.ArrayList;

import com.anncode.amazonviewer.model.Movie;

public interface MovieDAO {

	default Movie setMovieViewed(Movie movie){
		return movie;
	}
	
	
	default ArrayList<Movie> read(){
		
		return new ArrayList<Movie>();
	}
	
	
	
	private boolean getMovieViewed(){
		return false;
	}
	
}
