# First steps (basic)

### Hint

Check [docs.groovy-lang.org](http://docs.groovy-lang.org/latest/html/documentation/index.html#_syntax) for syntax documentation.

## Hello, world!

Write a line that prints `Hello, world!`.

- Run `groovy exercise.groovy`
- Assert `Hello, world!` printed successfully

## Defining variables

First, store three numbers in three variables: `<type> <name> = <value>`

Then add, subtract, multiply or divide the numbers however you like, and store the result in a new variable.

Finally, print the result.

- Run `groovy exercise.groovy`
- Assert the printed result is correct
- Q: What is the difference between using `def` variables versus `int` or `float`?

## Logic paths

First, store a number in a variable.

Then, write a conditional block that prints different lines of text depending on the value of your number. 
Have it print `# is less than 10.` if it's lower than 10, `Whoa, # is too big!` otherwise.

Here's one way to write a conditional block:

```
if (condition) {

} else {

}
```

- Run `groovy exercise.groovy`
- Assert the result is correct based on the value of your number
- Q: What are some other ways to write your conditional block? What are their up- and downsides?
- Q: Did you format your result strings using concatenation, variable expansion or something else?

## Looping

Print `Hello, world!` ten times.

Classic `for` loops work in both Java and Groovy: 

```groovy
for (i = 0; i < 3; i++)
```

Or you can make use of some of Groovy's other looping mechanisms:

```groovy
3.times {}
```

- Run `groovy exercise.groovy`
- Assert the correct amount of lines were printed.
- Try using a different loop style, like `while` or `Integer.times {}`

<br>
<br>

_Recommended continuation: *collections/basic*_
