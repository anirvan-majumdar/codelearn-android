Android Tutorial
================

### Step 1 &mdash; A Basic Overview of the Application

-------

This is a simple project to take a newcomer to Android through the chores in a simple and *realistic* manner.

So what all will we deal with in this application?

* Creating a new Android project.
* A brief look around the project structure.  
* Getting started with a basic UI framework for a login screen.
* Next up, create the UI components for a list (which would eventually show tweets).
* Selecting a tweet to see more details about it.

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
* The new Android project wizard starts with the basic details screen

    <img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-18%20at%2012.11.33%20AM.png" 
    style="width: 60%; height: auto; box-shadow: 1px 1px 1px #c2c2c2" alt="Android New Project Wizard">

* Give a suitable name to the project. For the other fields, you can simply work with the defaults. Just to give you quick 
understanding, the SDK options mean the following &mdash;
    * *Minimum Required SDK* &ndash the minimum Android SDK version that your app can support.
    * *Target SDK* &ndash; the Android SDK for which you are building your app. 
    * *Compile with* &ndash; the Android SDK libraries that should be used for your code. 
    * All these SDK options sure seem confusing, but the best way to understand them is to think, that you're building
    your app to use the latest Android features, and at the same time, letting Android know that your app should also work
    for older versions. So any unsupported new feature should be gracefully handled/hidden from users of older Android versions.

* For the rest of screens in the wizard, I'd recommend you to use the defaults. For the **Create Activity** screen, remember to
choose the *Blank Activity*.

### The project structure

A new Android project consists of a bunch of folders and files. However, for our purposes, we need to concentrate on only a smaller subset of them.

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-09%20at%2011.37.01%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Android project structure">

* `src` &ndash; contains all the Java source files.
* `res` &ndash; XML files and image files related to the UI. Like layout files, application constants.
* `AndroidManifest.xml` &ndash; can be considered as a project definition file. 
* `libs` &ndash; any external libraries that are to be included in the binary form (JAR files) are added here.

At this very point, let's take this basic looking app for a spin. To do so, right click on your project, go to 
*Run As*, and then select *Android Application*.
<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-18%20at%2012.27.46%20AM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Run Android Project">

Eclipse will show a prompt asking you whether you *wish to create a new Android Virtual Device*? Selecting *Yes* would bring up
2 new windows. One titled *Android Device Chooser*, and the other titled *Android Device Manager*. For now, just close the *Android
Device Chooser* window. We'll come to it later.
<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-18%20at%2012.35.23%20AM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Android Device Manager">

