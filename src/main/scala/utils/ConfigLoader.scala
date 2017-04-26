package com.trippy.utils
import java.util

import com.typesafe.config.{Config, ConfigFactory}
import org.slf4j.LoggerFactory


object ConfigLoader{
  val LOGGER = LoggerFactory.getLogger(getClass)

  val conf = ConfigFactory.load()


  val getAdapters: util.List[_ <: Config] = {
    LOGGER.info("Getting adapters")
    val adapters = conf.getConfigList("app.adapters")
    adapters
  }

}
