import org.apache.logging.log4j.LogManager
import org.scalatest.FunSuite

/**
  * Created by prayagupd
  * on 12/20/16.
  */

class TestLogs extends FunSuite {

  val logger =  LogManager.getLogger("fhkajgh")

  test("shfdkj"){
    logger.info("this world is full of crap people")
    logger.debug("requestBody=<Damn></Damn>")

    assert(1 == 1)
  }
}
