Android Tutorial
================

## Part 1 &mdash; A Basic Overview of the Application

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
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Layout overview">

You can checkout the source of the XML in detail [here](https://github.com/anirvan-majumdar/codelearn-android/blob/426c12b7787baf7e26a00dfeef3e4f7da02ff19c/res/layout/activity_main.xml). The basic structure for the layout in XML is as follows &mdash;


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

**NOTE**: Remember to add an `<activity>` entry in the `AndroidManifest.xml` file for the new `Activity` class.

The click listener code should look something like this &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-21%20at%207.31.15%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="On Click Listener Code">


### Building Out the Tweets List

As has been the approach so far, we will first create a basic list view to familiarise 
ourselves with the basics of how to handle the UI. 

For this screen, our approach towards designing the UI would be as follows &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-22%20at%209.17.17%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="List View overview">

Now what's that *No Data Text View*, you ask? Well, it is one of those nice design guidelines to follow. You see,
there might be times when your user comes to this screen, and there may be no tweets to show. So in general, it 
is considered a *best-practice* to provide a visual cue to the user about what's happening. Otherwise, the user gets
to see a blank screen and feel lost. Not good!

Let's proceed to making this screen. First up, we'll need to have a layout XML file. Go to the `layout` folder, and
create a new `Android XML Layout File` by going to *File > New > Android XML File*. Name this file `activity_tweet.xml`.
You'll see that the new file wizard has selected a `LinearLayout` for you by default. Let's stick with that, since it 
works well for our purposes.

Once the file has been created, go ahead and add the first part &ndash; `TextView` &ndash; to the file. Here's how your
snippet should look. 

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-22%20at%209.25.03%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Tweet List TextView">

The attributes used for this `TextView` are fairly generic. We're making it wrap the content along with some padding. 
Setting the text and its styling components. And finally, to align the `TextView` in the center, we're setting the 
`layout_gravity` attribute. 

**TIP**: When you want to align child elements of a particular view, you use the attribute `gravity`. However, when 
you want to override the parent's `gravity` setting at a child element level, you need to use `layout_gravity`.

Next up, let's define the `ListView` for our layout &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screen%20Shot%202013-10-22%20at%209.31.07%20PM.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Tweet List ListView">

This might look like a rather simple and small piece of code, but do not be misled by this. Right now, we are going
to make use of the simplest form of a `ListView`. As the requirements grow complex, this piece of code would grow
signficantly. 

The most important attribute to understand here is the `id` attribute. We are making use of a special ID which is
provided by the Android SDK especially for `ListView`. This special ID provides easy access to associated `Activity`
class to this particular `ListView`. However, you are by no means limited to using the special ID and can very well
go ahead and assign your own ID. For the sake of this course, we will stick to the special ID though.

--------------

Feel free to refer the concept lessons about the [`ListView`](http://codelearn.org). It'll only help you in cruising
through this part &ndash; trust me on that!

--------------

If you go ahead and launch the app on the emulator or the device, and navigate to the tweets list screen, all you
will get to see is an empty screen with the *No Data text view* showing up. Alright, so where did that list go? Well,
it's right there. It's just that we've not set any data to the list view, so nothing shows up. 

**List View &ndash; A Short Explanation** &mdash; the way a `ListView` works is that it renders a collection of items,
which are referred to as list view *items* or *rows*. Each row item should itself be defined within a separate
layout file. At the same time, the data to be displayed for every row item needs to be set explicitly by the backing 
`Activity` class. The `Activity` class in-turn manages to do this by associating a `List` instance with the `ListView`. 
This is done with the help of an `Adapter` class. 

All this might sound a bit loopy right now, but just hang in there. Things will be crystal clear within the next few tasks
that we undertake. But before that, take a moment to understand the relationship between the layout file's `ListView` and 
the `Adapter` and `ArrayList` (or any other `List` implementation) class' relationship with each other.

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-13%2023.19.48.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="ListView, Adapter, List relationship">

Alright, so let's bring our focus onto the backing `Activity` class for our tweets list. At the end of our previous section, 
you might have created the `Activty` class by extending the `android.app.Activity` class. Fair enough. However, to 
make things simpler for working with lists, the Android SDK provides a special variant of the `Activity` class called
the `ListActivity` class. So go ahead and change the super class of the `TweetList` class to a `ListActivity`.

Next up, as we saw in the relationship diagram, let's create a simple `ArrayList` and populate it with some simple `String`
values.

Before we can associate this `List` of strings with the `ListView`, we need to have an adapter in place. The purpose of
the adapter, as shown in the diagram, is to associate each value in the `List` to each row in the `ListView`. However, 
we need to define a layout view for each of the rows. Go ahead and create a simple layout file using a `LinearLayout` 
which consists a single `TextView`. Name this layout file as `row_tweets.xml`. The content of this file should look
something like this &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-13%2023.27.29.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="List Row Item Layout">

With the layout file for the list row item ready, we are good to continue with defining our `Adapter` for the `ListView`.
Defining an `Adapter` is quite a simple task actually. All you need to do is extend the `ListAdapter` class, define a 
constructor (which accepts the `ArrayList` instance), and then define the logic of rendering each row for the `ListView`.

-------------

Just in case you haven't, a thorough, conceptual writeup is available [here](http://codelearn.org) for reference.  

-------------

**TIP**: It is generally a good idea to keep the definition of the `Adapter` class local to your `ListActivity` class. However, if
you have an app where you need to render the same kind of list in different activity classes, then you should define a separate
adapter class.

Here's the code snippet showing how to define an `Adapter` class &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-13%2023.38.47.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Adapter class definition">

Let's take a closer look at this `Adapter` class. We started off by extending the `ArrayAdapter` class. There are quite
a few other adapter classes provided by the Android SDK. An `ArrayAdapter` is useful for creating a list from a simple list of objects. 
More complex Adapters provide an easy way to load the data from the embedded SQLite database. While we won't be covering those here, 
you should certainly take the time out to go through our [concept lessons on `Adapters`](http://codelearn.org).  

The `LayoutInflater` instance is required for expanding the layout XML file for each row.  

The `getView(...)` method is the one invoked by the Android platform for rendering every single row that is being shown. So, if your
device screen can accommodate 5 rows at a time, this method will first get invoked 5 times. As you scroll down, for every single new row, this
method will be invoked again. The row that moves out of view from the top, will be replaced by a new one at the bottom. Effectively, 
the whole row layout file will be inflated that many times and each of the row layout elements will be set that many times. As you might
have guessed, this can become quite an expensive way of rendering lists, and is often the source of many memory leaks in Android apps. To 
prevent that, we should always check whether we can reuse an existing reference to the row's layout view, and then set the values for
each of the elements contained within the row's view. 

**TIP** &mdash; Displaying a `ListView` can often lead to memory leaks. The best way to avoid such a thing is to reuse the references
to each of the row's layout elements as much as is possible.

Once the adapter's code has been written, if we now deploy the code to the emulator/device, and navigate to the `ListView` screen,
we will see our simple list rendered as such &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/list-view.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Basic List View">  

If you've gotten this far, you've come a long way indeed! Take some time to understand the steps we've followed until this point to
have a better understanding of the concepts involved. 

### Customising List Views

So far, we've created a `ListView`, which displays a simple text in each row. Let's take matters further by creating a somewhat more
detailed view for the rows of our `ListView`. At the end, our goal is to create a `ListView` that will look something like this &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-22%2018.37.34.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Advanced view for Tweets list">  

To achieve this, we will need to modify the layout file for the each of the Tweets. Let's go ahead and put in the required code
in the `row_tweets.xml` file. The way we're going to go about this layout is as follows &mdash;  

* Have an outer `LinearLayout` with `orientation` set to `horizontal`, so that the elements come one after the other.
* Add an `ImageView` for the profile image, and then have another `LinearLayout` with `orientation` set to `vertical` for
adding the text elements in a top-to-down manner.

Here's a visual overview of how the elements will be placed &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-23%2010.45.20.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Tweet View Layout">  

Let's take a look at the layout XML file now &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-23%2010.59.32.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Tweet View Layout XML">  

Here are some things to note about this layout&mdash;  

*  We make use of the `sp` unit for declaring text sizes. `sp` stands for *Scale (independent) Pixels*. This is similar to `dp`,
but also takes into consideration the user's default font settings.  
*  The attribute `ellipsize` set on the `TextView` is meant for trimming the containing text when its size exceeds that of the
available space for rendering it.  
*  The profile image is loaded from a static PNG image. You can access it from [here](https://dl.dropboxusercontent.com/u/1166125/codelearn/user_profile.png)
and copy it to a new folder named **drawable** in your workspace.

To add the final touches, let's make some minor changes to the `ListView` component in the `activity_tweets.xml` file. Add the 
following 2 lines to the `ListView` element defined &mdash;  

    android:dividerHeight   = "10dp"  
    android:divider         = "#e0e0e0"   

Next, comment out the lines in the `TweetList` activity class, where we were setting a string value for each of the `ListView` items.

    // TextView tv = (TextView) row.findViewById(R.id.tweet_title);
    // tv.setText(_tweetList.get(position));

Now go ahead and run the project on the emulator/device. That's a job well done!



## Part 2 &mdash; Getting Started with Data

-------

Now that we've gone through the elementary tasks of setting up the user interface for our app, it's time for us to look into the
data handling part. Any smartphone device in general, provides a variety of ways by which we can capture, process and store data 
through the interactions of the users. While we haven't covered the entire spectrum of user interactions, we have so far created
enough points of interaction for us to start working with them.  

### A Better Login Experience  
Let's get back to our Login screen. As you might remember, we had created the simple UI and were taking the user to the next screen
upon the click of a button. Now, we will spend some time capturing the data entered by the user in these fields and work to create
an experience, which is more complete in nature.

The first thing we need to do is capture the data entered by the user in the *Username* and *Password* fields. To go about it, we 
require references to the 2 `EditText` views that we had placed in our layout file. Here's the short snippet to get these references
pointing to the correct `EditText` fields &mdash;

First declare the references to the `EditText` fields at the class level as *instance* variables (this isn't mandatory, but usually
helps in accessing the field values from different methods. Otherwise, you'll need to pass them around everywhere.)


<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-20%2009.28.33.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Declaring EditText references">  

Next, we need to initialise these references by accessing the corresponding fields, which will be created by the layout inflater of
the Android SDK. It really isn't as hard as it may sound. The only thing you need to keep in mind is that, you try to access fields
declared in your layout *only after* you have invoked `setContentView(R.layout.layout_file)`. Otherwise, you'll get an error.

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-20%2009.32.53.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Accessing layout field references">  

The `findViewById` method is a convenience method defined for all `Activity` classes. This method allows you to retrieve any view, which
has a particular `android:id` attribute set in the layout. 

**TIP** &mdash; For accessing layout fields, you should always do so **after** invoking the `setContentView` method. If you're familiar
with Javascript and HTML, the `findViewById` method works very similarly to the `document.getElementById(...)` method. Besides the
`Activity` class, `findViewById` is also defined for every view in Android. So, if you want to search for an element defined within, say
a `RelativeLayout`, you can invoke the `findViewById` method on a reference that points to the `RelativeLayout` view! Doing so is usually
more efficient than searching for an element by ID across the entire layout file. Especially so, if the layout file is complex.

This is a good time to introduce you to Android's default logging framework. It might be a surprise, but if you use `System.out.println(...)`
nothing will get printed on the console. That's because Android doesn't really support a notion of standard IO. To print any statement 
you need to use `android.util.Log` class' methods. This class defines a bunch of static methods for logging *debug*, *info*, *error* and other relevant
levels. To view the log messages, you need to have the **Logcat** view open. Here's a simple debug log statement &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-20%2009.48.18.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Using Android Log">  

And this is how it'll look in the **Logcat** view of Eclipse &mdash;

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-20%2010.04.38.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Logcat showing log message">  

Alright, so now that we've managed to retrieve the values entered by the user, we need to allow the user to have a *desirable* login experience.  

*So what exactly makes up a desirable experience?*  
It is one where the user logs-in once, and doesn't have to provide his/her credentials for successive app launches. An important part of this 
experience is provided by the server with which the app interacts. The server usually hands out a *token* or a *session ID* which needs to be
cached by the app. Whenever the user relaunches the app, a check is made in the cache to check whether this data is available, and then decide
to show the login page or not. In our case, since we don't have a server component, we'll simply cache the user's login username, and make a check
on that.  

Storing data by an app brings us to the first option used to persist data by an app &mdash; `SharedPreferences`.

----------  

Please take the time to get a fair understanding about `SharedPreferences` from our [concept tutorial](http://codelearn.org).  

----------      

Making use of `SharedPreferences`, our logic needs to be somthing like this &mdash;  

* in the `onCreate` method, we'll first check to see whether the `SharedPreferences` have a value for the username.  
* if we don't find any value, we'll show the Login screen, otherwise we'll take the user directly to the tweets list screen.  
* also, if the user performs a login, we need to store the user's username in the `SharedPreferences`.

Let's start by storing the user's username in the `SharedPreferences`.  In the `onClickListener` method, let's capture the data and 
store it in the `SharedPreferences`.

<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-21%2014.31.18.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Logcat showing log message">  

One way to think about the `SharedPreferences` is to consider it as a big `Map` (or `Dictionary` in other languages) of keys and values.
Getting a reference to the `SharedPreferences` allows you to *read* values from it, but if you wish to write into it, you'll need to 
retrieve an instance to the `Editor` and use any of its `put____` methods.  

Finally, here's the small bit of logic we need to include so that our application handles the flow of the app depending on the absence
or presence of user's credential details. Here's how it will look &mdash;


<img src="https://dl.dropboxusercontent.com/u/1166125/codelearn/Screenshot%202013-11-21%2015.22.29.png" 
    style="box-shadow: 1px 1px 1px #c2c2c2" alt="Logcat showing log message">  

And that's that, with this in place, we've added enough logic and data handling to provide the user an *ideal login experience*. 
