name := "$name$"

organization := "$organization$"

description := "$project_description$"

libraryDependencies += "org.apache.kafka" %% "kafka-streams-scala" % "$kafka_streams_version$"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.25"
