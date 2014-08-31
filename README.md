#Create a new repository on the command line

    touch README.md
    git init
    git add README.md
    git commit -m "add empty README file"
    git remote add origin git@github.com:UniAJC-IngeSoft-III/singleton-example.git
    git push -u origin master
    
#Push an existing repository from the command line

    git remote add origin git@github.com:UniAJC-IngeSoft-III/singleton-example.git
    git push -u origin master

#Base project

Notes in class, test Singleton pattern in a game of Martians

    Good artists copy, great artists steal.
                              Pablo Picasso

#Clone, Build and test

    git clone git@github.com:UniAJC-IngeSoft-III/singleton-example.git
    cd mvc-example
    mvn clean compile assembly:single
    java -jar target/patron-singleton-1.0-jar-with-dependencies.jar
    
  