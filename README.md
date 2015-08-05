## [giter8](http://github.com/n8han/giter8) template for plain Scala sbt project

### uses
* Scala 2.11.7
* Scalatest 2.2.4
* specs2 3.6.4

### predefined sbt plugins (require sbt 0.13.x):
* sbteclipse 4.0.0
* sbt-idea 1.6.0


### usage:
Follow g8 [installation instructions](http://github.com/n8han/giter8#readme) or when using homebrew:

    brew install giter8

Go to your favourite shell and enter  

    g8 kobmic/plain-scala
    cd [app-name]
    sbt compile


generate project files for your favourite IDE

    sbt eclipse
    sbt gen-idea

### License:
Licensed under the Apache License, Version 2.0, see http://www.apache.org/licenses/LICENSE-2.0
