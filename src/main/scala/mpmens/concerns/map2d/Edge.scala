package mpmens.concerns.map2d

class Edge private[map2d](val from: Node, val to: Node) {
  val length: Double = from.center.distanceTo(to.center)
}