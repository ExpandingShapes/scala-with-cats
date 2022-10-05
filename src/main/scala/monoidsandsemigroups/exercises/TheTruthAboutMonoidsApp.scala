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
  val booleanMonoidXor = Monoid(
    new Monoid[Boolean] {
      override def combine(x: Boolean, y: Boolean): Boolean = x ^ y
      override def empty: Boolean = false
    }
  )

  checkBooleanMonoidObeysLaws(booleanMonoidOr)
  checkBooleanMonoidObeysLaws(booleanMonoidAnd)
  checkBooleanMonoidObeysLaws(booleanMonoidXor)

  private def checkBooleanMonoidObeysLaws(monoid: Monoid[Boolean]) = {
    println("Associative law check:")
    println(Monoid.associativeLaw(false, false, false)(monoid))
    println(Monoid.associativeLaw(false, false, true)(monoid))
    println(Monoid.associativeLaw(false, true, false)(monoid))
    println(Monoid.associativeLaw(false, true, true)(monoid))
    println(Monoid.associativeLaw(true, false, false)(monoid))
    println(Monoid.associativeLaw(true, false, true)(monoid))
    println(Monoid.associativeLaw(true, true, false)(monoid))
    println(Monoid.associativeLaw(true, true, true)(monoid))

    println("Identity law check:")
    println(Monoid.identityLaw(false)(monoid))
    println(Monoid.identityLaw(true)(monoid))
  }
}
