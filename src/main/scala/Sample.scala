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
    // 以下のようなJSONパースはできない
    // Cannot find JsonWriter or JsonFormat type class for List[scala.collection.immutable.Map[String,scala.collection.immutable.Iterable[Any] with PartialFunction[Int with String,Any]{def seq: scala.collection.immutable.Iterable[Any] with PartialFunction[Int with String,Any]{def seq: scala.collection.immutable.Iterable[Any] with PartialFunction[Int with String,Any]}}]]
    // println("------------------------------")
    // val hoge4 = List(
    //   Map("hoge"-> Map("hoge"->"fuga")),
    //   Map("piyo"-> List(4,5,6))
    // )
    // println(hoge4.toJson)
    // println("------------------------------")
    case class Jsons(id: Option[Int], name: Option[String], map: Option[Map[String,String]])
    // val hoge5 = JSONS(Option(1))
    // println(hoge5.toJson)
    object MyJsonProtocol extends DefaultJsonProtocol {
      implicit val jsonFormat = jsonFormat3(Jsons)
    }
    import MyJsonProtocol._
    println(Jsons(Option(1)).toJson)
  }
}
