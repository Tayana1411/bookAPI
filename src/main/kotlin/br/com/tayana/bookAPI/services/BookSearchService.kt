package br.com.tayana.bookAPI.services

import br.com.tayana.bookAPI.entities.Book
import br.com.tayana.bookAPI.enums.Criteria
import br.com.tayana.bookAPI.repositories.BookRepository
import org.springframework.data.mongodb.core.query.Query

class BookSearchService(private val repository: BookRepository) {

    fun searchByCriteria(criteria: Criteria, value: String): List<Book> {
        val query = Query()
        query.addCriteria(
            org.springframework.data.mongodb.core.query.Criteria.where(criteria.field).`is`(value)
        )
        return ArrayList()
        //return repository.find(query)
    }


}