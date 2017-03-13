package cn.it.action;


import cn.it.model.Category;
import cn.it.service.CategoryInterface;


import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class CategoryAction extends ActionSupport {
	
	private CategoryInterface categoryService;
	
	private Category category;
	
	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		
		return category;
	}

	public void setCategoryInterface (CategoryInterface categoryService){
		this.categoryService = categoryService;
	}
	
	
	public CategoryInterface getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryInterface categoryService) {
		this.categoryService = categoryService;
	}

	public String update(){
		System.out.println("--update--");
		System.out.println(categoryService);
		categoryService.update(category);
		return "index";
	}
	public String save(){
		System.out.println("--save--");
		return "index";
	}
	

}
