# A sample Calculator as a WebService with SpringBoot
``` sh
## Run the gradle wrapper to list the available tasks
./gradlew tasks
### This will list out the available tasks, of which one of them is named bootRun

## task bootRun will run the SpringBoot Application
./gradlew bootRun

## Now to test the app in the terminal, run
curl http://localhost:8080/calculate\?operand1\=2\&operator\=add\&operand2\=2

## And in the browser with the url
http://localhost:8080/calculate?operand1=2&operator=add&operand2=2
```
> Replace the values of operand1, operand2 with any number and the operator with possible values
of 'add', 'sub', 'mul', 'div'
