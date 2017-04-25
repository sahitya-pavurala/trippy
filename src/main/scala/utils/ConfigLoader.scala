package com.trippy.utils
import com.typesafe.config.{Config, ConfigFactory}
import twitter4j.conf.{Configuration, ConfigurationBuilder}


object ConfigLoader{

  val conf = ConfigFactory.load()


  val getAdapters: Config = {
    val adapters = conf.getConfig("adapters")
    adapters
  }

}
