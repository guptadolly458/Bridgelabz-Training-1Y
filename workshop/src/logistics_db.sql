CREATE DATABASE logistics_db;

USE logistics_db;

CREATE TABLE driver (
    driver_id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE checkpoint (
    checkpoint_id VARCHAR(20) PRIMARY KEY,
    type VARCHAR(20),
    location VARCHAR(100),
    distance DOUBLE,
    expected_duration INT,
    actual_duration INT,
    driver_id VARCHAR(20),
    FOREIGN KEY (driver_id) REFERENCES driver(driver_id)
);
select * from checkpoint;

