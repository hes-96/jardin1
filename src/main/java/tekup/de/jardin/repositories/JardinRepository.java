package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.JardinEntity;

@Repository
public interface JardinRepository extends JpaRepository<JardinEntity, Integer> {
}
