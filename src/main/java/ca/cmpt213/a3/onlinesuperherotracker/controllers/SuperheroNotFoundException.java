package ca.cmpt213.a3.onlinesuperherotracker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * SuperheroNotFoundException is a exception
 * It is thrown when the requested id for a superhero is not found
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Request ID not found.")
public class SuperheroNotFoundException extends RuntimeException{

}
