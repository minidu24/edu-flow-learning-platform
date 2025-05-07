package backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "learning_progress")
public class LearningProgressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "user_id", nullable = false)
    private Long userId;
    
    @Column(name = "learning_system_id", nullable = false)
    private Long learningSystemId;
    
    @Column(name = "progress_percentage")
    private int progressPercentage;
    
    @Column(name = "last_accessed")
    private LocalDateTime lastAccessed;
    
    @Column(name = "is_completed")
    private boolean completed;

    // Default constructor
    public LearningProgressModel() {
        this.lastAccessed = LocalDateTime.now();
        this.completed = false;
        this.progressPercentage = 0;
    }

    // Parameterized constructor
    public LearningProgressModel(Long userId, Long learningSystemId) {
        this.userId = userId;
        this.learningSystemId = learningSystemId;
        this.lastAccessed = LocalDateTime.now();
        this.completed = false;
        this.progressPercentage = 0;
    }

    // Constructor with all fields
    public LearningProgressModel(Long id, Long userId, Long learningSystemId, int progressPercentage, 
                               LocalDateTime lastAccessed, boolean completed) {
        this.id = id;
        this.userId = userId;
        this.learningSystemId = learningSystemId;
        this.progressPercentage = progressPercentage;
        this.lastAccessed = lastAccessed != null ? lastAccessed : LocalDateTime.now();
        this.completed = completed;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLearningSystemId() {
        return learningSystemId;
    }

    public void setLearningSystemId(Long learningSystemId) {
        this.learningSystemId = learningSystemId;
    }

    public int getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(int progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public LocalDateTime getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(LocalDateTime lastAccessed) {
        this.lastAccessed = lastAccessed != null ? lastAccessed : LocalDateTime.now();
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
