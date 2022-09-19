package introduction.examples

import cats.implicits.{catsSyntaxOptionId, none}
import java.util.Date
import cats.{Eq, Show}
import cats.instances.int._
import cats.instances.long._
import cats.instances.option._
import cats.instances.string._
import cats.syntax.show._
import cats.syntax.eq._
import introduction.examples.JsonSyntax.JsonWriterOps
import introduction.examples.JsonWriterInstances.{optionWriter, personWriter, stringWriter}

object IntroductionApp extends App {
  //interface objects way of using a TC
  val personJson = Json.toJson(Person("Dave", "dave@example.com"))

  //interface syntax way of using a TC
  val personJson2 = Person("Dave", "dave@example.com").toJson

  val optionJson = Json.toJson(Option("A string"))

  val showInt: Show[Int] = Show.apply[Int]
  val showString: Show[String] = Show.apply[String]

  val intAsString: String = showInt.show(123)

  val stringAsString: String = showString.show("abc")

  val shownInt = 123.show

  val shownString = "abc".show

  // an instance of Show for Date
  implicit val dateShow: Show[Date] = Show.show(date => s"${date.getTime}ms since the epoch.")

  // comparing ints
  val eqInt = Eq[Int]

  eqInt.eqv(123, 123)
  eqInt.eqv(123, 234)

  123 === 123
  123 =!= 123

  // comparing options
  (Some(1) : Option[Int]) === (None : Option[Int])
  Option(1) === Option.empty[Int]
  1.some === none[Int]

  // custom instance of Eq for Date
  implicit val dateEq: Eq[Date] =
    Eq.instance[Date] { (date1, date2) =>
      date1.getTime === date2.getTime
    }

  val x = new Date()
  val y = new Date()

  x === y

}
