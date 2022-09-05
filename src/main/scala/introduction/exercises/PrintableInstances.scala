package introduction.exercises

object PrintableInstances {
  implicit val stringFormatter: Printable[String] =
    new Printable[String] {
      override def format(value: String): String = value
    }
  implicit val intFormatter: Printable[Int] =
    new Printable[Int] {
      override def format(value: Int): String = value.toString
    }
}
