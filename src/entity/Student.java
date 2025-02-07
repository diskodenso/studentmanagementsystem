package entity;

/**
 * Implementation of a student.
 * Each student has a unique 6-digit matriculation number,
 * a name and a course.
 */
public class Student implements StudentInterface, Comparable<Student> {
    private final int matriculationNo;
    private String name;
    private String course;

    /**
     * Parameterless constructor.
     * Hier werden Standardwerte zugewiesen.
     */
    public Student() {
        // Ein Standard-Matrikelnummerwert, der als Platzhalter dient.
        this.matriculationNo = 100000;
        this.name = "Unknown";
        this.course = "Unknown";
    }

    /**
     * Constructs a student with the given matriculation number, name and course.
     * @param m 6-digit matriculation number (between 100000 and 999999)
     * @param n name, non-null and not empty
     * @param c course, non-null and not empty
     * @throws IllegalArgumentException if matriculationNo, name, or course is invalid
     */
    public Student(int m, String n, String c) {
        if (m < 100000 || m > 999999) {
            throw new IllegalArgumentException("Matriculation number must be a 6-digit number between 100000 and 999999.");
        }
        if (n == null || n.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (c == null || c.trim().isEmpty()) {
            throw new IllegalArgumentException("Course cannot be null or empty.");
        }
        this.matriculationNo = m;
        this.name = n;
        this.course = c;
    }

    /**
     * Returns the unique matriculation number.
     * @return matriculation number
     */
    @Override
    public int getMatriculationNo() {
        return matriculationNo;
    }

    /**
     * Returns the student's name.
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     * @param name new name; must be non-null and not empty
     * @throws NullPointerException if name is null
     * @throws IllegalArgumentException if name is empty
     */
    @Override
    public void setName(String name) throws NullPointerException, IllegalArgumentException {
        if (name == null) {
            throw new NullPointerException("Name cannot be null.");
        }
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    /**
     * Returns the student's course.
     * @return course
     */
    @Override
    public String getCourse() {
        return course;
    }

    /**
     * Sets the student's course.
     * @param course new course; must be non-null and not empty
     * @throws NullPointerException if course is null
     * @throws IllegalArgumentException if course is empty
     */
    @Override
    public void setCourse(String course) throws NullPointerException, IllegalArgumentException {
        if (course == null) {
            throw new NullPointerException("Course cannot be null.");
        }
        if (course.trim().isEmpty()) {
            throw new IllegalArgumentException("Course cannot be empty.");
        }
        this.course = course;
    }

    /**
     * Returns a string representation of the student.
     * @return string representation
     */
    @Override
    public String toString() {
        return "Student[m=" + matriculationNo + ", name=" + name + ", course=" + course + "]";
    }

    /**
     * Compares this student to another by their matriculation number.
     * @param other the other student
     * @return negative if this matriculation number is less, 0 if equal, positive if greater
     */
    @Override
    public int compareTo(Student other) {
        if (other == null) {
            throw new NullPointerException("Compared student cannot be null.");
        }
        return Integer.compare(this.matriculationNo, other.matriculationNo);
    }
}
