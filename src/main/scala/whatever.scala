import org.apache.logging.log4j.LogManager

/**
  * Created by as18 on 12/20/16.
  */
object whatever {
  val logger = LogManager.getLogger("jjhgh")

  def main(args: Array[String]): Unit = {
    logger.info("the story goes on and on")
  }
}
