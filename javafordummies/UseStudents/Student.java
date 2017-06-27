package usestudents;

//Base student class
public class Student {
    String name;
    int id;
    double gpa;
    Major major; //See enum
    
    //Constructicons
    public Student() {
	name = "Joe Bloggs";
	id = 1;
	gpa = 0.0;
	major = Major.COMPUTER_SCIENCE;
    }
    
    public Student(double gpa) {
	name = "Joe Bloggs";
	id = 1;
	this.gpa = gpa;
	major = Major.COMPUTER_SCIENCE;
    }
    
    public Student(Major major) {
	name = "Joe Bloggs";
	id = 1;
	gpa = 0.0;
	this.major = major;
    }
    
    public Student(double gpa, Major major) {
	name = "Joe Bloggs";
	id = 1;
	this.gpa = gpa;
	this.major = major;
    }
    
    //Getters and setters
    public void setName(String name) {
	this.name = name;
    }
    
    public String getName() {
	return name;
    }
    
    public void setId(int id) {
	this.id = id;
    }
    
    public int getId() {
	return id;
    }
    
    public void setGpa(double gpa) {
	this.gpa = gpa;
    }
    
    public double getGpa() {
	return gpa;
    }
    
    public void setMajor(Major major) {
	this.major = major;
    }
    
    public Major getMajor() {
	return major;
    }
}
