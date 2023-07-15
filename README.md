# Ticket Tracker Application
SpringMVC Ticket Tracker Application

# This is a three part guide to run this application

### 1. Get the source code
On your local machine make a directory `<directory-name>` and navigate into that

Run `git clone https://github.com/SakshamGairola/Ticket-Tracker-Application.git` to get the source code.


### 2. Setting up database for application to fetch and store data
It is recommended to use MySQL (version 8.0) for this application

Make a database named as `tickets` (this can be changed later in tutorial), rest will be takencare by hibernate.

### 2.1 Change database Name or using other database
You can also use any other relational database of your choice for this you need to change these four properties
    
    jdbc.driverClassName=<database-driver>
    jdbc.url=<database-connection-url>/database-name
    jdbc.user=<database-username>
    jdbc.pass=<database-password>
You can name your database whatever you can just change `database-name` in `jdbc.url`

### 3. Setting up run time enviroment

It is recommend to run this application using Intellij Idea as of now. I will update thsi tutorial on independent deployment soon.

Open project in Inteiilij Idea and follow this tutorail for configuration of [Smart Tomacat](https://github.com/zengkid/SmartTomcat/blob/master/README.md) plugin.

Apache Tomcat Version 9.0 is recommended and can be downloded from [here](https://tomcat.apache.org/download-90.cgi) jsut extract in a directory somewhere for plugin to use.

Application will run on `localhost:8080`