package management;

import entity.Student;

/**
 * 
 * each class which implements this interface is a student management
 *
 */

public interface StudentManagementInterface {


	/**
	 * returns the total number of students at the university
	 * @return number of students
	 */
	int countStudents();


	/**
	 * insert a new student to the management system if the student does not already exists
	 * and returns true to indicate that the insertion was successful,
	 * otherwise, if the student does already exists or if student is null, 
	 * does not insert anything and returns false 
	 * @param student student to insert
	 * @return true if the insertion was successful, false otherwise
	 */
	boolean insertStudent(Student student);

	
	
	/**
	 * returns the student with the given matriculation number
	 * or null if no student with the given matriculation number was found
	 * @param matrNo given 6-digit matriculation number (i.e. between 100000 and 999999)
	 * @return student with the given matriculation number
	 * @throws IllegalArgumentException if matrNo is not a valid matriculation number
	 */
	Student searchStudent(int matrNo) throws IllegalArgumentException;

	
	
	/**
	 * checks if s is really a student at the university
	 * @param s student to be checked
	 * @return true if s is a student, false otherwise
	 * @throws NullPointerException if s is null
	 */
	boolean isStudent(Student s) throws NullPointerException;

}