package monoidsandsemigroups.exercises

/**
 * 2.3 The Truth About Monoids
 * We’ve seen a few examples of monoids but there are plenty more to be found.
 * Consider Boolean. How many monoids can you define for this type?
 * For each monoid, define the combine and empty operations and convince yourself
 * that the monoid laws hold. Use the following definitions as a starting point:
 */
object TheTruthAboutMonoidsApp extends App {
  val booleanMonoidOr = Monoid(
    new Monoid[Boolean] {
      override def combine(x: Boolean, y: Boolean): Boolean = x || y
      override def empty: Boolean = false
    }
  )
  val booleanMonoidAnd = Monoid(
    new Monoid[Boolean] {
      override def combine(x: Boolean, y: Boolean): Boolean = x && y
      override def empty: Boolean = true
    }
  )


  println("booleanMonoidOr associative law check:")
  println(Monoid.associativeLaw(false, false, false)(booleanMonoidOr))
  println(Monoid.associativeLaw(false, false, true)(booleanMonoidOr))
  println(Monoid.associativeLaw(false, true, false)(booleanMonoidOr))
  println(Monoid.associativeLaw(false, true, true)(booleanMonoidOr))
  println(Monoid.associativeLaw(true, false, false)(booleanMonoidOr))
  println(Monoid.associativeLaw(true, false, true)(booleanMonoidOr))
  println(Monoid.associativeLaw(true, true, false)(booleanMonoidOr))
  println(Monoid.associativeLaw(true, true, true)(booleanMonoidOr))
}
