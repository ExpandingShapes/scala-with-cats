package introduction.exercises

import cats.Show
import cats.implicits._

/**
 * 1.4.6 Cat Show
 * Re-implement the Cat application from the previous section
 * using Show instead of Printable.
 */
object CatShowApp extends App {
  val cat = Cat("Edward", 9, "bengal")

  implicit val catShow: Show[Cat] =
    Show.show(cat => s"${cat.name} is a ${cat.age} year-old ${cat.color} cat.")

  cat.show
}
