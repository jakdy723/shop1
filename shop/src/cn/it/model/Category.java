package cn.it.model;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */

public class Category implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String typed;
	private Boolean hot;

	
	// Constructors

	@Override
	public String toString() {
		return "Category [id=" + id + ", typed=" + typed + ", hot=" + hot + "]";
	}

	/** default constructor */
	public Category() {
	}

	/** full constructor */
	public Category(String typed, Boolean hot) {
		this.typed = typed;
		this.hot = hot;
	}
	public Category(Integer id,String typed, Boolean hot) {
		
		this.id = id;
		this.typed = typed;
		this.hot = hot;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTyped() {
		return this.typed;
	}

	public void setTyped(String typed) {
		this.typed = typed;
	}

	public Boolean getHot() {
		return this.hot;
	}

	public void setHot(Boolean hot) {
		this.hot = hot;
	}

}