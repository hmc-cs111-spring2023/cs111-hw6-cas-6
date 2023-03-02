# Reflection on implementing regular expressions of a DSL

## Which operators were easiest to implement and why?
The postfix operator was a lot easier to figure out that I had anticipated. All the operators before that were pretty easy to implement because I just needed to use the fucntions I already wrote for homework last week.

## Which operators were most difficult to implement and why?
The repetition opertator was the hardest to implement because I dont have a lot of experience with apply, so it took me a while to figure out how to use it for this case.

## Comment on the design of this internal DSL

Write a few brief paragraphs that discuss:

- What works about this design? (For example, what things seem easy and
  natural to say, using the DSL?)
- What doesn't work about this design? (For example, what things seem
  cumbersome to say?)
- Think of a syntactic change that might make the language better. How would
  you implement it _or_ what features of Scala would prevent you from
  implementing it? (You don't have to write code for this part. You could say
  "I would use extension to..." or "Scala's rules for valid
  identifiers prevent...")

The conversion were all a little tedious because I had to be careful and make sure that I had all the correct types. I had to state the types of my variables to guarantee that I didn't have type errors. Most of the operators were easy to convert because I just had to reuse functions that I've already worked with. 

Syntactically, I would change the way that Scala's foldRight works because it seems useless to write the starting element outside of the original value and the function. I also wish you could do an implicit conversion for the operators without the extension. 
