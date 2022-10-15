package monoidsandsemigroups.examples

import cats.{Monoid, Semigroup}
import cats.syntax.semigroup._

object MonoidsAndSemigroupsApp extends App {
  Monoid[String].empty

  //results in the same
  Monoid[String].combine("Hi", " there")
  Monoid.apply[String].combine("Hi", " there")
  Semigroup.apply[String].combine("Hi", " there")

  // |+| operator is the combine method
  val intResult = 1 |+| 2 |+| Monoid[Int].empty
  
}
