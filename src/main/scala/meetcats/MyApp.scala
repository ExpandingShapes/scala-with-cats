package meetcats

import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._

object MyApp extends App {
  val showInt: Show[Int] = Show.apply[Int]
  val showString: Show[String] = Show.apply[String]

  val intAsString: String = showInt.show(123)
  val stringAsString: String = showString.show("abc")
  
  //make Show easier to use by importing the interface syntax
  val showIntV2 = 123.show
  val showStringV2 = "abc".show
}
