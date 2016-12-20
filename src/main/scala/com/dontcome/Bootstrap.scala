package com.dontcome

import org.apache.logging.log4j.LogManager

/**
  * Created by as18 on 12/20/16.
  */

object Bootstrap {
  val logger =  LogManager.getLogger("well, dn is coming soon")

  def main(args: Array[String]): Unit = {
    logger.info("told ya, this world is full of crap people")
    logger.debug("requestBody=<Damn></Damn>")
  }
}
