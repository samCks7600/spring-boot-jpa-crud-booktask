# spring-boot-crud-booktask

Add a new book:
POST
http://localhost:9191/create/book
{
    "bookName" : "XDDDD",
    "author" : "alex",
    "publishDate" : "2023-09-23",
    "price" : "9.99",
    "isbn" : "123-54312-123344"
}

{
    "bookName" : "SIMP",
    "author" : "alex",
    "publishDate" : "2021-05-04",
    "price" : "9.99",
    "isbn" : "123-123131-21344"
}


Get all books:
GET 
http://localhost:9191/read/books

Get a book by its ID:
GET 
http://localhost:9191/read/bookById/{id}


Get books by author:
GET 
http://localhost:9191/read/booksByAuthor/{author}
http://localhost:9191/read/booksByAuthor/alex


Update a book by id:
PUT 
http://localhost:9191/update/book/{id}


Delete a book by id:
DELETE 
http://localhost:9191/delete/book/{id}
