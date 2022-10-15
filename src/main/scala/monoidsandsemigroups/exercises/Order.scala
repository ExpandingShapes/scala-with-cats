package monoidsandsemigroups.exercises

case class Order(totalCost: Double, quantity: Double)

object Order {
  implicit val orderSemigroup = new cats.Semigroup[Order] {
    override def combine(x: Order, y: Order): Order =
      Order(x.totalCost + y.totalCost, x.quantity + y.quantity)
  }
}
