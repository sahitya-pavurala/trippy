package com.trippy.adapters
import com.typesafe.config.Config
import org.slf4j.LoggerFactory

/**
  * Created by sahityapavurala on 4/25/17.
  */
class CustomAdapter(config: Config) extends Adapter(config){
  val LOGGER = LoggerFactory.getLogger(getClass)

  override def execute(): Unit = ???

  override def getAdapter(config: Config): Unit = ???
}
