package br.com.tayana.bookAPI.repositories

import br.com.tayana.bookAPI.entities.Book
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.repository.MongoRepository

interface BookRepository : MongoRepository<Book, String> {

    fun save(book: Book)
    //fun find(query: Query): List<Book>
//    fun findByTitle(title: String): Book
//    fun findByAuthor(author: String): Book
//    fun findByISBN(ISBN: String): Book
}