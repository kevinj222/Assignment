package testassng;

public class Try1
{
	String empname;
	String empid;
	String phno;
	String addr;
	String email;
	String location;
	int salary;
	public Try1(String empname, String empid, String phno, String addr, String email, String location, int salary) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.phno = phno;
		this.addr = addr;
		this.email = email;
		this.location = location;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n empname=" + empname + ", empid=" + empid + ", phno=" + phno + ", addr=" + addr + ", email="
				+ email + ", location=" + location + ", salary=" + salary ;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
