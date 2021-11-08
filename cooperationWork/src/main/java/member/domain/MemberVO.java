package member.domain;

import java.sql.Timestamp;

public class MemberVO {
	
	private int member_num;
	private String id;
	private String password;
	private String name;
	private String email;
	private Timestamp createAccount;
	private String pw2;
	
	
	public int getMember_num() {
		return member_num;
	}


	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getPw2() {
		return pw2;
	}


	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Timestamp getCreateAccount() {
		return createAccount;
	}


	public void setCreateAccount(Timestamp createAccount) {
		this.createAccount = createAccount;
	}


	@Override
	public String toString() {
		return "MemberVO [member_num=" + member_num + ", id=" + id + ", password=" + password + ", name=" + name
				+ ", email=" + email + ", createAccount=" + createAccount + "]";
	}

}
	