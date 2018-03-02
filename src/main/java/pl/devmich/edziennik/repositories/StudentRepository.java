package pl.devmich.edziennik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.devmich.edziennik.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
