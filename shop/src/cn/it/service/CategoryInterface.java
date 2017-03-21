package cn.it.service;

import java.util.List;

import cn.it.model.Category;

public interface CategoryInterface extends BaseService<Category>{
	
	
	public List<Category> queryJoinAccount(String type, int page, int size);
	public Long getCount(String type);
/*public void save(Category category) ;
	
	public void update(Category category) ;
	
	public void delete(int id);
	
	public Category get(int id);
	
	public List <Category> query();*/
		
	
}
