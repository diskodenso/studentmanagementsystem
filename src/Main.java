import entity.Student;
import management.StudentManagement;

public class Main {
    public static void main(String[] args) {
        // Erzeuge das StudentManagement-Objekt
        StudentManagement sm = new StudentManagement();

        // Erstelle einige Student-Objekte
        Student s1 = new Student(123456, "Alice", "Informatik");
        Student s2 = new Student(234567, "Bob", "Mathematik");
        Student s3 = new Student(345678, "Charlie", "Physik");

        // Einfügen der Studenten
        System.out.println("Füge Studenten ein:");
        System.out.println("Einfügen s1: " + sm.insertStudent(s1)); // sollte true liefern
        System.out.println("Einfügen s2: " + sm.insertStudent(s2)); // sollte true liefern
        System.out.println("Einfügen s3: " + sm.insertStudent(s3)); // sollte true liefern

        // Versuch, einen bereits vorhandenen Studenten erneut einzufügen
        System.out.println("Erneutes Einfügen von s1: " + sm.insertStudent(s1)); // sollte false liefern

        // Ausgabe der Anzahl der Studenten
        System.out.println("Anzahl der Studenten: " + sm.countStudents());

        // Suche nach einem Studenten anhand der Matrikelnummer
        int searchMatrikel = 234567;
        System.out.println("Suche nach Student mit Matrikelnummer " + searchMatrikel + ":");
        Student foundStudent = sm.searchStudent(searchMatrikel);
        System.out.println("Gefunden: " + foundStudent);

        // Überprüfe, ob ein bestimmter Student im System ist
        System.out.println("Prüfe, ob s3 im System ist: " + sm.isStudent(s3));

        // Ausgabe des gesamten Baums als String (in-order Traversierung)
        System.out.println("\nIn-Order Darstellung des Baums:");
        System.out.println(sm);
    }
}
