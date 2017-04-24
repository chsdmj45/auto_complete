package com.mj.auto_complete

import com.mj.auto_complete.business.TernarySearchTree
import com.mj.auto_complete.model.Node

/**
  * Created by fjim on 24/04/2017.
  */
object App {
  def apply(tst: TernarySearchTree) = new App(tst)
}

class App(tst: TernarySearchTree) {
  private var node: Node = _

  def insert(word: String): App = {
    this.node = tst.insert(Some(node), word.toList, 0)
    this
  }

  def insert(words: List[String]): App = {
    words.foreach(w => this.insert(w))
    this
  }

  def search(word: String): Boolean =
    tst.search(Some(node), word.toList, 0)
}
