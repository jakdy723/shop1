package cn.it;

import java.lang.reflect.ParameterizedType;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.it.model.Category;
import cn.it.service.CategoryInterface;
import cn.it.service.imp.CategoryServiceImpl;

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
		System.out.println("获取当前对象的父类信息："+ this.getClass().getSuperclass());
		System.out.println("获取当前对象的父类信息（包括泛型信息）"+ this.getClass().getGenericSuperclass());
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		Class clazz = (Class)type.getActualTypeArguments()[0];
	}
	
	@Test
	public void hibernate(){
		
		CategoryInterface service = new CategoryServiceImpl();
		
		service.save(new Category( "nanshi" ,false));
	}
	
	@Test
	public void hibernateAndSpring(){
		
		categoryInterface.update(new Category(3, "女士22" , false));
	}
	

}
