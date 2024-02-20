package se.lexicon.librarymanagementapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;

    @Column(nullable = false)
    private LocalDate loanDate;

    @Column(nullable = false)
    private LocalDate dueDate;

    @Column
    private boolean returned;

    @ManyToOne
    @JoinColumn(name = "appUserId")
    private AppUser borrower;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;
}
