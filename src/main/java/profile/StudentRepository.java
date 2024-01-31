package profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// Ez hiányzott
import your.package.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
}

