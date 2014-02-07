package $organization$

import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class StubTest extends FunSpec with Matchers {

  describe("you description here") {
    it("should do something") {
      "Hello world" should equal("Hello world")
    }
  }
}
