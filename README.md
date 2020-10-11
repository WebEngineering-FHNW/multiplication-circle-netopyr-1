# Multiplication Circle
Visualization of multiplication tables

Goals of this assignment:
* Repeat the concepts of writing a web-app with the MVC pattern
* Recap the usage of unit- and e2e-tests

## Assignment 1
Implement the UI of the multiplication table.
* The method getIndex() in the controller is currently not called, when the index-page is requested. 
  How can you fix this?
* Take a look at the template index.ftlh. 
  Which data needs to be provided? 
  Make sure the controller sets the missing data.
* Calculate the lines in the controller.
  (To make your life easier you can start with a fixed multiplier of 2.)
* Show the lines on the screen.
  (Check out the SVG-element <line>.)

## Assignment 2
Write tests to ensure the correct behavior.
* When the controller is called with negative input parameters, it should behave nicely.
  What would be an appropriate behavior?
  Write unit-tests to ensure the behavior you defined.
* Write an e2e-Test that sets the input parameters and checks if the number of <line>-elements is equal to the provided segment count.
  Enhance the page object as needed.
