package emlakburada.service;

import emlakburada.model.Category;
import emlakburada.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAll(){
        return categoryRepository.fakeCategories();
    }

    public void addCategory(Category category){
        categoryRepository.addCategory(category);
    }

    public Category  getCategoryById(String id){
        return categoryRepository.getCategoryById(id);
    }

    public void deleteCategoryById(String id){
        categoryRepository.deleteCategoryById(id);
    }

}
