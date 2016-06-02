package com.galvanize.paramcollector;

    import com.galvanize.company.Company;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.data.mongodb.repository.MongoRepository;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetParamsController {

    private final MongoRepository<Params, String> repository;

    @Autowired
    GetParamsController(MongoRepository<Params, String> repository) {

        repository.deleteAll();
        repository.save(new Params("Rob"));
        repository.save(new Params("Chris"));

        this.repository = repository;
    }


    @RequestMapping("/params")
    public String index (@RequestParam(value="name", required=false, defaultValue="world")
                             final String name,
                         final Model model) {

        model.addAttribute("parameters",repository.findAll());

        model.addAttribute("name", name);

        return "params/index";
    }
}
