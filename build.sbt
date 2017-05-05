name := "log4j2-jsonlayout-example"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.mavenLocal

libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.6.2"

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.6.2"

libraryDependencies += "net.json.log4j2" % "log4j2-jsonlayout" % "4.1.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"