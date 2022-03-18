plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.ihmc-ci") version "7.6"
   id("us.ihmc.ihmc-cd") version "1.23"
   id("us.ihmc.log-tools-plugin") version "0.6.3"
}

ihmc {
   group = "us.ihmc"
   version = "0.0"
   vcsUrl = "https://bitbucket.ihmc.us/projects/TPOSL/repos/jme3-dae"
   openSource = false
   
   configureDependencyResolution()
   configurePublications()
}

val jmeVersion = "3.5.0-stable"

mainDependencies {
   api("org.jmonkeyengine:jme3-core:$jmeVersion")
   api("org.jmonkeyengine:jme3-desktop:$jmeVersion")
}
