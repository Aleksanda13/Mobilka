package org.example.domain.Response

import org.example.data.model.ShoesDTO
import org.example.data.model.UserDTO
import org.example.domain.Pesponse.UserResponse

fun UserDTOtoUserResponse(userDTO: UserDTO, shoesList: List<ShoesDTO> = emptyList()) = UserResponse(
    lastName = userDTO.lastName,
    firstName = userDTO.firstName,
    email = userDTO.email,
    phone = userDTO.phone,
    userId = userDTO.userId,
    address = userDTO.address,
//    favouriteList = shoesList.map{::shoesDtoToUserResponse}
)

fun shoesDtoToUserResponse(shoesDTO: ShoesDTO) = ShoesResponse(
    shoesId = shoesDTO.shoesId,
    shoesName = shoesDTO.shoesName,
    shoesDescription = shoesDTO.shoesDescription,
    shoesUrl = shoesDTO.shoesUrl,
    category = shoesDTO.shoesName,

)