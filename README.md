# 🧠 Enterprise Java Spring Boot Projects

This repository contains a collection of hands-on Spring Boot projects developed for academic learning and practical understanding of Java enterprise development using the Spring ecosystem.

Each folder represents a different module, concept, or assignment, showcasing the usage of:
- Spring Boot (MVC, REST, Dependency Injection, etc.)
- Thymeleaf templating
- JDBC and H2 database
- Form handling and sessions
- Lombok for boilerplate reduction
- Security configurations
- Real-world assignments and mini-projects

---

## 📁 Folder Structure

| Folder Name                          | Description |
|-------------------------------------|-------------|
| `ex12_intro/`                       | Basic Spring Boot app with simple controller |
| `ex21_requestMapping/`             | Demonstrates the use of `@RequestMapping` and path mapping |
| `ex22_injectionAndRepositories/`   | Dependency injection and repository pattern example |
| `ex31_lombok/`                     | Lombok usage to eliminate boilerplate code |
| `ex32_thymeleaf/`                  | Using Thymeleaf templates for front-end rendering |
| `ex51_formBinding/`                | Form handling using Spring's model binding |
| `ex71_Sessions/`                   | Working with HTTP sessions in Spring |
| `lec12_springBootIntro/`           | Lecture demo: Spring Boot introduction |
| `lec21-requestMapping/`           | Lecture demo: Request mapping |
| `lec22-dependencyInjection/`       | Lecture demo: Dependency Injection |
| `lec52-H2AndJdbcTemplate/`         | Working with H2 DB and JdbcTemplate |
| `lec61-JDBCTemplate/`              | JDBC Template CRUD operations |
| `lec71_sessions.zip_expanded/`     | Session management deep-dive (unzipped lecture project) |
| `AddWebApp/`                       | Web application for adding two numbers (controller + UI) |
| `Assignment2_Palak_Chaudhary/`     | Assignment on multi-controller, form handling, and routing |
| `BookReviews/`                     | A mini project for managing book reviews (CRUD + templates) |
| `MidTerm_Palak_Chaudhary/`         | Midterm submission: end-to-end Spring Boot app |
| `SecurityDB/`                      | Spring Boot project with login security (basic Spring Security setup) |
| `SheriwaySchoolWebApp/`            | Final project simulating a school system with student and course modules |

> ✅ Copy versions of some folders (`-Copy`) were kept for backup but can be deleted or ignored if unnecessary.

---

## 💻 Technologies Used

- **Java 21**
- **Spring Boot**
- **Spring MVC**
- **Spring Security**
- **JDBC / JdbcTemplate**
- **H2 Database**
- **Thymeleaf**
- **Lombok**
- **Eclipse IDE / STS / IntelliJ**
- **Maven**

---

## ▶️ How to Run Any Project

1. **Clone this repository**
   ```bash
   git clone https://github.com/xavion-music/EnterpriseJava_Projects_SpringBoot.git
   cd EnterpriseJava_Projects_SpringBoot
   ```

2. **Open in your IDE** (Eclipse, IntelliJ, or VS Code with Spring extensions)

3. **Make sure Lombok plugin is installed** in your IDE if the project uses it.

4. **Run the Application**
   - Right-click the `Application.java` class → `Run as Spring Boot App`
   - Or use the terminal:
     ```bash
     ./mvnw spring-boot:run
     ```

5. **Visit in browser**
   - `http://localhost:8080`

---

## 🗃️ Database Configuration

Most projects use **H2** in-memory database. Check the following:

- `application.properties` or `application.yml` for DB settings.
- Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
  - Driver: `org.h2.Driver`
  - URL: `jdbc:h2:mem:testdb`
  - Username/Password: usually default or as defined in `application.properties`.

---

## 🛠️ Contribution (Optional)

If you'd like to contribute:
1. Fork the repository
2. Create a new branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m "Add some feature"`)
4. Push to the branch (`git push origin feature-name`)
5. Open a Pull Request

---

## 📜 License

This repository is open for academic and learning purposes. You may use, modify, or extend these projects for personal growth. If you use them in your own public repositories, a credit would be appreciated 😊

---

## 👨‍💻 Author

**Palak Yogesh Chaudhary**  
Student | Software Developer | DJ & Music Producer  
📍 Based in Ontario, Canada  
🎵 Creator of sample packs [Aurora Audio](https://samples.landr.com/packs/sacrifice)

---

## ⭐ If you found this useful, consider giving it a star on GitHub!
