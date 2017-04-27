package com.trippy.adapters
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import javax.net.ssl.SSLContext
import java.util.concurrent.Executors

import com.ning.http.client.{AsyncHttpClient, AsyncHttpClientConfig}
import com.socrata.soda2.consumer.http.HttpConsumer
import com.socrata.soda2.consumer.Consumer
import com.socrata.soda2.values.SodaString
import com.socrata.future.ExecutionContextTimer.Implicits._
import com.trippy.utils.TwitterUtil._
import com.typesafe.config.Config
import org.slf4j.LoggerFactory
import twitter4j.TwitterFactory

import scala.io.{BufferedSource, Source}

class NYCDAdapter(config : Config) extends Adapter(config){
  val LOGGER = LoggerFactory.getLogger(getClass)

  val adapter = getAdapter(config)

  override def getAdapter(config: Config): BufferedSource = {
    LOGGER.info("Loading adapter of NYCData")
    val html = Source.fromURL(config.getString("data_url"))
    html
  }

  override def execute(): Unit = {

    val s = adapter.mkString
    println(s)

  }




}