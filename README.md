# AdminPortal for Bookstore Application
AdminPortal is a standalone web application designed to manage the books for the Bookstore Application. 
The AdminPortal enables administrators to perform CRUD (Create, Read, Update, Delete) operations on books, including managing book details and uploading cover images.

#Note:
AdminPortal and Bookstore are separate projects that run on the same database but different localhost ports:

AdminPortal: http://localhost:8081
Bookstore: http://localhost:8080
Prerequisites
Before running the AdminPortal, ensure the following:

#The Bookstore Application is running to initialize database tables.
Copy the dependencies and server configuration from the pom.xml file of the Bookstore project to the AdminPortal project to avoid errors in Spring Tool Suite (STS).
Features
Add Books

#Add new books to the database, including title, author, price, and other details.
Upload a cover image for the book (only PNG files are supported).
Update Books

#Edit existing book details.
Replace or update the book's cover image.
Delete Books

#Remove books from the database.
Image Support

#Display book images in the book list. Ensure that the uploaded file is in PNG format.
Instructions
Running the Application
Start the Bookstore Application (http://localhost:8080) to initialize database tables.
Run the AdminPortal Application (http://localhost:8081).
Adding, Updating, and Deleting Books
Add the first book using the AdminPortal.
After adding the first book, restart the AdminPortal server in STS before adding another book.
For proper image display, ensure that uploaded images are in PNG format.
Technologies Used
Backend: Spring Boot, Hibernate
Frontend: Thymeleaf, HTML, CSS, Bootstrap v3.4, Basic JavaScript (jQuery)
Database: MySQL
Development Environment: Spring Tool Suite (STS 4.0.0)
Additional Tools: JavaMailSender
AdminPortal Credentials
Username	Password
admin	admin
Repository
Bookstore GitHub Repository
Important Notes
Ensure the Bookstore application is running before starting AdminPortal to initialize database tables.
Only PNG files are supported for book cover images; other formats will not display correctly.
Restart the server in STS after adding the first book for proper functionality.
Enjoy managing your bookstore with AdminPortal! 🎉
