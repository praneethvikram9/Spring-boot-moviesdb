package com.stackroute.moviesdb.service;

import com.stackroute.moviesdb.domain.Movies;
import com.stackroute.moviesdb.exceptions.MovieNameExistsException;
import com.stackroute.moviesdb.exceptions.NoSuchMovieException;
import com.stackroute.moviesdb.exceptions.NullDetailsException;
import com.stackroute.moviesdb.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {


    MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository1){
        this.movieRepository=movieRepository1;
    }



    @Override
    public Movies saveMovie(Movies movies) throws MovieNameExistsException {
        if(movieRepository.existsById(movies.getMovieId())){
            throw new MovieNameExistsException("movie name already exist");
        }
        Movies savedMovie = movieRepository.save(movies);
        //check for null and user exist exception
        return savedMovie;
    }

    @Override
    public List<Movies> getallMovies() throws NullDetailsException {
        if(movieRepository==null){
            throw new NullDetailsException("no details to show");
        }
        return movieRepository.findAll();
    }

    @Override
    public List<Movies> search(String moviename) {
        return null;
    }


    @Override
    public List<Movies> delete(int id) throws NoSuchMovieException {
        if(!movieRepository.existsById(id)){
            throw new  NoSuchMovieException("no movie with that id");
        }
        movieRepository.deleteById(id);
        return movieRepository.findAll();
    }

    @Override
    public List<Movies> update(Movies movies,int id)throws NoSuchMovieException {

         if(movieRepository.existsById(id)){
             movieRepository.getOne(id).setCast(movies.getCast());
             movieRepository.getOne(id).setCrew(movies.getCrew());
             movieRepository.getOne(id).setSimilarMovies(movies.getSimilarMovies());
             movieRepository.getOne(id).setRatings(movies.getRatings());
             movieRepository.getOne(id).setTitle(movies.getTitle());
         }
         else
         {
             throw new NoSuchMovieException("no such id to update");
         }
         return movieRepository.findAll();
    }

    @Override
    public Optional<Movies> getMovieById(int id) throws NoSuchMovieException{

        if(movieRepository.existsById(id)){

            return movieRepository.findById(id);
        }
        else
        {
            throw new NoSuchMovieException("there is no movie by that id");
        }

    }

}
