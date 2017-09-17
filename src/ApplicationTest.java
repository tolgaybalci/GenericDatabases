
public class ApplicationTest {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		Course course1 = new Course();
		Course course2 = new Course();

		student1.setId(12345);
		student1.setName("Mehmet");
		student1.setSurname("Aksu");
		student1.setDepartment("Yazılım");


		student2.setId(98765);
		student2.setName("Ahmet");
		student2.setSurname("Yalçın");
		student2.setDepartment("İşletme");
		
		student3.setId(987654321);
		student3.setName("Ahmet Yalçın");
		student3.setSurname("Pektaş");
		student3.setDepartment("İstatistik");
		
		
		course1.setName("Matematik");
		course1.setInstructor("Murat Yıldız");
		course1.setDescription("Kümeler");
		course1.setClasses("Math101");
		
		course1.setName("Fen Bilimleri");
		course1.setInstructor("Burak Küçük");
		course1.setDescription("Genetik");
		course1.setClasses("Fen106");
		
		Database<Student> studentDB = new Database<>();		
		Database<Course> courseDB = new Database<>();

		studentDB.save(student1);
		studentDB.save(student2);
		studentDB.save(student3);
		
		courseDB.save(course1);
		courseDB.save(course2);
		
		studentDB.printElements();
		courseDB.printElements();
	}
		
}
