package emlakburada.controller;

import emlakburada.model.user.IndividualUser;
import emlakburada.service.IndividualUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/individualUsers")
public class IndividualUserController {

    private IndividualUserService individualUserService;

    public IndividualUserController(IndividualUserService individualUserService){
        this.individualUserService = individualUserService;
    }

    @GetMapping("/getAll")
    public List<IndividualUser> getAll(){
        return individualUserService.getAll();
    }

    @PostMapping("/add")
    public void addIndividualUser(@RequestBody IndividualUser individualUser){
        individualUserService.addIndividualUser(individualUser);
    }

    @GetMapping("/getByMail")
    public IndividualUser getUserByEmail(String email){
       //return new ResponseEntity<>(individualUserService.getUserByEmail(email), HttpStatus.OK);
        return individualUserService.getUserByEmail(email);
    }

    @PostMapping("/deleteByMail")
    public void deleteIndividualUserByMail(String email){
        individualUserService.deleteIndividualUserByMail(email);
    }

    @GetMapping("/getById")
    public IndividualUser getIndividualUserById(String id){
        return individualUserService.getIndividualUserById(id);
    }




}
