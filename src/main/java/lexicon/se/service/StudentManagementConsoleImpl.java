package lexicon.se.service;

import lexicon.se.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement {
    private List<Student> students = new ArrayList<>();

    @Override
    public Student create() {
        return null;
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
        return this.students;
    }

    @Override
    public Student end(Student student) {



        return null;
    }
}
