package notesAndPractice.Day18_Inheritance;

public class Day18_inheritance_Theory_readme {

/*
Inheritance: this is use so that code can be re-use (call by other).
This is use when attribute and method from one class to other.
there are two concept (relationship in inheritance
1. Parent --> Child  is the strong inheritance
2. Friendship relationship -- which can be
for example Car has Engine and has a Music System
- composition relationship (has close relationship, without using parent method, code will not run)
   example here Engine, without engine car can not run
- Aggregation relationship (no close relationship, without using parent code also method can be run)
   example here Music System, can can run without Music system

this concept can group into two categories
Parent (superclass) - this is class which will get use by other subclass (child)
Child (subclass) - this is inherit from another class, will use use what is call in superclass (parent)
-- to call parent method in child, we have to user extends
Class <Name > extends <parent's class Name>

Type of inheritance
1. single-level (Parent -- Child)

2. multi-level (Parent -- Child -- Grand Child)

3. Hierarchical (Networked) - this is family tree great Parent --> two children (parents) --> each with again two

BELOW TWO DO NOT SUPPORT IN JAVA
4. Multiple - ( Parent A  + Parent B --- Child, this is not possible therefore we don't use in JAVA)
5. Hybrid - DO NOT SUPPORT (Parent A <--> child A -- Child B | Parent B <-->Child A Child B  ( not possible)

-- to call parent method in child, we have to user extends
<ACCESS MODIFIER> class <child name> extends <Parent class Name> {
==== code
====
}

public class Car{
==
}

public class Engine extends Car {
====
====  can call all in Car and can have its own code
}
 */

 // Example here creating Parent class

}
