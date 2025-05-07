package backend.repository;

import backend.model.LearningSystemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearningSystemRepository extends JpaRepository<LearningSystemModel, Long> {
    List<LearningSystemModel> findByUserId(Long userId);
    List<LearningSystemModel> findByPublishedTrue();
}
