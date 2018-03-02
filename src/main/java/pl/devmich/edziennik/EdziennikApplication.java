package pl.devmich.edziennik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.devmich.edziennik.entities.Student;
import pl.devmich.edziennik.repositories.StudentRepository;

@SpringBootApplication
public class EdziennikApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(EdziennikApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		studentRepository.save(new Student("Michał", "Zakrzewski", 4.5));
		studentRepository.save(new Student("Kacper", "Nowak",  5.0));
		studentRepository.save(new Student("Dominik", "Kalinowski",  4.5));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));
		studentRepository.save(new Student("Rafał", "Nowak",  3.0));



	}
}
