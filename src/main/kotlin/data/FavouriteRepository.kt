package org.example.data

import org.example.domain.Request.AddFavouriteRequest

interface FavouriteRepository {
    fun getAllfavourites()
    fun addfavourites(vararg addFavouriteRepository: AddFavouriteRequest)

    fun removeFavourites()

    fun getFavouriteByUserId(userId: Int): Array<Int>
}