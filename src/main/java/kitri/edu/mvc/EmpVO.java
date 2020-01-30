package kitri.edu.mvc;

import org.springframework.stereotype.Component;


public class EmpVO {
	int id;
	String name;
	double salary;
	String hiredate;
	
	public EmpVO(){};
	
	@Override
	public String toString() {
		return "["+id +","+ name +","+ salary +","+ hiredate +"]" ;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
}
