-- Create learning_systems table
CREATE TABLE IF NOT EXISTS learning_systems (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    is_published BOOLEAN DEFAULT FALSE
);

-- Create learning_system_resources table (for the resources collection)
CREATE TABLE IF NOT EXISTS learning_system_resources (
    learning_system_id BIGINT NOT NULL,
    resource_url VARCHAR(255) NOT NULL,
    PRIMARY KEY (learning_system_id, resource_url),
    FOREIGN KEY (learning_system_id) REFERENCES learning_systems(id) ON DELETE CASCADE
);

-- Create learning_progress table
CREATE TABLE IF NOT EXISTS learning_progress (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    learning_system_id BIGINT NOT NULL,
    progress_percentage INT DEFAULT 0,
    last_accessed DATETIME,
    is_completed BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (learning_system_id) REFERENCES learning_systems(id) ON DELETE CASCADE
);

-- Create notifications table
CREATE TABLE IF NOT EXISTS notifications (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    message TEXT NOT NULL,
    created_at DATETIME,
    is_read BOOLEAN DEFAULT FALSE
); 