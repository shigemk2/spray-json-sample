package com
import spray.json._
import DefaultJsonProtocol._

object Sample {
  def main(args: Array[String]) {
    val hoge:List[List[String]] = List(
      List("hoge", "fuga"),
      List("piyo", "fuga")
    )
    println(hoge.toJson)
  }
}
