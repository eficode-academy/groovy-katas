# Native processes (intermediate)

## Waiting for long-running processes

Write a script that executes `sleep 2` and prints the process' output.

- Run `groovy exercise.groovy`
- Q: Was the result as expected?

Print the process' exit value instead.

- Run `groovy exercise.groovy`
- Q: Was the result as expected? Why (not)?

## Passing in environment variables

Write a script that runs the `today-is.groovy` script.
This script takes a while to run, but speeds up when the `TURBO_MODE` environment variable is set.

Pass in the `TURBO_MODE` environment variable, with value `ENABLED`

- Run `groovy exercise.groovy`
- Q: Was the result as expected?
- Q: How would you pass in all current environment variables?

## Capturing process output

Write a script that runs the `today-is.groovy` script and prints output/errors as it runs.

- Run `groovy exercise.groovy`
- Q: Was the result as expected?

<br>
<br>

_Recommended continuation: *parallelism/basic*_
