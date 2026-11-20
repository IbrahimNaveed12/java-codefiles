# Library Management System

A Java console program that tracks a student's book returns and library fines across multiple semesters. It applies different daily fine rates to Regular and Premium members, then prints semester-by-semester totals and an overall summary.

## Features

- Collects the student's name and membership type.
- Records book return details for each semester.
- Calculates late-return fines and an additional penalty for books returned more than 30 days late.
- Shows per-semester book counts, late days, and fines.
- Summarizes total books, on-time and late returns, extra penalties, total fines, and the highest fine for one book.
- Validates membership, semester count, book count, late-return answers, and late days.

## Fine Rules

| Membership | Fine per late day |
| --- | ---: |
| Regular | PKR 20 |
| Premium | PKR 15 |

A book returned more than 30 days late also receives an additional PKR 200 penalty. On-time returns have no fine.

## Input Limits

- Semesters: 1–8
- Books per semester: 1–10
- Late days for a book: 1–60
- Membership: `Regular` or `Premium`

## Run

Requires a Java Development Kit (JDK). From this directory, compile and run:

```bash
javac LibraryManagementSystem.java
java LibraryManagementSystem
```

Follow the prompts to enter student details and each book's return status. The program displays a summary at the end.
