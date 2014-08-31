#Create a new repository on the command line

    touch README.md
    git init
    git add README.md
    git commit -m "add empty README file"
    git remote add origin git@github.com:UniAJC-IngeSoft-III/singleton-example.git
    git push -u origin master
    
#Push an existing repository from the command line

    git remote add origin git@github.com:UniAJC-IngeSoft-III/mvc-example.git
    git push -u origin master

#Base project

As the teacher said in the last class, patterns is about copying 
good manners of programming, i found a good example in web page 
[Model-View-Controller (MVC) Structure](http://www.leepoint.net/notes-java/GUI/structure/40mvc.html) 
and based on this as a good starting point, I will continue the development of the full calculator.

    El problema no está en copiar ideas o inventos
    ajenos, sino en robar el espíritu de su gestor, 
    haciéndolos parecer como propios.
                                           Anonimo


#Clone, Build and test

    git clone git@github.com:UniAJC-IngeSoft-III/singleton-example.git
    cd mvc-example
    mvn clean compile assembly:single
    java -jar target/patron-singleton-1.0-jar-with-dependencies.jar
    
  