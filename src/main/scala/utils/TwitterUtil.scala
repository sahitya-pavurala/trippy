package com.trippy.utils

import com.typesafe.config.Config
import org.slf4j.LoggerFactory
import twitter4j.conf.{Configuration, ConfigurationBuilder}


object TwitterUtil{
  val LOGGER = LoggerFactory.getLogger(getClass)

  def getTwitterConf(config : Config): Configuration = {
    LOGGER.info("Getting twitter config")
    val twitterConf = new ConfigurationBuilder()
      .setOAuthConsumerKey(config.getString("consumerKey"))
      .setOAuthConsumerSecret(config.getString("consumerSecret"))
      .setOAuthAccessToken(config.getString("accessToken"))
      .setOAuthAccessTokenSecret(config.getString("accessTokenSecret"))
      .build()
    twitterConf
  }


}
