/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usestudents;

public class StudentString extends Student {
    public StudentString() {
	super();
    }
    
    public StudentString(double gpa) {
	super(gpa);
    }
    
    public StudentString(Major major) {
	super(major);
    }
    
    public StudentString(double gpa, Major major) {
	super(gpa, major);
    }
    
    public String getString() {
	String result = new String();
	result = result.format("Name: %s\nID: %d\nGPA: %.2f\nMajor: %s\n",
		getName(), getId(), getGpa(), getMajor());
	return result;
    }
}
