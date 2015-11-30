package com
import spray.json._
import DefaultJsonProtocol._

object Sample {
  def main(args: Array[String]) {
    val hoge:List[Map[String,String]] = List(
      Map("hoge"->"fuga"),
      Map("piyo"->"fuga")
    )
    println(hoge.toJson)
  }
}
