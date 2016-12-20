import org.apache.logging.log4j.LogManager

/**
  * Created by prayagupd
  * on 12/20/16.
  */

object TestLogs {
  val logger =  LogManager.getLogger("fhkajgh")

  def main(args: Array[String]): Unit = {
    logger.info("this world is full of crap people")
  }
}
