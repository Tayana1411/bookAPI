package br.com.tayana.bookAPI.dto.request

class BookRequestDTO {

    var title: String? = null
    var author: String? = null
    var city: String? = null
    var publishingCompany: String? = null
    var year: Int? = null
    var ISBN: Long? = null
    var matters: ArrayList<String>? = null
}
