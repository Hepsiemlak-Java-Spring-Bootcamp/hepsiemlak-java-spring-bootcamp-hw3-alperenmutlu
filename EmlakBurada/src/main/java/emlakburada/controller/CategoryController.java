package emlakburada.controller;

import emlakburada.model.Category;
import emlakburada.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/getAll")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping("/add")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @GetMapping("/getById")
    public Category  getCategoryById(String id){
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/deleteById")
    public void deleteCategoryById(String id){
        categoryService.deleteCategoryById(id);
    }


}
