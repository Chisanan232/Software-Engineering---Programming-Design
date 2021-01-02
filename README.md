# Software Engineering - Programming Design

A great program (even a project) should be:
1. high cohesion, low coupling
2. high available to reuse
3. flexible
4. easy to read and understand
5. Reduce Complexity


一個良好的程式（甚至是專案），應該具備：
1. 低耦合，高內聚
2. 高可復用性
3. 彈性
4. 易讀，易懂
5. 隱藏複雜性



## What is “High cohesion, low coupling”?
These two concepts is inversely by each other.
Cohesion means that objects are related in a program.
For coupling, inversely, it means that objects aren’t relative for each other at all.
So why is 「high cohesion, low coupling」?
It always has so many classes for a feature, even a project. In general, we put the relative codes together like in the same class. But be carefully considered for that:
1. Are the code feature or target relative? 
2. Does it usually need to call the functions which from other classes? 
If the first question is yes. Congratulations ! The class is clear at this step. If no, you should put the relative codes to another class, even more classes you need. 
And for the question 2, it’s possible that you should consider that 
1. The  functions which be called are relative for the callee class
2. It’s a common target feature for the callee class, and maybe we should try to use Delegation or something else concept to resolve it.

## What is “Flexible”?
It’s easy to add, remove, modify the detail code or class but doesn’t affect or be affected by other functions or classes. Sometimes, in the other words, it means that every class is DEPENDENCY, it has its self features in their project so that every one could use it every time it needs.

## What is “Easy to read & understand”?
* Understand 
Do you ever call a function or instant a class but cannot get the point what it doing at all before? No matter naming a variable, a function, a class, it should be clear that developers could get the point when they see it first time. 

* Read
It should like a description with one of below conditions that could tell every developers meaning:
What is it doing?
Why does it doing?
When does it do?

By the way, if you cannot think about a shorter and more clear naming, please, it no reason why don’t use more long but more clear meaning naming.

## What is “Reduce complexity”?
Above previous point “Easy to read & understand “ topic. A great naming is intuitive so that developers don’t need to know details about implementation but could get the point.

## What is “Atomicity”?
For every function in a class, it should do only one thang, even it could do “one step of procedure” of a job. 


Above all concepts just a basic of foundation point for software engineering and its target is very clear, for maintaining. 


