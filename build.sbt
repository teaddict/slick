name := "objektwerks.slick"

version := "1.0"

scalaVersion := "2.11.7"
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

resolvers ++= Seq(
  "Scalaz Bintray" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= {
  Seq(
    "com.typesafe.slick" % "slick_2.11" % "3.0.0",
    "com.typesafe" % "config" % "1.3.0",
    "com.h2database" % "h2" % "1.4.187",
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "org.scalatest" % "scalatest_2.11" % "2.2.5" % "test"
  )
}

scalacOptions ++= Seq(
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:reflectiveCalls",
  "-language:higherKinds",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Xfatal-warnings"
)

fork in test := true

javaOptions += "-server -Xss1m -Xmx2g"

logLevel := Level.Info