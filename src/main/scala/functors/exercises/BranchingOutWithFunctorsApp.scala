package functors.exercises

import cats.implicits.toFunctorOps

object BranchingOutWithFunctorsApp extends App {
  Tree.leaf(10).map(_ * 5)
  Tree.branch(Tree.leaf(10), Tree.leaf(20)).map(_ * 2)
}
