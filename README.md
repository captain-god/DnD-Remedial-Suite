dougsndragons
=============
##About
Developed by DougRiss, Sept '14 - present

Dougs and Dragons is a 3.5 Remedial Suite - that is, the remedy to the tedium that is creating content using 3.5's long-winded and complicated rules.

###Latest Version
0.0.0 - Github Created, Project started

###Code Standard
Code Standard 1 for Dougs and Dragons (Revised 9/5/14)

Tab Size: 4 spaces or 1 tab character
Line Size: globally irrelevant, but try to be consistent. For readability and stuff.
Spacing: Parenthesis, Square brackets and Curly Braces may have a space between their identifiers and contents, but it is not required

Conditional - use if-then-else when >3 cases, otherwise use switch
```
//One condition
if(condition){
    doSomething...
}

//two conditions
if(condition){
    doSomething...
}
else{
    doSomethingElse...
}

//three conditions
if(condition){
    doSomething...
}
else if(condition){
    doSomethingElse...
}
else{
    doSomethingDifferentThanElse...
}

//three or more conditions
switch(condition){
    default:
        doSomething...
        break;
    case x:
        doSomethingX...
        break;
    case y:
        doSomethingY...
        break;
    case z:
        doSomethingZ...
        break;
    case a:
        doSomethingA...
        break;
    case b:
        doSomethingB...
        break;
}
```

Variable and Method naming - semi-descriptive, camelCase; abbreviations are fine if intelligible.
```
//good idea
private int costInCopper;
private int costInCP; //This is fine because CP is a well known abbreviation for Copper Piece in game.
private int convertCopperToGold(){...}
private int convertCPtoGP(){...} // as above.
public class DnDCurrency{...}
public class Currency{...} //no problem
private enum diceTypes{...}
private enum dTypes{...} //decent, but not ideal abbreviation

//bad ideas
private int cpr; //instead of copper
private int CPGP(){...} //instead of copper to gold
private int fuckinDoThislol(){...} //instead of copper to gold
public class JeffSucks{...} //just no
public enum types{...} //nondescript as all hell. No.
```
