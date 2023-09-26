# These are my solutions to the course at  -  https://java-programming.mooc.fi/
    I haven't solved every exercise.
    I won't be commiting exercises I haven't solved, so their files will be missing.
    You can download the clean exercise files from the site.
    You can find all the exercises and learning material there too.
To see my solutions:
1. Go inside the corresponding "Half" folder
2. Find the file with the part you're looking for (parts 1 to 14)
3. Find the exercise number and name that comes after "Part" (example  -  part08-Part08_**01.Cubes**)
4. Go to src -> main -> java -> solutions will be here but proceed inside packages if necessary
### Starting from part 13 the course starts using javaFX. You'll need to follow the instructions below if you want my solutions to run in IntelliJ.
1. Download javaFX SDK 17.0.8 from https://gluonhq.com/products/javafx/
2. Unpack somewhere, this is the path I used: C:\Users\User\.jdks
3. Go into project structure -> Libraries -> New Project Library -> Java 
4. Paste **your** path to lib, here's mine: C:\Users\User\.jdks\javafx-sdk-17.0.8\lib
5. Go into Run -> Edit Configuration -> Add VM options
6. Paste this command with **your** path to lib, here's what my command looks like: --module-path "C:\Users\User\.jdks\javafx-sdk-17.0.8\lib" --add-modules javafx.controls,javafx.fxml
7. Now it should run if you did everything correctly.