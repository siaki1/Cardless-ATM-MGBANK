package hbcu.stay.ready.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hbcu.stay.ready.domain.Person;
import hbcu.stay.ready.repository.DirectoryRepository;

@RestController
public class DirectoryController {
    private DirectoryRepository repo;

    @Autowired
    public DirectoryController(DirectoryRepository repo){
        this.repo = repo;
    }

    @RequestMapping("/directory")
    public ResponseEntity<Iterable<Person>> findAll(){
        return ResponseEntity.ok(this.repo.findAll());
    }


}
