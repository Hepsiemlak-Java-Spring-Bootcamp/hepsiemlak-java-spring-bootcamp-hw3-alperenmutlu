package emlakburada.repository;

import emlakburada.enums.RealEstateType;
import emlakburada.model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {

    List<Category> categories = new ArrayList<>();

    public List<Category> fakeCategories(){
        List<Category> fakeCategory = new ArrayList<>();
        Category house = new Category(RealEstateType.HOUSE,"House");
        Category plot = new Category(RealEstateType.PLOT,"Plot");

        fakeCategory.add(house);
        fakeCategory.add(plot);
        return fakeCategory;
    }

    public List<Category> getAll(){
       return categories;
    }

    public void addCategory(Category category){
        categories.add(category);
    }

    public Category getCategoryById(String id){
        for(Category category : categories){
            if(category.getId().equals(id)){
                return category;
            }
        }
        return null;
    }

    public void deleteCategoryById(String id){
        for(Category category : categories){
            if(category.getId().equals(id)){
                categories.remove(category);
            }
        }
    }



}
