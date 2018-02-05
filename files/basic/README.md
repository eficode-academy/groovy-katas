# Files (basic)

## Reading files

Define a File variable pointing to the `tournament-results.csv` file.

Print out the file contents.

- Run `groovy exercise.groovy`
- Q: Was the output as expected?

## Creating and writing to files

Define a File variable pointing to a `pretty-results.txt` file.

Write some code that creates the file if it doesn't exist.
Then, write a prettified version of the contents of `tournament-results.csv` to `pretty-results.txt`.
Try having it resemble the following:

```
             VS | Ro1 | Ro2 | Ro3 |
      red-sheep |   7 |  13 |  11 |
      blue-dogs |  13 |  11 | N/A |
yellow-canaries |  11 |  10 |  13 |
     green-cows |   6 |   4 | N/A |
```

Finally, print out the contents of `pretty-results.txt`.

- Run `groovy exercise.groovy`
- Q: Was the output as expected?
- Q: How well would your parsing and printing fare if the text files were extremely large? How could you improve it?

## Copying/moving files

Write a script that copies the `tournament-results.csv` file into a `ping-pong-2018` subdirectory.
Create the subdirectory if necessary.

Check if `ping-pong-2018/tournament-results.csv` exists.
If so, rename it to `turqoise-turtles-results.csv`.

- Run `groovy exercise.groovy`
- Q: Was the output as expected?
- Q: Does the file structure match expectations?

<br>
<br>

_Recommended continuation: *TODO*_
