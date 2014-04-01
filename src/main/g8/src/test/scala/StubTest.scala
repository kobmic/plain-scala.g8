package $organization$

import org.scalatest._

class StubTest extends FunSpec with Matchers {

  describe("you description here") {
    it("should do something") {
      "Hello world" should equal("Hello world")
    }
  }
}
