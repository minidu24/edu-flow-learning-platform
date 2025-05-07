package backend.repository;

import backend.model.PostManagementModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostManagementRepository extends JpaRepository<PostManagementModel, Long> {
    // Additional query methods if needed
}
