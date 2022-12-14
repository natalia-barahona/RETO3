package com.example.demo.controller;

import com.example.demo.model.Audience;
import com.example.demo.model.Category;
import com.example.demo.service.AudienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api/Audience")
public class AudienceController {
    @Autowired
    private AudienceService audienceService;

    @GetMapping("/all")
    public List<Audience>getAudience(){
        return audienceService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Audience audience){
        audienceService.save(audience);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
     public void update(@RequestBody Audience audience) {
        audienceService.update(audience);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteCategory(@PathVariable("id") int id) {
        return audienceService.delete(id);
    }

}

