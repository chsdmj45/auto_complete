package com.mj.auto_complete

import com.mj.auto_complete.business.TernarySearchTree

/**
  * Created by fjim on 24/04/2017.
  */
class AppTest extends BaseTest {
  private var app: App = _

  before {
    app = App(new TernarySearchTree)
  }

  "search" should {
    "success" in {
      app.insert(List("abc", "bcd", "abcd"))
      assertResult(true)(app.search("abc"))
      assertResult(true)(app.search("bcd"))
      assertResult(true)(app.search("abcd"))
      assertResult(false)(app.search("abcde"))
    }
  }
}
