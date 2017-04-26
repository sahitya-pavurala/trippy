package com.trippy.adapters

import com.typesafe.config.Config

/**
  * Created by sahityapavurala on 4/24/17.
  */
abstract class Adapter(config: Config) {

  def getAdapter(config : Config): Any
  def execute()
}
