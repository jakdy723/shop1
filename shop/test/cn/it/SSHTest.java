package cn.it;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.it.model.Category;
import cn.it.service.CategoryInterface;
import cn.it.service.imp.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext*.xml")

public class SSHTest {
	
	@Resource
	private Date date;
	
	@Resource
	private CategoryInterface categoryInterface;
	
	@Test
	public void date(){
		System.out.println(date);
		
	}
	
	@Test
	public void hibernate(){
		
		CategoryInterface service = new CategoryService();
		
		service.save(new Category( "nanshi" ,false));
	}
	
	@Test
	public void hibernateAndSpring(){
		
		categoryInterface.update(new Category(3, "女士22" , false));
	}
	

}
