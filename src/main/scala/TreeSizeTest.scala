object TreeSizeTest extends App{
  val myTree = Branch(Branch(Leaf(1), Leaf(1)), Branch(Leaf(1), Leaf(1)))
  println(Tree.size(myTree))
}

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

object Tree {
  def size[A](t: Tree[A]): Int = t match {
    case Leaf(v) => 1
    case Branch(left, right) => 1 + size(left) + size(right)
  }
}
