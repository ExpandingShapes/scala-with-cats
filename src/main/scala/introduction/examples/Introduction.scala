package introduction.examples

import introduction.examples.JsonSyntax.JsonWriterOps
import introduction.examples.JsonWriterInstances.{optionWriter, personWriter, stringWriter}

object Introduction extends App {
  //interface objects way of using a TC
  val personJson = Json.toJson(Person("Dave", "dave@example.com"))

  //interface syntax way of using a TC
  val personJson2 = Person("Dave", "dave@example.com").toJson

  val optionJson = Json.toJson(Option("A string"))
}
