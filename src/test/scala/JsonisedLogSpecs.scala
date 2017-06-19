import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.core.AppLogEvent
import org.scalatest.FunSuite

/**
  * Created by prayagupd
  * on 12/20/16.
  */

class JsonisedLogSpecs extends FunSuite {

  val logger =  LogManager.getLogger(classOf[JsonisedLogSpecs])

  test("test info and error"){
    logger.info(new AppLogEvent().put("key", "streaming-world").put("someInt", 1000l).toString)
    logger.error(new AppLogEvent().put("key", "streaming-world").put("error", new Exception("something bad")).toString)

    assert(1 == 1)
  }
}
