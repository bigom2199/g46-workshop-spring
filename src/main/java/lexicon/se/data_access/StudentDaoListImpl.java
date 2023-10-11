package lexicon.se.data_access;

import lexicon.se.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students = new ArrayList<>();
    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        for (Student student : students) {
            if(student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {

        return students;
    }

    @Override
    public void delete(int id) {
        Student student = find(id);
        students.remove(student);
    }
}
