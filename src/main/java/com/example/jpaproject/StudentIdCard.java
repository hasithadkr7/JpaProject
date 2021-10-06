package com.example.jpaproject;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentIdCard {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "student_id",
            columnDefinition = "BIGINT"
    )
    private Long studentId;

    private String cardNumber;

    public StudentIdCard(Long studentId, String cardNumber) {
        this.studentId = studentId;
        this.cardNumber = cardNumber;
    }

    public StudentIdCard() {

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

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "StudentIdCard{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
