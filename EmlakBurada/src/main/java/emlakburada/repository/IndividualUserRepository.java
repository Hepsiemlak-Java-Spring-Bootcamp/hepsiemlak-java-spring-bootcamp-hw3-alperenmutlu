package emlakburada.repository;

import emlakburada.model.Advert;
import emlakburada.model.user.IndividualUser;
import emlakburada.model.user.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IndividualUserRepository {

     List<IndividualUser> individualUsers = new ArrayList<>();

     List<Advert> getFavoriteAdvertsByUser = new ArrayList<>();

     public List<IndividualUser> getAll(){
         return individualUsers;
     }

    public void addIndividualUser(IndividualUser individualUser){
       individualUsers.add(individualUser);
    }

    public IndividualUser getIndividualUserByEMail(String email){
        for(IndividualUser individualUser : individualUsers){
            if(individualUser.getEmail().equals(email)){
                return individualUser;
            }
        }
        return null;

        //return (IndividualUser) individualUsers.stream().filter(individualUser -> individualUser.getEmail().equals(email));
    }

    public IndividualUser getIndividualUserById(String id){
         for(IndividualUser individualUser : individualUsers){
             if(individualUser.getId().equals(id)){
                 return individualUser;
             }
         }
         return null;
    }

    public void deleteIndividualUserByMail(String email){
        IndividualUser individualUser = getIndividualUserByEMail(email);
        individualUsers.remove(individualUser);
    }

}
