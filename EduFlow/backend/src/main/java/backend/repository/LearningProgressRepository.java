package backend.repository;

import backend.model.LearningProgressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LearningProgressRepository extends JpaRepository<LearningProgressModel, Long> {
    List<LearningProgressModel> findByUserId(Long userId);
    List<LearningProgressModel> findByLearningSystemId(Long learningSystemId);
    List<LearningProgressModel> findByUserIdAndCompleted(Long userId, boolean completed);
}
