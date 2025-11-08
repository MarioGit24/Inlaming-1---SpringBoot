# INL - Projektbeskrivning

Detta är ett Spring Boot-projekt för Inlämning 1 (Controller Model and View).

## 🚀 Förutsättningar

För att köra projektet behöver du ha följande installerat:
* [Git](https://git-scm.com/)
* [Java 21 (eller senare)](https://www.oracle.com/java/technologies/downloads/)

(Du behöver **inte** installera Maven, projektet använder den inbyggda "Maven Wrapper" - `mvnw`).

## ⚙️ Så här kör du projektet

1.  **Klona ner projektet**
    ```bash
    git clone [https://github.com/ditt-användarnamn/ditt-repo-namn.git](https://github.com/ditt-användarnamn/ditt-repo-namn.git)
    ```

2.  **Navigera in i mappen**
    ```bash
    cd ditt-repo-namn
    ```

3.  **Gör Maven-wrappern körbar (endast Mac/Linux):**
    (Detta steg behövs bara göras en gång.)
    ```bash
    chmod +x mvnw
    ```

4.  **Starta applikationen**

    * På **Mac/Linux**:
        ```bash
        ./mvnw spring-boot:run
        ```
    * På **Windows**:
        ```bash
        mvnw.cmd spring-boot:run
        ```

5.  **Öppna i webbläsaren**
    När du ser i terminalen att applikationen har startat (letar efter "Started InlApplication..."), öppna följande URL:er i din webbläsare:

    * **Hemsida:** `http://localhost:8080/website/books/home.html`
    * **Boklista:** `http://localhost:8080/website/books/booklist.html`
    * **Genre-sida:** `http://localhost:8080/website/books/genre.html`
    * **Filtrerad genre:** `http://localhost:8080/website/books/genre.html?genre=Fantasy`
      
