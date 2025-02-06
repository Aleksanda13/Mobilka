package org.example.domain.Pesponse

import org.example.data.model.ShoesDTO
import org.example.domain.Response.ShoesResponse
import kotlin.reflect.KFunction1

data class UserResponse(
    val userId: Int,
    var firstName: String,
    var lastName: String? = null,
    var email: String,
    var phone: String? = null,
    var address: String? = null,
    var favouriteList: List<KFunction1<ShoesDTO, ShoesResponse>> = emptyList()
)
