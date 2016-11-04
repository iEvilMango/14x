# Basic usage of terminal
_For OS X; Linux and Windows versions exist and are generally fairly similar, but it'd be worth googling around for a specific tutorial_

This tutorial will show the basics of making traversing your file system with the bash terminal (default for os x), as well as making files / directories, and running java programs and python scripts. I won't be mentioning more than the bare minimum of the parameters here - google will help with anything more than the basics of using the terminal, this should just be enough to do things that won't have a chance at breaking things (like recursively deleting everything). Basically, just traversing directories, running things and adding things.


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

__a.__ '..' refers to the parent directory (in this case, I was in the temp folder created in the previous image, and used .. to back out into the 14x folder). This can even be 'chained;' that is ../.. will refer to the parent's parent directory (grandparent?)

__b.__ javac refers to the java compiler; this will compile Advanced.java and save it as a class file.

__c.__ java runs the Advanced class from the compiled .class file. Notice that it is just Advanced, not Advanced__.java__ or Advanced__.class__

__d.__ the Advanced class being run in the terminal (and waiting for my input).

![python in bash](imgs/python_in_terminal(6).png)

__a.__ python3 starts up the Python 3 interpreter. >>> is the terminal waiting for your Python commands.

__b.__ Python commands being run line by line. (quit() is the method you want to call to quit.)

__note:__ if you just put in 'python' from bash, it will use the python 2 interpreter instead of python 3. Google python 3 vs python 2 for reasons to choose using one over the other; if you just start learning python, the only reason I would think you'd want to stay with 2.7 would be to use libraries that haven't been ported to 3.



for information on using git in the terminal, this [page seems](https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html) like a pretty good start.