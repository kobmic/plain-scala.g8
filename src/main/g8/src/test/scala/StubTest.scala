import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class StubSpec extends Spec with ShouldMatchers {

  describe("you description here") {
    it("should do something") {
      //greeter.sayHello should equal("God morning! Have fun with Scala.")
    }
  }
}
