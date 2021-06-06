package anatomyofatypeclass

//Generic Serialize to Json behaviour
sealed trait Json
final case class JsObject(get: Map[String, Json]) extends Json
final case class JsString(get: String) extends Json
final case class JsNumber(get: Double) extends Json
final case object JsNull extends Json

trait JsonWriter[A] {
  def write(value: A): Json
}

/*
The simplest way of creating an interface that uses a type class
 */
object Json {
  def toJson[A](value: A)(implicit w: JsonWriter[A]): Json = w.write(value)
}

object JsonSyntax {
  implicit class JsonWriterOps[A](value: A) {
    def toJson(implicit w: JsonWriter[A]): Json = w.write(value)
  }
}

object JsonWriters {
  /**
   * Be sure to mark to the method as implicit parameters
   */
  implicit def optionWriter[A](implicit writer: JsonWriter[A]): JsonWriter[Option[A]] =
    new JsonWriter[Option[A]] {
      def write(option: Option[A]): Json = option match {
        case Some(value) => writer.write(value)
        case None => JsNull
      }
    }
}
