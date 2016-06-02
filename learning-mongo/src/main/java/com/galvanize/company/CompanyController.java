package com.galvanize.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by localadmin on 02/06/2016.
 */


@Controller
public class CompanyController {

    private final MongoRepository <Company, String> repository;

    @Autowired
    CompanyController(MongoRepository<Company, String> repository) {

        repository.deleteAll();
        repository.save(new Company("Galvanize",220));
        repository.save(new Company("Allstate",60000));

        this.repository = repository;
    }

    @RequestMapping("/company")
    public String index(final Model model){
        model.addAttribute("companies",repository.findAll());
        return "company/index";
    }
}
