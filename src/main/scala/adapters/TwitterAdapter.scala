package com.trippy.adapters

import java.lang.Thread

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
    if(processType.equals("stream"))
     executeStream()
    else if(processType.equals("batch"))
      executeBatch()
    println(adapter)
  }

  override def executeStream(): Unit = {
    val messages = adapter.getDirectMessages
    val stream = messages.stream()
    stream.forEach(
          x => {
            println(x)
            Thread.sleep(5000)
          }
    )
  }

  override def executeBatch(): Unit = {
    println(adapter.getDirectMessages)
  }
}
