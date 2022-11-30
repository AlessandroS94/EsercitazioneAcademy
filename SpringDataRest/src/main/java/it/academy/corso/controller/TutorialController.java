package it.academy.corso.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import it.academy.corso.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import it.academy.corso.exception.ResourceNotFoundException;
import it.academy.corso.model.Tutorial;


@RestController
@RequestMapping("/api")
public class TutorialController {

  @Autowired
  TutorialRepository tutorialRepository;

  @GetMapping("/tutorials")
  public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
    List<Tutorial> tutorials = new ArrayList<Tutorial>();

    if (title == null)
      tutorialRepository.findAll().forEach(tutorials::add);
    else
      tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);

    if (tutorials.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    return new ResponseEntity<>(tutorials, HttpStatus.OK);
  }

  @GetMapping("/tutorials/{id}")
  public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
    Tutorial tutorial = tutorialRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

    return new ResponseEntity<>(tutorial, HttpStatus.OK);
  }

  @PostMapping("/tutorials")
  public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
    Tutorial _tutorial = tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), true));
    return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
  }

  @PutMapping("/tutorials/{id}")
  public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
    Tutorial _tutorial = tutorialRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

    _tutorial.setTitle(tutorial.getTitle());
    _tutorial.setDescription(tutorial.getDescription());
    _tutorial.setPublished(tutorial.isPublished());
    
    return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
  }

  @DeleteMapping("/tutorials/{id}")
  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
    tutorialRepository.deleteById(id);
    
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping("/tutorials")
  public ResponseEntity<HttpStatus> deleteAllTutorials() {
    tutorialRepository.deleteAll();
    
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @GetMapping("/tutorials/published")
  public ResponseEntity<List<Tutorial>> findByPublished() {
    List<Tutorial> tutorials = tutorialRepository.findByPublished(true);

    if (tutorials.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    return new ResponseEntity<>(tutorials, HttpStatus.OK);
  }
  @GetMapping("/ciao")
	  public ResponseEntity<String> ciao(){
	  String ciao="Ciao";
		return  new ResponseEntity<>(ciao, HttpStatus.OK);
	  
  }
  @GetMapping("/nome")
  public ResponseEntity<HashMap<String,String>> nome(){
	  
	  HashMap<String,String> nomeMap= new HashMap<String, String>();
	  nomeMap.put("Nome", "Michele");
	 
	  return new ResponseEntity<>(nomeMap,HttpStatus.OK);	  
  }
  
  @GetMapping("/ciao/{nome}")
  public ResponseEntity<HashMap<String,String>> nomeCatturato(@PathVariable("nome") String nome){
	  HashMap<String,String> nomeMap= new HashMap<String, String>();
	  nomeMap.put("Nome", nome);
	  
	  return new ResponseEntity<>(nomeMap,HttpStatus.OK);	 
	  
  }
  
}
