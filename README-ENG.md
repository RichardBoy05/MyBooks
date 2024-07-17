# MyBooks: Complete guide for use

[![en](https://img.shields.io/badge/lang-en-red.svg)](README-ENG.md)
[![ita](https://img.shields.io/badge/lang-ita-green.svg)](README.md)

## Index
1. [General information](#general-information)
2. [Technologies used](#technologies-used)
3. [Installation](#installation)
4. [Releases](#releases)
5. [Bugs](#bugs)
6. [License](#license)
7. [Questions, suggestions, and bug fixes](#questions-suggestions-and-bug-fixes)

### General information
***
**"MyBooks"** is an application to manage your personal library: you can register and save your books within the program and then perform specific searches based on the enabled filters.  
The project is aimed at anyone who loves reading and wants to keep their volumes organized.  
The application features **four different graphical interfaces**:

1) **Main interface**: 

This screen allows the user to choose whether to add a new book or search among those already entered (using the two main buttons A and B). At the bottom, there are three other buttons (C, D, E): the "*About*" button (C) will open the information file of the application (the one you are reading right now). The "*GitHub*" button (D) directs the user to the link on the GitHub site.  
Finally, the "*Mail*" button (E) allows the user to suggest improvements or report a bug to the project's email mybooks.fixandbugs@gmail.com

![Main window](https://github.com/RichardBoy05/MyBooks/blob/main/res/window1.png)

2) **Book entry**: 

Here, the user can perform three operations: add a book (after filling in all the fields and optionally selecting a cover image), delete a book, or clear the entire library. The screen is quite intuitive and does not require special explanations.

![Book entry](https://github.com/RichardBoy05/MyBooks/blob/main/res/window2.png)

3) **Search screen**

In this window, there is a table on the left side with two buttons, while on the right side, various search filters are located.  
Based on the selected filters (which cannot be empty), once the "*Cerca*" button is pressed, the table will display books that match the chosen characteristics (**N.B.**: if no books appear, it means that none of the entered volumes meet the search criteria).  
There are two other buttons: the "*Vedi tutto*" button, when pressed, will show all the owned books in the table above (essentially, a "shortcut" to view all books with a single click).  
Finally, the "*Scopri di più*" button will open a new window that will show detailed information about the book selected in the table.

![Search Screen](https://github.com/RichardBoy05/MyBooks/blob/main/res/window3.png)

4) **Additional information**

This window will show the user detailed characteristics of the book selected in the search window.  
The cover image will also be shown, if uploaded, in the appropriate space. It is also possible to change the image "on the fly" if the previously inserted one is not satisfactory.  
**Important**: The size of the cover image will be adjusted to fit within the screen. The recommended size to avoid altering the initial proportions is **9/16**, not smaller than **150 x 263 pixels** (this is designed to allow the user to conveniently use a phone-captured image, which generally meets the mentioned conditions).

![Additional Information](https://github.com/RichardBoy05/MyBooks/blob/main/res/window4.png)

### Technologies used
***
Here are the technologies used in developing the application:  
* [Java Development Kit](https://www.oracle.com/it/java/technologies/javase-jdk15-doc-downloads.html): Version 15.0.1 
* [Sqlite 3](https://www.sqlite.org/download.html): Version 3.34.0
* [sqlite-jdbc](https://github.com/xerial/sqlite-jdbc/releases): Version 3.32.3.2

### Installation
***
The installation procedure is simple:  
* Download the installer from the *Release* section of the repository.
* Run the file and follow the instructions for guided installation.

**N.B.:** The installation package may seem quite large. This is because the Java Runtime is already included in the *.exe* file. This choice was made to avoid requiring the user to install *Java*, which can be inconvenient for less experienced users.

### Releases
***
List of various *releases* of the program:
* Pre-release 0.1
* First release, *coming soon*, v 1.0.0

### Bugs

[Bug #1](https://github.com/RichardBoy05/MyBooks/issues/2)  
[Bug #2](https://github.com/RichardBoy05/MyBooks/issues/4)

### License

[GNU General Public License 3.0](https://github.com/RichardBoy05/MyBooks/blob/main/LICENSE)

### Questions, suggestions, and bug fixes

For any issues or requests, contact me at the *official program email*: mybooks.fixandbugs@gmail.com

I hope you enjoy the tool =)

Bye
