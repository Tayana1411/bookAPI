package br.com.tayana.bookAPI.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Book(
    val title: String? = null,
    val author: String? = null,
    val city: String? = null,
    val publishingCompany: String? = null,
    val year: Int? = null,
    @Id
    val ISBN: Long? = null,
    val matters: ArrayList<String>? = null
) {


}