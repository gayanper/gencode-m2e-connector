### GenCode-M2E-Connector

M2E connector plugin which can be used to connected generated source code folders into eclipse in the absence of a proper m2e connector for code generating maven plugin.

### Update Site

[https://dl.bintray.com/gayanper/p2/gencode-m2e-connector/nightly/] (https://dl.bintray.com/gayanper/p2/gencode-m2e-connector/nightly/)



### CI 

![](https://travis-ci.org/gayanper/gencode-m2e-connector.svg?branch=master)[https://travis-ci.org/gayanper/gencode-m2e-connector](https://travis-ci.org/gayanper/gencode-m2e-connector)



### Development

This project is built using Eclipse Tycho (https://www.eclipse.org/tycho/) and requires at least maven 3.0 (http://maven.apache.org/download.html) to be built via CLI. 
Simply run :

    mvn install

The first run will take quite a while since maven will download all the required dependencies in order to build everything.

In order to use the generated eclipse plugins in Eclipse, you will need m2e (https://www.eclipse.org/m2e) 
and the m2eclipse-tycho plugin (https://github.com/tesla/m2eclipse-tycho/). Update sites to install these plugins : 

* m2e stable update site : http://download.eclipse.org/technology/m2e/releases/
* https://dl.bintray.com/gayanper/p2/gencode-m2e-connector/nightly/m2eclipse-tycho dev update site : http://repo1.maven.org/maven2/.m2e/connectors/m2eclipse-tycho/0.7.0/N/0.7.0.201309291400/

