package dev.ali.ApiMovies.exceptions.movies;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Country not found")
public class MovieNotFoundException extends MovieException {

    public MovieNotFoundException(String message) {
        super(message);
        //TODO Auto-generated constructor stub
    }

    public MovieNotFoundException  (String message, Throwable cause) {
        super(message, cause);
    }
    
}
