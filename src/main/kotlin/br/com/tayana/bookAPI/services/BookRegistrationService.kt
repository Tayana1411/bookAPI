package br.com.tayana.bookAPI.services

import br.com.tayana.bookAPI.dto.request.BookRequestDTO
import br.com.tayana.bookAPI.entities.Book
import br.com.tayana.bookAPI.repositories.BookRepository
import java.util.*

class BookRegistrationService(private val repository: BookRepository) {

    fun registration(bookRequest: BookRequestDTO): Boolean {
        val book = Book(
            bookRequest.title!!, bookRequest.author!!, bookRequest.city!!,
            bookRequest.publishingCompany!!, bookRequest.year!!, bookRequest.ISBN!!,
            bookRequest.matters!!
        )
        return Objects.nonNull(repository.save(book))
    }
}