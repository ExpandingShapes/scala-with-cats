package monoidsandsemigroups.exercises

/**
 * 2.3 The Truth About Monoids
 * We’ve seen a few examples of monoids but there are plenty more to be found.
 * Consider Boolean. How many monoids can you define for this type?
 * For each monoid, define the combine and empty operations and convince yourself
 * that the monoid laws hold. Use the following definitions as a starting point:
 */
object TheTruthAboutMonoidsApp extends App {
  val booleanMonoid = Monoid(
    new Monoid[Boolean] {
      override def combine(x: Boolean, y: Boolean): Boolean = ???
      override def empty: Boolean = ???
    }
  )
}
