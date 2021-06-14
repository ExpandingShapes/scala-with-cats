package thetruthaboutmonoids

trait Semigroup[A] {
  def combine(x: A, y: A): A
}
