package thetruthaboutmonoids

object BooleanMonoids {
  implicit val booleanAndMonoid = new Monoid[Boolean] {
    def empty = true
    def combine(x: Boolean, y: Boolean): Boolean = x && y
  }

  implicit val booleanOrMonoid = new Monoid[Boolean] {
    def empty = false
    def combine(x: Boolean, y: Boolean): Boolean = x || y
  }

  implicit val booleanXorMonoid = new Monoid[Boolean] {
    def empty = false
    def combine(x: Boolean, y: Boolean): Boolean = (x && !y) || (!x && y)
  }

  implicit val booleanXnorMonoid = new Monoid[Boolean] {
    def empty = true
    def combine(x: Boolean, y: Boolean): Boolean = (!x || y) && (x || !y)
  }
}
