# Closures (intermediate)

## Memoizing results

Define a closure that takes two numbers and does the following:
    - sleep for two seconds
    - multiply the given numbers and store the result
    - print the result, prefixed with `[INSIDE] `
    - return the result

Configure the closure to memoize results.

Call the closure, and print the result prefixed with `[OUTSIDE] `, with the following values:
    - `2` and `7`
    - `2` and `7`, again
    - `5` and `4`
    - `5` and `4`, again
    - `2` and `7`, again
    - `7` and `2`

- How long do you expect this code to run for? Why?
- Run `groovy exercise.groovy`
- Q: Did the code run as long as you expected it to? If not, why?

<br>
<br>

_Recommended continuation: *regex/basic*_
