package introduction.examples

import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._
import introduction.examples.JsonSyntax.JsonWriterOps
import introduction.examples.JsonWriterInstances.{optionWriter, personWriter, stringWriter}

object Introduction extends App {
  //interface objects way of using a TC
  val personJson = Json.toJson(Person("Dave", "dave@example.com"))

  //interface syntax way of using a TC
  val personJson2 = Person("Dave", "dave@example.com").toJson

  val optionJson = Json.toJson(Option("A string"))

  //Meet Cats

  val showInt: Show[Int] = Show.apply[Int]
  val showString: Show[String] = Show.apply[String]

  val intAsString: String = showInt.show(123)

  val stringAsString: String = showString.show("abc")

  val shownInt = 123.show
  // shownInt: String = "123"

  val shownString = "abc".show
  // shownString: String = "abc"
}
