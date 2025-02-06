package org.example.data

import org.example.domain.Request.AddFavouriteRequest

class FafouriteRepositoryImpl : FavouriteRepository {
    override fun getAllfavourites() {
        TODO("Not yet implemented")
    }

    override fun addfavourites(vararg addFavouriteRepository: AddFavouriteRequest) {
        TODO("Not yet implemented")
    }

    override fun removeFavourites() {
        TODO("Not yet implemented")
    }

    override fun getFavouriteByUserId(userId: Int): IntArray {
        return favouriteList
            .filter {it.userId == userId}
            .map {it.shoesID}
            .toIntArray()
    }
}