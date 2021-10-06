package com.example.jpaproject;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "enrolment")
public class Enrolment {
    @Id
    @SequenceGenerator(
            name = "enrolment_sequence",
            sequenceName = "enrolment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "enrolment_sequence"
    )
    @Column(
            name = "id",
            nullable = false,
            updatable = false
    )
    private Long id;

    @Column(
            name = "student_id",
            nullable = false,
            columnDefinition = "BIGINT"
    )
    private Long studentId;

    @Column(
            name = "course_id",
            nullable = false,
            columnDefinition = "INT"
    )
    private int CourseId;

    @Column(
            name = "create_at",
            nullable = false,
            columnDefinition = "TIMESTAMP"
    )
    private LocalDateTime createdAt;

    public Enrolment(Long studentId, int courseId, LocalDateTime createdAt) {
        this.studentId = studentId;
        CourseId = courseId;
        this.createdAt = createdAt;
    }

    public Enrolment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Enrolment{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", CourseId=" + CourseId +
                ", createdAt=" + createdAt +
                '}';
    }
}
