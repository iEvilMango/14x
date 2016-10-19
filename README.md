# 14x
14x practice and extra material not covered in class.


_Nothing covered is done so in a conclusive or complete fashion; use it as a starting place, not as a complete guide. Start one, see if you can find uses for it, and then google to find more._

###**Unless explicitly told otherwise, all concepts in Advanced.java are considered advanced material and strictly forbidden on assignments. Using them can and will result in a point penalty on your homework.** 


##Commands in Advanced.java:
* "_print hello world_" -> prints "hello world!";
* "_ternary_" -> mini - tutorial on the ternary operator;
* "_binary_" -> mini - tutorial on binary representations;
* "_regex_" -> mini - tutorial on regular expressions;
* "_try/catch_" -> mini - tutorial on try / catch blocks;
* "_xor_" -> mini - tutorial on xor (exclusive or);
* "_lambda expressions_" -> mini - tutorial on lambda expressions;
* "_quit_" -> ends the program;


### Regular Expressions links
*[Find anything relating to regex!](http://lmgtfy.com/?q=regular+expressions)

*[Automatic regex golf player](http://regex.inginf.units.it/golf/)

*[Regex tester, with highlight to explain](http://www.regexpal.com/)


###Uses for those things? [non-exhaustive, google is your friend]
* printing hello world : hey, now you know what a switch statement is.
* Ternary ? It can make code a little cleaner, and remove redundancy a bit : If you nest it too much like in the last example in Advanced, then it gets ugly really fast.
* Binary : 
	```01001001 01110100 00100111 01110011 00100000 01101101 01100001 01101001 01101110 01101100 01111001 00100000 01101010 01110101 01110011 01110100 00100000 01101001 01101110 01110100 01100101 01110010 01100101 01110011 01110100 01101001 01101110 01100111 00101110```
	[But there are actual uses, google it!]
* Regex : grep some stuff up for fast searches that can be very particular. But just look at documentation; you've already been using regular expressions if you have ever used String.split(regex), just likely really simple ones.
* try/catch : Because you don't always want to crash when something bad happens.
* xor : Simply if conditions, make some things that seem like magic happen (What happens if you xor a number by the same number, twice?) and more
* lambda expressions : Used in Graphical User Interfaces a lot. Less common in Java (only added recently), but can work some magic in other programming languages that use it.

##Other topics that are not covered in Advanced.java due to complexity (Still advanced material) 
_Amazon Smile links provided for any books, it has the same prices as amazon but a portion goes to a charity of your choice if you choose to purchase anything_
* State machines : Used for many purposes, including videogame AI. [Programming Game AI by example goes into the subject](https://smile.amazon.com/Programming-Example-Wordware-Developers-Library/dp/1556220782/ref=sr_1_1?ie=UTF8&qid=1476825767&sr=8-1&keywords=video+game+ai+by), but has examples in c++. [There are java equivalents available here.](http://www.sallyx.org/sally/en/game-ai/) (this is on my kindle, but I haven't gotten to reading it yet.) [Checkout this StackOverflow response too, after checking out regexes](http://stackoverflow.com/questions/525004/short-example-of-regular-expression-converted-to-a-state-machine)
* Python : Obviously, this can't be used on the homework :). But, it's an interesting language, that has some very cool properties, while sharing a good amount of structure with java. Google for a basic example, and you should be able to learn the basic syntax pretty quick. [I've read most of this book and highly recommend it for more advanced topics. (It covers python 3, which I would suggest any new learner stick with)](https://smile.amazon.com/Fluent-Python-Luciano-Ramalho-ebook/dp/B0131L3PW4/ref=mt_kindle?_encoding=UTF8&me=)
* GUI programming : Can get messy real quick, but kind of fun to learn about. If you want to stick with java here, I'd suggest either the Swing or JavaFX frameworks.
* [This subreddit has a bunch of challenges, adding more at a rate of ~~ 3 a week. See if you can solve any!](https://www.reddit.com/r/dailyprogrammer)

// toDo: add markdown starter, terminal / git starter / running java from terminal. Add exercises for items in Advanced.java