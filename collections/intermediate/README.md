# Collections (intermediate)

### Hint

Consider employing some Groovy [Collections methods](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/Collection.html) or the arithmetic operators (`+`, `-`, `*`, `/`, ...)

## Manipulating lists

Define two lists A and B, A containing integers 0 to 7, B containing integers 3 to 10.

Print out the following:
    - a list containing all numbers in A and B, including duplicates
    - a list containing all numbers in A and B, excluding duplicates
    - a list containing all numbers in A, but not in B
    - a list containing all numbers found in both A  and B

- Run `groovy exercise.groovy`
- Assert the lists contain the correct numbers

## Sorting lists

Define a list containing the names of your favorite technologies.

Print out the following:
    - the contents of the list, sorted alphabetically
    - the contents of the list, sorted by length

- Run `groovy exercise.groovy`
- Assert the output is sorted correctly
- Q: Did your sorting mutate the original list? If so, how can you avoid that?

## Filtering lists

Define a list containing integers 1 to 25.

Print out the following:
    - a list containing all numbers smaller than 15
    - the sum of all numbers larger than 15.    _(205)_
    - a boolean representing whether or not the list contains a number larger than 20
    - a boolean representing whether or not the list contains the number 20

- Run `groovy exercise.groovy`
- Asssert the output is correct

<br>
<br>

_Recommended continuation: *collections/advanced*_
