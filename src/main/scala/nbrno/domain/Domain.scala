package nbrno.domain

import java.sql.Timestamp

case class User(id:Option[Int], username:String, email:Option[String], password:Option[String],
                passhash:Option[String], createdFromIp:Option[String], createdAt:Option[Timestamp])
case class Rapper(id:Int, name:String, createdAt:Timestamp)
case class Rating(id:Option[Int], userId:Int, rapperId:Int, rating:Int, updatedAt:Timestamp)