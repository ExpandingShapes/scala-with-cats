package monoidsandsemigroups.exercises

trait Semigroup[A] {
  def combine(x: A, y: A): A
}
