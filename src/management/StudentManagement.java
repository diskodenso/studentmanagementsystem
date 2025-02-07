package management;

import binTree.BinTreeGen;
import entity.Student;

/**
 * Student management system implemented with a sorted binary tree.
 */
public class StudentManagement implements StudentManagementInterface {
    private BinTreeGen<Student> studentTree;

    /**
     * Parameterless constructor: creates an empty student management.
     */
    public StudentManagement() {
        studentTree = new BinTreeGen<>();
    }

    /**
     * Returns the total number of students.
     * @return number of students
     */
    @Override
    public int countStudents() {
        return studentTree.countNodes();
    }

    /**
     * Inserts a new student into the management system if the student does not already exist.
     * @param student student to insert
     * @return true if insertion succeeded, false otherwise
     */
    @Override
    public boolean insertStudent(Student student) {
        if (student == null) {
            return false;
        }
        // Prüfe, ob ein Student mit derselben Matrikelnummer bereits existiert.
        if (searchStudent(student.getMatriculationNo()) != null) {
            return false;
        }
        return studentTree.insertNode(student);
    }

    /**
     * Searches for a student with the given matriculation number.
     * @param matrNo 6-digit matriculation number (between 100000 and 999999)
     * @return student with the given matriculation number, or null if not found
     * @throws IllegalArgumentException if matrNo is invalid
     */
    @Override
    public Student searchStudent(int matrNo) throws IllegalArgumentException {
        if (matrNo < 100000 || matrNo > 999999) {
            throw new IllegalArgumentException("Matriculation number must be a 6-digit number.");
        }
        // Erzeuge ein Dummy-Student-Objekt, da compareTo() nur die Matrikelnummer vergleicht
        Student dummy = new Student(matrNo, "dummy", "dummy");
        binTree.BinNodeGen<Student> node = studentTree.find(dummy);
        return (node != null) ? node.getData() : null;
    }

    /**
     * Checks if the given student is managed by the system.
     * @param s student to check
     * @return true if s is a student in the system, false otherwise
     * @throws NullPointerException if s is null
     */
    @Override
    public boolean isStudent(Student s) throws NullPointerException {
        if (s == null) {
            throw new NullPointerException("Student cannot be null.");
        }
        Student found = searchStudent(s.getMatriculationNo());
        return (found != null && found.getMatriculationNo() == s.getMatriculationNo());
    }

    /**
     * Returns an in-order String representation of the student tree.
     * @return string representation of the student tree
     */
    @Override
    public String toString() {
        return studentTree.toString();
    }
}
