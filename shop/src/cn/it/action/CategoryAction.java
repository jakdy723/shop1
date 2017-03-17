package cn.it.action;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.it.model.Category;
import cn.it.service.CategoryInterface;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
public class CategoryAction extends BaseAction <Category> {
	
	
	
//	private Category category;
//	
//	public void setCategory(Category category) {
//		this.category = category;
//	}
//
//	public Category getCategory() {
//		
//		return category;
//	}

		
//	public void setCategoryService(CategoryInterface categoryService) {
//		this.categoryService = categoryService;
//	}

	public String update(){
		System.out.println(ActionContext.getContext().getValueStack().getRoot());
		System.out.println("--update--");
		System.out.println(model);
//		categoryService.update(model);
		return "index";
	}
	public String save(){
		System.out.println("--save--");
		return "index";
	}
	
	public String query(){
//		方案一：
//		ActionContext.getContext().put("categorylist", categoryService.query());
//		ActionContext.getContext().getSession().put("categorylist", categoryService.query());
//		ActionContext.getContext().getApplication().put("categorylist", categoryService.query());
//		方案二：实现相应的接口，让相应的map注入，但是如果直接写在子类代码量较大，建立一个BaseAction
		request.put("categorylist", categoryService.query());
		session.put("categorylist", categoryService.query());
		application.put("categorylist", categoryService.query());
		
		return "index";
	}
}
