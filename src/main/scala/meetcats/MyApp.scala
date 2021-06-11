package meetcats

import java.util.Date

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
  
  /*
  We can define an instance of Show simply by implementing the trait for a given type (Date):
  implicit val dateShow: Show[Date] = newShow[Date] {
    def show(date: Date): String = s"${date.getTime}ms since the epoch."
  }
  */

  //Cats also provides a couple of convenient methods to simplify the process
  implicit val dateShow: Show[Date] = Show.show(date => s"${date.getTime}ms since the epoch.")
}
