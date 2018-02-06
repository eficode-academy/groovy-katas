// GPars is an optional, but great, library for concurrency/parallelism in Groovy
// @Grab(group='org.codehaus.gpars', module='gpars', version='1.1.0')
// import ...

// A list of tasks that need executing
List<Closure> tasks = (0..25).collect { num ->
    return {
        String prefix = "[process ${num.toString().padLeft(3, '0')}]"
        println "$prefix start"
        sleep(num * 100)
        println "$prefix end"
    }
}
