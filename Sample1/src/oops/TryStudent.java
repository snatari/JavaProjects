package oops;

public class TryStudent {
	//public class Student {
		private String email;
		private String name;
		private String pass;
		public TryStudent() {
			this.email = "";
			 this.name = "";
			 this.pass = "";
			
		}
	 public TryStudent(String emailE,String nameN , String passP ) {
		 this.email = emailE;
		 this.name = nameN;
		 this.pass = passP;

}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}