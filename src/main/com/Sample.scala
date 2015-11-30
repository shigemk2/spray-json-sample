package com
import spray.json._

object Sample extends DefaultJsonProtocol {
  def main(args: Array[String]) {
    val hoge:List[List[String]] = List(
      List("hoge", "fuga"),
      List("piyo", "fuga")
    )
    println(hoge.toJson)
  }
}
