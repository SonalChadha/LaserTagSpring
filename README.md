To run this project, make sure to have it downloaded and saved in a project directory on your local sytem. Then, 
install JDK 8 from https://www.oracle.com/java/technologies/downloads/ (scroll down in the link to find the appropriate installer). Note that you will 
need to create an Oracle account if you don't have one already to install this JDK on your system. Once the Java JDK 8 download is complete, run the exe for
installing JDK and follow all steps.
After this installation is complete, you should be able to get the versions of Java after typing 
'java -version' in your command prompt (if this is not the case,
configure environment path variables). Now, add a new variable with name 'JAVA_HOME' to your environment user variables and set its value to the path of the installed jdk folder in Java folder (e.g. C:\Program Files\Java\jdk1.8.0_321 for a Windows user). If this variable 'JAVA_HOME' already exists in your environment user variables, simply edit it to contain the proper path of the jdk folder. Type 'echo %JAVA_HOME%' (for Windows user) or 'echo $JAVA_HOME' (for Mac user) to confirm the path.

Now, install the appropriate Apache Maven for your machine from https://maven.apache.org/download.cgi. 
After this installation is complete, extract the zip or tar.gz archive and set the path of the bin folder of this extracted folder in environment path variables.
Check that path has been set correctly by typing 'mvn -v' in command prompt, which should return the version of Apache Maven installed (e.g. 3.8.5). 
Open up command prompt again and navigate to the project directory. Type 'mvn spring-boot run' to run the project. 
