package introduction.exercises

import cats.Eq
import cats.syntax.eq._

/**
 * 1.5.5 Equality, Liberty, and Felinity
 * Implement an instance of Eq for our running Cat example
 */
object EqualityLibertyandFelinityApp extends App {
  implicit val catEq: Eq[Cat] =
    Eq.instance[Cat]{(cat1, cat2) =>
      cat1.name === cat2.name &&
      cat1.age === cat2.age &&
      cat1.color === cat2.color
    }

  val cat1 = Cat("Garfield", 38, "orange and black")
  val cat2 = Cat("Heathcliff", 33, "orange and black")

  val optionCat1 = Option(cat1)
  val optionCat2 = Option.empty[Cat]

  cat1 === cat2
  optionCat1 === optionCat2
}
