package cn.it.model;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dptName;
	private int peopleNum;

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	
	// Property accessors


	

	public Department(int peopleNum) {
		
		this.peopleNum = peopleNum;
	}

	public String getDptName() {
		return this.dptName;
	}

	public void setDptName(String dptName) {
		this.dptName = dptName;
	}

	public int getPeopleNum() {
		return this.peopleNum;
	}

	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}

}