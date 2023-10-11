package lexicon.se.data_access;

import lexicon.se.model.Student;

import java.util.List;

public interface StudentDao {


       Student save(Student Student);
      Student find(int id);
      List<Student> findAll();
      void delete (int id);




}
