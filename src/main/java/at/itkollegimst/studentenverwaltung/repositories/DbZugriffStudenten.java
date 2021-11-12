package at.itkollegimst.studentenverwaltung.repositories;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;

import java.util.List;

public interface DbZugriffStudenten {
    Student studentSpeichern(Student student);
    List<Student> alleStudenten();
    List<Student> alleStudentenAusDemOrt(String plz);
    Student studentMitId(Long id) throws StudentNichtGefunden;
    void studentLoeschenMitId(Long id);
}
