package com.trippy

import com.trippy.utils.ConfigLoader._
import com.trippy.utils.TwitterUtil._
import twitter4j.TwitterFactory
import com.trippy.utils.Constants._
import org.slf4j.LoggerFactory

import scala.collection.mutable

class Driver{
    val LOGGER = LoggerFactory.getLogger(getClass)

    LOGGER.info("Inside Driver. Loading Adapter Constructors")
    val adapters = getAdapters
    val classObjs = scala.collection.mutable.MutableList[com.trippy.adapters.Adapter]()
    for (i <- 0 until adapters.size()){

        val cname = Class.forName(constMap(adapters.get(i).getString("classname")))
        classObjs += cname.getConstructors()(0)
                            .newInstance(adapters.get(0))
                            .asInstanceOf[com.trippy.adapters.Adapter]
        LOGGER.info("Loaded constructor of "+ cname.getName);

    }

    //val foo  = Class.forName("Foo").newInstance.asInstanceOf[{ def hello(name: String): String }]

}


object Driver extends App{
    val LOGGER = LoggerFactory.getLogger(getClass)

    val runner = new Driver()
    LOGGER.info("Executing methods of adapters")
    for (obj <- runner.classObjs){
        LOGGER.info("Executing execute method of "+ obj.getClass.getSimpleName)
        obj.execute()
    }

}