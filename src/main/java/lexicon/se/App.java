package lexicon.se;

import lexicon.se.data_access.StudentDao;
import lexicon.se.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

        studentDao.save(new Student());
    }
}
