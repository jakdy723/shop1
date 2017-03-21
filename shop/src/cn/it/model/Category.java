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
	private Integer cid;
	private String ctype;
	private Boolean chot;
	private Account account;

	
	// Constructors

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Category [id=" + cid + ", typed=" + ctype + ", hot=" + chot + "]";
	}

	/** default constructor */
	public Category() {
	}

	/** full constructor */
	public Category(String typed, Boolean hot) {
		this.ctype = typed;
		this.chot = hot;
	}
	public Category(Integer id,String typed, Boolean hot) {
		
		this.cid = id;
		this.ctype = typed;
		this.chot = hot;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public Boolean getChot() {
		return chot;
	}

	public void setChot(Boolean chot) {
		this.chot = chot;
	}

	// Property accessors

	
}