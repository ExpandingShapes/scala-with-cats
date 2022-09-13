package exampleeq

import java.util.Date

import cats.Eq
import cats.implicits._
import cats.instances.int._
import cats.instances.option._
import cats.instances.long._
import cats.syntax.eq._

object MyApp extends App {
  //comparing Ints
//  val eqInt = Eq[Int]
//
//  eqInt.eqv(123, 123)
//  eqInt.eqv(123, 234)
//
//  123 === 123
//  123 =!= 234
//
//  //comparing Options
//  (Some(1): Option[Int]) === (None: Option[Int])
//  Option(1) === Option.empty[Int]
//  1.some === none[Int]
//
//  //comparing Dates
//  implicit val dateEq: Eq[Date] = Eq.instance[Date] { (date1, date2) =>
//    date1.getTime === date2.getTime
//  }
//
//  new Date === new Date
}
