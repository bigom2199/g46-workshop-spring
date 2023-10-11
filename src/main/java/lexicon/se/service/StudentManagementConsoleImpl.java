package lexicon.se.service;

import lexicon.se.data_access.StudentDao;
import lexicon.se.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement {
    private List<Student> students = new ArrayList<>();

    @Override
    public Student create() {
        return new Student();
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }

        }
        return null;

    }

    @Override
    public Student remove(int id) {
        Student student = this.find(id);
        if (student == null) {
            return null;
        }
        this.students.remove(student);
    }



    @Override
    public List<Student> findAll() {
        return students.findAll();

    }
    @Override
    public Student edit(Student student) {
        Student.delete(student.getId());
        Student.save(student);
        return student;
    }
}
