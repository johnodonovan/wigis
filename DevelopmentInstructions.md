# Download and Setup Instructions - For developers #
The following steps explain the development environment setup, including prerequisites to run WiGi, and the import process for Eclipse IDE.

# Prerequisites #
## Java JDK 1.6.x ##
In order to run the WiGi toolkit, you will need to have Java JDK version 1.6.x installed on your computer.  Java JDK is available at http://www.oracle.com/technetwork/java/javase/downloads/index.html.

## Eclipse IDE ##
The dev team suggest using Eclipse to edit code and manage an integrated JBoss server. It is available at http://www.eclipse.org/downloads/.  Of course, other IDEs or the command line will also work.

## JBoss 5.1 ##
The WiGi project need to be run on a JBoss server using version 5.1. JBoss is available at http://www.jboss.org/jbossas/downloads/.   Please be careful to select the appropriate download for your platform (Win / Mac / Linux) and the appropriate processor version (32/64 bit).

## Jboss Tools ##
You will also need to install JBoss Tools into Eclipse. You can download it at  http://www.jboss.org/tools/download.  You can also point Eclipse IDE at this link by navigating to Help > Install New Software in the Eclipse horizontal menu bar.

# Setup Instructions #
For those of you who are not familiar with Eclipse and JBoss you can find more informations on how to add a JBoss server into Eclipse here : http://ist.berkeley.edu/as-ag/tools/howto/jboss-eclipse.html.

## Get WiGi and WiGi-core projects ##
WiGi and WiGi-core are two Eclipse Java Web projects. Instructions for checking out the latest versions can be found under the "source:" tab in the horizontal menu bar above. The system front end is is coded using a JSF framework, and these components are contained in the WiGi Eclipse project. WiGis project relies on the core libraries (such as layout, clustering, analysis, statistics and other algorithms) which are contained in WiGi-core.

## Add WiGi and WiGi-core to Eclipse ##
  1. In Eclipse, go to 'File'>'Import'
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image1.png' alt='Tutorial-Image1' />

  1. Open the 'General' tab and select 'Existing Projects into Workspace'
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image2.png' alt='Tutorial-Image2' />

  1. Hit the 'Next button' and a new windows will appear (see below). Click on the 'Browse' button in the upper right corner.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image3.png' alt='Tutorial-Image3' />

  1. This window will ask you to select the directory containing both projects.  Locate it, select it and press 'Open'. You might come back to the previous windows and find the following.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image4.png' alt='Tutorial-Image4' />

  1. Before pressing the 'Finish' button, make sure that both WiGi et WiGi-core projects are checked and then hit the 'Finish' button. You will now find both projects in your Eclipse Package Explorer as displayed below.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image5.png' alt='Tutorial-Image5' />

At this point, you may encounter some build-path related errors (symbolized by a red cross on the project) but these errors can be corrected with the following steps.

## Configure WiGi-core ##
This phase explains how to configure the WiGi-core project.

  1. Select the 'WiGi-core' project in the Eclipse 'Package Explorer' view, right click on it and select 'Properties'.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image6.png' alt='Tutorial-Image6' />

  1. Select 'Targeted Runtimes' on the left column and make sure that the 'Targeted Runtime' that is selected is the appropriate JBoss server. _If you don't see your JBoss server in the list, your might have done something wrong during the JBoss import to Eclipse._  This can be corrected by navigating to the servers tab in the Eclipse view menu.  Right click on the server view and select "add new server".
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image7.png' alt='Tutorial-Image7' />

  1. Depending on your OS configuration, you may have to specify which JRE to use. To do this, edit the 'Java Build Path',  click on the 'Libraries' tab at the top of the window. You might have a list of libraries used by the project plus one called 'JRE System Library'.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image9.png' alt='Tutorial-Image9' />

The setup described here was done on a Mac, so the JRE was automatically detected.  On other platforms (e.g: Linux)  you might have to manually locate it.  To do this, select the JRE System Library' and click on the 'Edit' button on the right side.

<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image10.png' alt='Tutorial-Image10' />

  1. In this new window, you will specify your JRE and click the 'Finish' button. Now WiGi-core should be correctly configured and the build path errors should be gone.

## Configure WiGi ##
Now that WiGi-core is configured, let's have a look at the WiGi project configuration.

  1. Same action, select your WiGi project in you 'Package Explorer', right click on it and select 'Properties'. Configure the 'Targeted Runtimes' like we did for WiGi-core by selecting your JBoss server.

  1. As the WiGi project is working with WiGi-core we need to specify that it refers to WiGi-core. For this, click on 'Project References' tab on the left column in Eclipse properties.  Make sure that WiGi-core project is selected, as shown below.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image8.png' alt='Tutorial-Image8' />

  1. Same last step as before:  Specify the JRE to use.   According to you OS, you might have to specify which JRE system to use. For this, edit the 'Java Build Path' link on the left column and click on the 'Libraries' tab at the top of the window. You might have a list of libraries used by the project plus one called 'JRE System Library'.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image9.png' alt='Tutorial-Image9' />

This tutorial refers specifically to a Mac so the JRE was automatically detected.  For other platforms (e.g: some versions of  Linux, you may need to manually specify the location). To do this, simply select the library called 'JRE System Library' and click on the 'Edit' button on the right side.

<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image10.png' alt='Tutorial-Image10' />

  1. In this new window, you will specify your JRE and click the 'Finish' button. Now WiGi should be correctly configured.

## Graphs ##
A folder containing several graphs is available in our 'Downloads' section at the following link http://code.google.com/p/wigis/downloads/detail?name=graphs.zip&can=2&q=#makechanges. This file contains three graphs but if you want more informations about the structure of a basic .dnv file, please have a look to our 'data' page available at : [Data](Data.md) .In order to respect the path set up in the application, please unzip the 'graphs' folder to the root of your main hard drive (i.e : C:\ for windows). You can also modify the path into the file called 'Settings.java' located in WiGi-core > src > net.wigis.settings as shown below.

<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image15.png' alt='Tutorial-Image15' />
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image16.png' alt='Tutorial-Image16' />


## Add the project to the server ##
  1. Everything is now setup and configured, you just have to add the WiGi project to the server, for so right click on your JBoss server (you'll find it by clicking on the 'Server' tab at the bottom of Eclipse). Right click on it and select 'Add and Remove...'.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image11.png' alt='Tutorial-Image11' />

  1. A new window will pop up at this point. All projects on the left side are the available projects in Eclipse, while the ones on the right are the projects on the server. You will want to add WiGi onto the server, for this select WiGi in the left column and click the 'Add' button. The project will now move from the left to the right as shown here.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image12.png' alt='Tutorial-Image12' />

## Start the server and access the application ##
The last step is to start the JBoss server. To do this, right click on the server and select the 'Start' option.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image13.png' alt='Tutorial-Image13' />

Once the server has started, you can access the application via the following link, and you should see the wigi application as in the image below : http://localhost:8080/WiGi/wigi/WiGiViewerPanel.faces.
<img src='http://wigis.googlecode.com/files/Tutorial-Developers-image14.png' alt='Tutorial-Image14' />
## Complementary Informations ##
_The system has been tested in recent versions of Chrome, Safari and Firefox. In some browsers, a pop-up box may appear to say that the system is not supported._