package org.userDomain;

public class User {
	
	private Long id;
	
	private String name;
	
	private String addr;
	
	public String toString(){
		return " id: "+id
				+ " name: "+name
				+ " addr: "+addr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}
