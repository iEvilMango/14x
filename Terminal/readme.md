# Basic usage of terminal
_For OS X; Linux and Windows versions exist and are generally fairly similar, but it'd be worth googling around for a specific tutorial_

This tutorial will show the basics of making traversing your file system with the bash terminal (default for os x), as well as making files / directories, and running java programs and python scripts.


## cd 
![cd for change directory](imgs/cd_dir(1).png)
__a.__ The important part of this section is the tilde (~) at the end. That refers to the root of the file directory (should just be the base user folder).

__b.__ The user; I'm logged in as Joey.

__c.__ the cd command is for change directory; changes directory to the given directory (folder).

__d.__ parameter for cd; using relative pathing (from where I currently am), go into the 14x directory in the GitHub directory. The tilde symbol can be used to refer to the base directory (i.e. cd ~ or cd ~/GitHub). This is case sensitive.

![ls to list directories](imgs/ls_dir(2).png)
__a.__ the ls command lists the files (and directories) in the current directory. Here, it lists out all the things in the 14x directory.

__b.__ the response from bash; that is, the things in the 14x directory that you got from the ls command

![open, touch](imgs/open_touch_dir(3).png)
__a.__ the open command, well, opens the given file / directory.

__b.__ The file name to be opened. Of note, you can auto complete with tab, once you start writing out name of a file or directory name. It will complete as much as it can at the time (for example, typing out 'Ad' and pressing tab will fill in 'Advanced.', as that can be followed by either 'java' or 'class').

__c.__ the touch command adds a new file if it doesn't already exist, and if it does, simply updates the 'last accessed at' time - as such, it is fairly safe to use to make files without risking over writing files that already exist.

__d.__ listing the files out again shows that we have a new file in the directory

![clear](imgs/clear(4).png)
__a.__ the clear command cleans up the console, 'clearing it' (technically a limited number of the commands are still stored if you use the scroll bar; this just makes it so you have a nice clean screen to look at) 

__b.__ the mkdir command will make a new directory (folder).

![java in bash](imgs/java(5).png)

![python in bash](imgs/python_in_terminal(6).png)