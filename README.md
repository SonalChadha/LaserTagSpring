To run this project, make sure to have it downloaded and saved in a project directory on your local sytem. Then, 
install JDK 8 from https://www.oracle.com/java/technologies/downloads/ (scroll down to find the appropriate installer). Note that you will need to create an Oracle
account if you don't have one already to install this JDK on your system. Once the Java JDK 8 download is complete, run the exe for installing JDK and follow all steps.
After this installation is complete, you should be able to get the versions of Java after typing 'java -version' in your command prompt (if this is not the case,
configure environment path variables). 

Now, install the appropriate Apache Maven for your machine from https://maven.apache.org/download.cgi. 
After this installation is complete, extract the zip or tar.gz archive and set the path of the bin folder of this extracted folder in environment path variables.
Check that path has been set correctly by typing 'mvn -v' in command prompt, which should return the version of Apache Maven installed (e.g. 3.8.5). 
Open up command prompt again and navigate to the project directory. Type 'mvn spring-boot run' to run the project. 
