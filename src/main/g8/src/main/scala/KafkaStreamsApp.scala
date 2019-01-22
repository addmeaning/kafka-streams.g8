import java.util.Properties

import org.apache.kafka.streams.{KafkaStreams, StreamsConfig}

object KafkaStreamsApp extends App {

  import org.apache.kafka.streams.scala._
  import Serdes._
  import ImplicitConversions._

  val builder = new StreamsBuilder
  val topology = builder.build()

  val props = new Properties()
  val appId = getClass.getName.replace("\$", "")

  props.put(StreamsConfig.APPLICATION_ID_CONFIG, appId)
  props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, ":9092")

  val ks = new KafkaStreams(topology, props)
  ks.start()

}
