package com
import spray.json._
import DefaultJsonProtocol._

object Sample {
  def main(args: Array[String]) {
    println("------------------------------")
    val hoge1:List[Map[String,String]] = List(
      Map("hoge"->"fuga"),
      Map("piyo"->"fuga")
    )
    println(hoge1.toJson)
    println("------------------------------")
    val hoge2 = List(
      Map("hoge"-> Map("fuga"->"name")),
      Map("piyo"-> Map("puyo"->"name"))
    )
    println(hoge2.toJson)
    println("------------------------------")
    val hoge3 = List(
      Map("hoge"-> List(1,2,3)),
      Map("piyo"-> List(4,5,6))
    )
    println(hoge3.toJson)
    println("------------------------------")
  }
}
