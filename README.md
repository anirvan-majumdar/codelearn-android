Android Tutorial
================

### Step 1 &mdash; A Basic Overview of the Application

-------

This is a simple project to take a newcomer to Android through the chores in a simple and *realistic* manner.

So what all will we deal with in this application?

* Creating a new Android project.
* A brief look around the project structure.  
* Start with a splash screen.
* Create the basic UI framework for a login screen.
* Next up, create the UI components for a list (which would eventually show tweets).

### Creating a new project

* Check that your system is ready for development  
    * Java JDK installed &mdash; version 1.6+ preferred.
    * Android SDK installed?
    * Eclipse downloaded &mdash; version 4.2.0+ preferred.
    * Eclipse ADT (Android Development Toolkit) plugin installed?
* If you've setup your Eclipse properly, you should see the following icons in your toolbar when you launch it

  ![eclipse toolbar](https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-09%20at%2010.05.06%20PM.png "Android toolbar")  
* To create a new project, go to `File -> New -> Android Application Project`. This is how things should look &mdash;

  <img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-09%20at%2010.13.49%20PM.png" 
    style="width: 60%; height: auto; box-shadow: 1px 1px 1px #c2c2c2" alt="Android menu option">
* If you're not seeing the option for an Android application, select `Project...`, and see whether you've got a category under Android in the new project wizard?

  <img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-09%20at%2010.17.59%20PM.png" 
    style="width: 60%; height: auto; box-shadow: 1px 1px 1px #c2c2c2" alt="Android New Project">
* Still no option for Android? You'd better refer to our [elaborate notes](http://codelearn.org) to see if you've missed out on something.
* Walkthrough of what all to configure in a new project.

### The project structure

A new Android project consists of a bunch of folders and files. However, for our purposes, we need to concentrate on only a smaller subset of them.

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-09%20at%2011.37.01%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Android project structure">

* `src` &ndash; contains all the Java source files.
* `res` &ndash; XML files and image files related to the UI. Like layout files, application constants.
* `AndroidManifest.xml` &ndash; can be considered as a project definition file. 
* `libs` &ndash; any external libraries that are to be included in the binary form (JAR files) are added here.

### Creating a Splash screen

The purpose of a splash screen, besides sometimes being an irritating interruption, is to 
provide a window of time in which to showcase some basic branding information. You should bear
in mind that you don't stretch the patience of your app's user by going stretching the time
too long. As a rule of thumb, something like 2-3 seconds should be fine.  
    Another important role played by the splash screen is to provide an opportunity for you to
perform some background tasks &mdash; like verifying user credentials, syncing data with server, etc.  
    For our app, this isn't a concern. Here's what we'll do for creating a basic splash screen &mdash;

* Creating a new layout file.
* Explain layout file. Source XML code and the *Graphical Layout* section.
* Introduce `RelativeLayout` and its attributes.
* Introduce `TextView` and its attributes.
* Linking the layout file to the corresponding `Activity` class.
* Short introduction about the `Activity` class.
* Talk about UI thread, and **never** blocking it.
* Introduce the `Handler` class to perform asynchronous tasks.
* Basic introduction about an `Intent`, and how to go to the next screen.

### The Login Screen 

We will create a basic login screen. Our purpose for now will be to familiarise ourselves with
some basics of UI handling, and how to tie together the interaction between UI elements and
the `Activity` class.

* Create another `RelativeLayout`.
* Explain the layout &mdash; top bar, `EditView`, `Button`
* Complete the interaction with `OnClickListeners`. 
* Capturing the values entered by the user.

### First approach to a List-based Screen

As has been the approach so far, we will first create a basic list view to familiarise 
ourselves with the basics of how to handle the UI. There are some associated concepts 
to understand about the role of the corresponding `Activity` class too.

* Create a `ListView` layout.
* Introduce the concept of creating a layout file for each list item.
* From a basic list item layout, create a somewhat more complex layout.
* Introduce a `ListActivity`.
* Talk about the `Adapter` class and its basic role.
* Populate the adapter class with some default values. Show how it renders.
* Make a point about reusable views, and the need to avoid a memory leak.







