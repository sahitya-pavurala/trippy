package com.trippy

import com.trippy.utils.ConfigLoader._
import com.trippy.utils.TwitterUtil._
import twitter4j.TwitterFactory

class Driver{
    val adapters = getAdapters

    def loadAdapterClasses = {

    }
}


object Driver extends App{

    //val twitter_adapter = new TwitterFactory(getTwitterConf).getInstance
    //println(twitter_adapter.getDirectMessages)
    for(adapter <- new Driver().adapters){

    }
    val twitter_adapter = {
        new TwitterFactory(getTwitterConf(new Driver().adapters.getConfig("twitter"))).getInstance
    }
    println(twitter_adapter.getDirectMessages)
    println(twitter_adapter)




}