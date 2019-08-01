import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.examsys.dao.BanjiMapper;
import com.neuedu.examsys.dao.ClassroomMapper;
import com.neuedu.examsys.dao.StudentMapper;
import com.neuedu.examsys.domain.Banji;
import com.neuedu.examsys.domain.Student;

public class Test {

	public static void main(String[] args) throws IOException{
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		StudentMapper sm = session.getMapper(StudentMapper.class);
		Student s = new Student();
		List<Student> ss = new ArrayList<>();
		s.setStudentId("SE1173710227");
		s.setStudentEmail("123@123.com");
		s.setStudentMajor("radio");
		s.setStudentAcademy("computer");
		s.setStudentName("何");
		s.setStudentPhone("123456789");
		s.setStudentSex("male");
		s.setStudentClass("1737102");
		s.setStudentAddress("雨荷");
		s.setStudentNation("汉");
		s.setStudentIdentity("12010419981027");
		sm.insertStudent(s);
		sm.deleteStudent("SE1173710226");
		ss = sm.queryStudent();
		System.out.println("22");
		for(Student x:ss){
			System.out.println(x.toString());
			System.out.println("1");
		}
		session.commit();
		session.close();
	}

}
