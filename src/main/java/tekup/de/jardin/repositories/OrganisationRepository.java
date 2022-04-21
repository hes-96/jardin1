package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.OrganisationEntity;

@Repository
public interface OrganisationRepository extends JpaRepository<OrganisationEntity, Integer> {
}
