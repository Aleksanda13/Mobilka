package org.example.domain

import org.example.data.model.ShoesDTO
import org.example.domain.Request.ShoesAddRequest

interface ShoesUseCase {
    fun getAllShoes() : List<ShoesDTO>
    fun addShoes(shoesAddRequest: ShoesAddRequest): ShoesDTO
    fun removeShoesById(shoesId : Int) : Boolean
}