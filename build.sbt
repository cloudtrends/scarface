name := "scarface"

organization := "com.github.fujohnwang"

version := "0.0.1-SNAPSHOT"

publishMavenStyle := true

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

scalacOptions := Seq("-deprecation", "-unchecked","-optimise")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalaVersion := "2.10.4"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Akka.IO Repo" at "http://akka.io/repository"

resolvers += "Local Maven Repo" at "file://"+Path.userHome+"/.m2/repository"

libraryDependencies += "ch.qos.logback" % "logback-core" % "1.1.2"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"

libraryDependencies += "org.slf4j" % "jcl-over-slf4j" %"1.6.2"

libraryDependencies += "org.slf4j" % "log4j-over-slf4j" %"1.6.2"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.2"

libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.3.2"

libraryDependencies += "org.springframework" % "spring-context" % "3.2.0.RELEASE"

libraryDependencies += "com.yammer.metrics" % "metrics-core" % "2.1.1"

libraryDependencies += "io.netty" % "netty-all" % "4.0.6.Final"

libraryDependencies +=  "org.scalatest" %% "scalatest" % "1.9.1" % "test"

libraryDependencies += "com.google.guava" % "guava" % "17.0"

libraryDependencies += "commons-io" % "commons-io" % "2.4"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.1"

libraryDependencies += "org.parboiled" %% "parboiled-scala" % "1.1.4"

libraryDependencies += "com.ning" % "async-http-client" % "1.7.11"

libraryDependencies += "org.jsoup" % "jsoup" % "1.7.2"

libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "2.3.1.201302201838-r"

libraryDependencies += "net.schmizz" % "sshj" % "0.8.1"

libraryDependencies += "org.springframework" % "spring-orm" % "3.0.7.RELEASE"

libraryDependencies += "org.apache.ibatis" % "ibatis-sqlmap" % "2.3.4.726"

libraryDependencies += "org.mvel" % "mvel2" % "2.1.6.Final"

libraryDependencies += "com.google.zxing" % "core" % "2.2"

libraryDependencies += "com.google.zxing" % "javase" % "2.2"

libraryDependencies += "org.imgscalr" % "imgscalr-lib" % "4.2"

libraryDependencies += "com.h2database" % "h2" % "1.3.172" % "test"

libraryDependencies += "org.elasticsearch" % "elasticsearch" % "0.90.6"

libraryDependencies += "org.jdom" % "jdom" % "2.0.2"

libraryDependencies += "com.netflix.rxjava" % "rxjava-core" % "0.19.2"

libraryDependencies += "com.netflix.rxjava" % "rxjava-scala" % "0.19.2"

libraryDependencies += "org.apache.kafka" % "kafka_2.10" % "0.8.1.1" excludeAll(ExclusionRule(organization = "com.sun.jdmk"),
    ExclusionRule(organization = "com.sun.jmx"))

libraryDependencies += "com.alibaba" % "fastjson" % "1.1.41"

libraryDependencies += "org.msgpack" % "msgpack" % "0.6.11"

net.virtualvoid.sbt.graph.Plugin.graphSettings

