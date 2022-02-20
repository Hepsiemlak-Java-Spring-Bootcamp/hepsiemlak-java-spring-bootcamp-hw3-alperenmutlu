package emlakburada.service;

import emlakburada.model.user.IndividualUser;
import emlakburada.repository.IndividualUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividualUserService {

    private IndividualUserRepository individualUserRepository;

    @Autowired
    public IndividualUserService(IndividualUserRepository individualUserRepository){
        this.individualUserRepository = individualUserRepository;
    }

    public List<IndividualUser> getAll(){
        return individualUserRepository.getAll();
    }

    public void addIndividualUser(IndividualUser individualUser){
        individualUserRepository.addIndividualUser(individualUser);
    }

    public IndividualUser getUserByEmail(String email){
       return individualUserRepository.getIndividualUserByEMail(email);
    }

    public IndividualUser getIndividualUserById(String id){
        return individualUserRepository.getIndividualUserById(id);
    }

    public void deleteIndividualUserByMail(String email){
        individualUserRepository.deleteIndividualUserByMail(email);
    }

}
