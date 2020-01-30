package mybatis.spring;

// employees 테이블 동일 컬럼명 = 변수명 선언
public class EmpVO {
	int employee_id, department_id;
	String first_name, last_name;
	String email, hire_date, job_id;
	// date타입 -> String/Date타입


	@Override
	public String toString() {
		return "EmpVO [employee_id=" + employee_id + ", department_id=" + department_id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", hire_date=" + hire_date + ", job_id=" + job_id
				+ "]" + "\n";
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

}
