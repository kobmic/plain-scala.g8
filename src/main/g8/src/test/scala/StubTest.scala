package "$organization$"

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class StubTest extends Spec with ShouldMatchers {

  describe("you description here") {
    it("should do something") {
      "Hello world" should equal("Hello world")
    }
  }
}
