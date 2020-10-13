package ca.cmpt213.a3.onlinesuperherotracker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * NotEnoughSuperheroesException is a exception
 * It is thrown when there's not enough superheroes
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Not enough superheroes")
public class NotEnoughSuperheroesException extends RuntimeException {

}