Before progressing, if you would like to learn a bit more about Android Virtual Devices (AVD), I'd strongly urge you to 
visit the [topic covered in detail](http://www.codelearn.com) in our theoretical course.

Getting back, click on *New*, and enter the information for your AVD. Give it a *name*, and to keep things simple, in the
*Device* seciton, simply select one of the preset devices, like *Nexus XX*. This way you can avoid filling a bunch of other
mostly, non-essential (to this course) data.

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-18%20at%2012.41.15%20AM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Android Virtual Device">

Once you click on *Ok*, this new AVD will be listed in the *Virtual Device Manager* window. Select the AVD you just created 
and click on the *Start* button. Another dialog &mdash; Launch Options &mdash; will show up, let the defaults stay, and click
on *Launch*. 
Now sit back and relax. An emulator will launch and slowly load all the necessary data to become operational. This process can
take quite some time, so let things go on till the time you see that your AVD screen resembles that of an actual phone.
<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-18%20at%2012.48.51%20AM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Android Virtual Device in Action">

Take some time to play around with the device. You can use the mouse and also the keyboard. But its more intuitive to use the mouse.
Be forewarned, the experience of using the AVD can be a bit disappointing if you've used a real device. Don't lose heart
though. The AVD will function just fine for our developmental needs.

Now that you've launched the AVD, let's go back to Eclipse and continue. Firstly, close the *Android Device Manager* window. Next, 
again right click on your project and *Run as* an *Android Application*. At this point, you'll notice the *Console* in Eclipse
comes alive with activity. You can follow the lines getting printed to understand the process of how your app gets deployed.

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-18%20at%2012.56.55%20AM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Android console">

Now if you go back to your AVD, you'll see a rather pale looking app screen, with the text *Hello World* written on it. 
Quite unimpressive, I'm sure. However, as we progress, we will be putting in things that will make for a pretty good looking app.


### The Login Screen 

We will create a basic login screen. Our purpose for now will be to familiarise ourselves with
some basics of UI handling, and how to tie together the interaction between UI elements and
the `Activity` class.

To start with, let's remove that not-so-good-looking default header that is appearing at the top of
your screen. To do this, open your `AndroidManifest.xml` file, and add the following to the `activity` 
tag corresponding to your `MainActivty` &mdash; `android:theme="@android:style/Theme.NoTitleBar"`. 

*Styling*/*Theming* your app can be done in many ways. One of the ways is to apply pre-defined styles in the Manifest file, like we
just did. Other ways to accomplish it is to add style declarations in the `styles.xml` file placed in the `/res/values` folder. Of 
course, you can also achieve styling in a programmatic manner, but from performance and separation-of-concerns perspective, that is
generally frowned upon.

Now let's open the **layout XML** file for our activity class. If you chose the default setting to create your app, you'll find
the file `activity_main.xml` located in the `/res/layout` folder. The name of your layout file might be different depending on
what you chose to name it initially, but it will always be located within this folder.

By default, you'll find a `RelativeLayout` element, with a `TextView` element contained in it. At this point, it might be a good
idea for you to go brush up your knowledge about [Layouts](http://codelearn.org) and the [basic views](http://codelearn.org), like 
&ndash; text, edit, image and button.

The basic screen layout that we will be creating would look something like this &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-21%20at%206.50.47%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Android console">

As an Android developer, you should keep in mind that there are usually more than one way of creating the same UI. A bit like
the way it is with HTML. However, amongst the multiple ways, the *better* way is usually the one which is *less verbose* and is 
*less redundant*. While these guidelines can be applied to HTML as well, there are some Android specific design factors you 
need to bear in mind &mdash;

* Minimise the dependency of using absolute measurements like `dp` to specify dimensions. The more you use it, the more
are the chances of your app to render differently on different screen sizes.
* `LinearLayout`s generally render faster than `RelativeLayout`s. This is because Android needs to do additional computation to
figure out all the dependencies associated with a `RelativeLayout`. (Although you'll certainly encounter many situations where
a `RelativeLayout` is the only way out.)

Keeping these points in mind, our approach to designing the app would resemble the following &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-21%20at%206.59.48%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Android console">

The last remaining part to completing our **Login Screen** is to handle the transition of the screen, when the user clicks
on the `Login` button. As mentioned before, we will *not* be adding any validation or processing at the code level to handle
our Login screen's interaction. We simply take the user to the next screen to display the list of tweets.

To do this, we will register a [`ClickListener`](http://codelearn.org) with the login button. In your `MainActivity` class, you'll need to 
obtain a reference to the button you defined in the layout file. This is where the `android:id` attribute assigned to your
button in the layout XML file will come in handy. The basic code to otain the reference is as follows &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-21%20at%207.16.40%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Button reference code">

Once you've got the reference, you need to assign a *callback* action to it. A *callback* is a piece of code that you
want to execute when the Login button is pressed. In Android, we define callback actions using [anonymous classes](http://codelearn.org). For 
our Login button, we set the `OnClickListener` by creating an instance of `View.OnClickListener`. As part of defining that class,
we will need to insert our logic of showing the next screen in the `onClick` method. 

The logic of showing the next screen involves creating an [`Intent`](http://codelearn.org), and passing an instance of the current 
activity and the class reference of the next `Activity` class. 

**NOTE:** Remember that the `this` reference within your `ClickListener` refers to the anonymous inner class and *not* the current
`Activity` class. To get the instance to that, you'll need to use &ndash `MainActivity.this`.

Lastly, invoke the `startActivty` method, passing in the `intent` instance, to show the next `Activty` class. That's it.

**NOTE**: Remember to add an `<activity>` entry in the `AndroidManifest.xml` file for the new `Activity class.

The click listener code should look something like this &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-21%20at%207.31.15%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="On Click Listener Code">


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







