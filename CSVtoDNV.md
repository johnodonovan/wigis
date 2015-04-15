# Convert a CSV file to a DNV file #

This page will explain the correct structure of a .csv file to be uploaded to the application.

## CSV structure ##
The example below is csv file comporting two categories of nodes and edges betweens theses nodes. Mode detail about the structure below the example.
```
@NODES 	@COLOR[1.0,1.0,0] @SIZE[2.0]
id, label
1, 	Linked
2, 	Sync
3, 	Global Illumination for Fun and Profit
4,     Many Authored Paper for Profit and Fun
@NODES 	@COLOR[1.0,0,1.0] @SIZE[1.0]
id, 	label
101, 	Albert Lazlo Barabasi
102, 	Stephen Strogratz
103, 	Malcolm Gladwell
104, 	Joe Bloggs
105, 	Mary Bloggs
106, 	Susie Bloggs
@EDGES 	
id,	id
1, 	101
1, 	104
2, 	102
2, 	104
3, 	101
3, 	105
4, 	104
3, 	104
104,	103
105,	104
```

### Tags ###
You probably noticed that there is a special syntax to write this type of .csv file. First of all, lets focus on the nodes.

#### Nodes ####
  * In order to create nodes, you will have to specify that what you list is a node. To do this, start with the following line :
```
@NODES 	@COLOR[1.0,1.0,0] @SIZE[2.0]
```
The above line, is made of three parts :
  1. @NODES : specify that you want nodes
  1. @COLOR[1.0,1.0,0] : define the color of all nodes that will be listed
  1. @SIZE[2.0] : define the size of all listed nodes

  * The second line is a reminder for users about the structure convention
```
id, label
```
This just tells the users how they have to order the informations, the first row will always be the node id and the second will always its label.

  * Now the nodes listing
```
1, 	Linked
2, 	Sync
3, 	Global Illumination for Fun and Profit
4,     Many Authored Paper for Profit and Fun
```

  * We just now created four new nodes with for each one a unique id and a label

_As explained above, this example provide two groups on nodes. You can declare as many groups as you want with for each a different size and color._

#### Edges ####
  * Let's see the edge structure, it is similar to the Node structure but even simpler. To specify that you are listing edges, please add the following line :
```
@EDGES
```
  * Again as a reminder, we put the edge structure listing which is the following :
```
id, id
```
  * The first id correspond to the id of the departure node or 'from' node while the second id correspond to the arrival node or 'to' node.
  * Let's list our edges
```
1, 	101
1, 	104
2, 	102
2, 	104
3, 	101
3, 	105
4, 	104
3, 	104
104,	103
105,	104
```
  * You now create a readable .csv file for our application, let's see now how to upload and visualize it.

## Upload ##
  * An uploader as been implemented in order to allow users to visualize their own data. The uploader can be found at the following URL : http://eire.mat.ucsb.edu:8080/WiGi/upload.faces
  * You might now visualize the following :
<img src='http://wigis.googlecode.com/files/upload.png' alt='upload' />
  * Simply clic the '+add' button and select your .csv file
  * The uploader will automatically upload your .csv file onto our server and when you are ready to visualize it, clic the 'I'm feeling visual' button. According to your uploaded file, it might take time to convert the .csv file to a .DNV but once it is done, you will automatically be redirect to the WiGis home page and your graph will be loaded as follow :
<img src='http://wigis.googlecode.com/files/upload_done.png' alt='upload done' />