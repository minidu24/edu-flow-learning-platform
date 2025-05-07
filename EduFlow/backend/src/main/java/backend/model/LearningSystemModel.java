package backend.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "learning_systems")
public class LearningSystemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "user_id", nullable = false)
    private Long userId;
    
    @Column(nullable = false)
    private String title;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @ElementCollection
    @CollectionTable(name = "learning_system_resources", joinColumns = @JoinColumn(name = "learning_system_id"))
    @Column(name = "resource_url")
    private List<String> resources = new ArrayList<>();
    
    @Column(name = "is_published")
    private boolean published;

    // Default constructor
    public LearningSystemModel() {
    }

    // Parameterized constructor
    public LearningSystemModel(Long userId, String title, String description) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.published = false;
    }

    // Constructor with all fields
    public LearningSystemModel(Long id, Long userId, String title, String description, List<String> resources, boolean published) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.resources = resources != null ? resources : new ArrayList<>();
        this.published = published;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources != null ? resources : new ArrayList<>();
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
