package monoidsandsemigroups.exercises

/**
 * 2.4 What monoids and semigroups are there for sets?
 */
object AllSetForMonoidsApp extends App {
  def setUnionMonoid[A]: Monoid[Set[A]] =
    new Monoid[Set[A]] {
      override def combine(x: Set[A], y: Set[A]): Set[A] = x union y
      override def empty: Set[A] = Set.empty[A]
    }

  def setIntersectSemigroup[A]: Semigroup[Set[A]] =
    new Semigroup[Set[A]] {
      override def combine(x: Set[A], y: Set[A]): Set[A] = x intersect y
    }

  def setSymDiffMonoid[A]: Monoid[Set[A]] =
    new Monoid[Set[A]] {
      override def empty: Set[A] = Set.empty[A]
      override def combine(x: Set[A], y: Set[A]): Set[A] = (x diff y) union (y diff x)
    }
}
