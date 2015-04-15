# Download and Setup Instructions - For users #
For those who just want to install and run the project, here are the steps:

# Prerequisites #
## JBoss 5.1 ##
The WiGi project runs on a JBoss Server (we are currently using version 5.1.)  JBoss is available at http://www.jboss.org/jbossas/downloads/.
For more information on how to install a JBoss Server, please have a look at the following resource: http://docs.jboss.org/jbossas/admindevel326/html/ch01.html.

# Setup Instructions #
Once JBoss is installed, follow the remaining instructions here to install WiGi.

## Download WiGi ##
Use the following link to download the project as a .war file.
http://code.google.com/p/wigis/downloads/detail?name=WiGi.war&can=2&q=#makechanges

## Graphs ##
A folder containing several graphs is available in our 'Downloads' section at the following link http://code.google.com/p/wigis/downloads/detail?name=graphs.zip&can=2&q=#makechanges. This file contains three graphs but if you want more informations about the structure of a basic .dnv file, please have a look to our 'data' page available at : [Data](Data.md). In order to respect the path set up in the application, please unzip the 'graphs' folder to the root of your main hard drive (i.e : C:\ for windows).
You can also modify the path into the file called 'Settings.java' located in WiGi-core > src > net.wigis.settings as shown below.

<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image15.png' alt='Tutorial-Image15' />
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image16.png' alt='Tutorial-Image16' />

## Deploy the Application ##
To run the application, you need to move the WiGi.war file into your server to a specific location. To do this, locate your JBoss Server home directory, and go to the following location : JBOSS\_HOME/server/default/deploy/ copy the WiGi.war file and start the JBoss server instance.

## Access the Application ##
When the server starts up, navigate to following URL in any major browser, as shown in the screenshot below : http://localhost:8080/WiGi/wigi/WiGiViewerPanel.faces.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image14.png' alt='Tutorial-Image14' />

## Complementary Informations ##
_The system has been tested in recent versions of Chrome, Safari and Firefox. In some browsers, a pop-up box may appear to say that the system is not supported._