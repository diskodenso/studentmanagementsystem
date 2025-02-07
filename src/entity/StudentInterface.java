package entity;

/**
 * an objects of each class that implements this interface is a student
 *
 */
public interface StudentInterface {

	/**
	 * returns the unique 6-digits matriculation number of a student
	 * @return matriculation number
	 */
	int getMatriculationNo();

	
	/**
	 * returns name of a student which is a non-empty and not-null string
	 * @return name of a student
	 */
	String getName();
	
	/**
	 * each student has a not necessarily unique name, name can be changed
	 * @param name name of a student, cannot be null or empty
	 * @throws NullPointerException if name is null
	 * @throws IllegalArgumentException if name is an empty string
	 */
	void setName(String name) throws NullPointerException, IllegalArgumentException;

	
	/**
	 * returns course of a student which is a non-empty and not-null string
	 * @return course of a student
	 */
	String getCourse();

	/**
	 * each student is enrolled in exactly one course, course can be changed
	 * @param course course of a student, cannot be null or empty
	 * @throws NullPointerException if course is null
	 * @throws IllegalArgumentException if course is an empty string
	 */
	void setCourse(String course) throws NullPointerException, IllegalArgumentException;

	
	/**
	 * 
	 * @return String-representation of a student-object
	 */
	String toString();

}