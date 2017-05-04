package pojo;

public class Employee {

	private int jobID;
	private String email;
	private String password;
	
	

	public Employee(int jobID, String email, String password) {
		super();
		this.jobID = jobID;
		this.email = email;
		this.password = password;
	}

	
	
	public int getJobID() {
		return jobID;
	}



	public void setJobID(int jobID) {
		this.jobID = jobID;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Employee [jobID=" + jobID + ", email=" + email + ", password=" + password + "]";
	}

	
	
	
}
