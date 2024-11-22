
# AdminPortal for Bookstore  

AdminPortal is a standalone admin management system built to complement the **Bookstore Application**. It provides administrative tools to manage book records, including adding, editing, and deleting books, as well as uploading and updating book cover images.  

---

## 🚀 Project Overview  

- **AdminPortal URL**: [http://localhost:8081](http://localhost:8081)  
- **Bookstore URL**: [http://localhost:8080](http://localhost:8080)  

> **Note**:  
> - AdminPortal and Bookstore are separate projects that share the same database.  
> - AdminPortal depends on the Bookstore project for database initialization. Always run the Bookstore application before starting AdminPortal.  

---

## ✨ Features  

### 📚 Book Management  
1. **Add Books**: Add new books to the database with title, author, price, and other metadata.  
2. **Update Books**: Edit existing book details and update cover images.  
3. **Delete Books**: Remove books from the database.  

### 🖼️ Image Management  
- Upload and display book cover images.  
- **Only PNG files** are supported. Non-PNG images will not display in the book list.  

---

## 🛠️ Setup and Configuration  

### Prerequisites  
1. **Run the Bookstore Project**  
   - Ensure the Bookstore application (`http://localhost:8080`) is running to initialize database tables.  

2. **Configure Dependencies**  
   - Copy the required dependencies and server configuration from the `pom.xml` file of the Bookstore project to AdminPortal to avoid errors in Spring Tool Suite (STS).  

### Running the Application  
1. Start the **Bookstore Application** first.  
2. Run the **AdminPortal Application** from your development environment (e.g., Spring Tool Suite).  
3. Access AdminPortal via [http://localhost:8081](http://localhost:8081).  

---

## ⚠️ Important Notes  

1. **First Book Initialization**  
   - After adding the first book, restart the AdminPortal server in STS to enable further additions.  

2. **Supported Image Format**  
   - Ensure uploaded book images are in **PNG format** to display correctly.  

3. **Admin Credentials**  
   - **Username**: `admin`  
   - **Password**: `admin`  

---

## 💻 Technologies Used  

- **Backend**: Spring Boot, Hibernate  
- **Frontend**: Thymeleaf, Bootstrap v3.4, HTML, CSS, jQuery  
- **Database**: MySQL  
- **Development Environment**: Spring Tool Suite (STS 4.0.0)  
- **Other Tools**: JavaMailSender  

---

## 📂 Repository  

Check out the Bookstore project here: [Bookstore GitHub Repository](https://github.com/NikolaKrsmanovic1996/Bookstore)  

---

## 🎉 Enjoy Managing Your Bookstore  

AdminPortal provides an intuitive way to manage your bookstore's inventory. Start adding, updating, and deleting books today!  
