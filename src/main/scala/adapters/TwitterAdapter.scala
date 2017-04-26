package com.trippy.adapters

import com.trippy.utils.TwitterUtil._
import com.typesafe.config.Config
import org.slf4j.LoggerFactory
import twitter4j.{Twitter, TwitterFactory}

/**
  * Created by sahityapavurala on 4/24/17.
  */
class TwitterAdapter(config : Config) extends Adapter(config){
  val LOGGER = LoggerFactory.getLogger(getClass)

  val adapter = getAdapter(config)

  override def getAdapter(config : Config): Twitter = {
    LOGGER.info("Loading adapter of Twitter")
    val adapter = new TwitterFactory(getTwitterConf(config)).getInstance
    adapter
  }

  override def execute(): Unit = {
    println(adapter.getDirectMessages)
    println(adapter)
  }
}
