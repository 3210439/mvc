package com.example.mvc.model.http

//@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class UserRequest (
    var name:String?=null,
    var age:Int?=null,
    var email:String?=null,
    var address:String?=null,
    var phoneNumber:String?=null    // 대부분 JSON은 snake case이다 언더바 사용한다는 의미
)

