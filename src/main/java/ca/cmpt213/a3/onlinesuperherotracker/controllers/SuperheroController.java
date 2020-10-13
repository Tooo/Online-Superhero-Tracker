package ca.cmpt213.a3.onlinesuperherotracker.controllers;

import ca.cmpt213.a3.onlinesuperherotracker.model.Superhero;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * SuperheroController is a controller for Spring Boot Rest API
 * It handle the get/post request and the invalid values exception
 */
@RestController
public class SuperheroController {
    private List<Superhero> superheroes = new ArrayList<>();
    private AtomicLong nextId = new AtomicLong();

    @GetMapping("/hello")
    public String getHelloMessage() {
        return "Hello welcome to Superhero Tracker Online!";
    }
    

    @GetMapping("/listAll")
    public List<Superhero> getAllSuperheroes() {
        return superheroes;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/add")
    public Superhero createNewSuperhero(@RequestBody Superhero superhero) {
        superhero.setId(nextId.incrementAndGet());
        if (superhero.getHeightInCm() < 0
            || superhero.getCivilianSaveCount() < 0) {
            throw new IllegalArgumentException();
        }

        superheroes.add(superhero);
        return superhero;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/remove/{id}")
    public List<Superhero> removeSuperhero(@PathVariable("id") long superheroId) {
        for (Superhero superhero : superheroes) {
            if (superhero.getId() == superheroId) {
                superheroes.remove(superhero);
                return superheroes;
            }
        }
        throw new SuperheroNotFoundException();
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/update/{id}")
    public Superhero updateSuperhero(@PathVariable("id") long superheroId, @RequestBody Superhero newSuperhero) {

        if (newSuperhero.getHeightInCm() < 0
                || newSuperhero.getCivilianSaveCount() < 0) {
            throw new IllegalArgumentException();
        }

        for (Superhero superhero : superheroes) {
            if (superhero.getId() == superheroId) {
                superhero.setName(newSuperhero.getName());
                superhero.setHeightInCm(newSuperhero.getHeightInCm());
                superhero.setCivilianSaveCount(newSuperhero.getCivilianSaveCount());
                superhero.setSuperPower(newSuperhero.getSuperPower());
                return superhero;
            }
        }
        throw new SuperheroNotFoundException();
    }

    @GetMapping("/listTop3")
    public List<Superhero> listTopThree() {

        if (superheroes.size() < 3) {
            throw new NotEnoughSuperheroesException();
        }

        List<Superhero> topThreeSuperheroes = new ArrayList<>(superheroes);

        Collections.sort(topThreeSuperheroes,
                (hero1, hero2) -> hero2.getCivilianSaveCount() - hero1.getCivilianSaveCount());

        return topThreeSuperheroes.subList(0, 3);
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid values.")
    @ExceptionHandler(IllegalArgumentException.class)
    public void invalidValues() {

    }

}
