package com.trippy.utils

import com.typesafe.config.Config
import twitter4j.conf.{Configuration, ConfigurationBuilder}


object TwitterUtil{

  def getTwitterConf(config : Config): Configuration = {
    val twitterConf = new ConfigurationBuilder()
      .setOAuthConsumerKey(config.getString("consumerKey"))
      .setOAuthConsumerSecret(config.getString("consumerSecret"))
      .setOAuthAccessToken(config.getString("accessToken"))
      .setOAuthAccessTokenSecret(config.getString("accessTokenSecret"))
      .build()
    twitterConf
  }


}
