package anatomyofatypeclass.exercise

object PrintableInstances {
  implicit val stringFormatter: Printable[String] = new Printable[String] {
    def format(value: String): String = value
  }

  implicit val intFormatter: Printable[Int] = new Printable[Int] {
    def format(value: Int): String = s"$value"
  }

  implicit val catFormatter: Printable[Cat] = new Printable[Cat] {
    def format(value: Cat): String = s"${value.name} is a ${value.age} year-old ${value.color} cat."
  }
}
