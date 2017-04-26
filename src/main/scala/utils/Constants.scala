package com.trippy.utils

/**
  * Created by sahityapavurala on 4/25/17.
  */
object Constants {

  def constMap(x : Any): String = x match {
    case "twitter" => "com.trippy.adapters.TwitterAdapter"
    case "adapt2" => "com.trippy.adapters.CustomAdapter"
  }
}
