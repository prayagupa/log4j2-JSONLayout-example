uses https://github.com/prayagupd/log4j2-JSONLayout

this demonstrates how you can just in the jar with the Layout you want, 
and make logging keep working without redeployment

TODO :)
--------

```
java -jar log4j2-jsonlayout-example-assembly-1.0.jar 
ERROR StatusLogger No log4j2 configuration file found. Using default configuration: logging only errors to the console.
```

```
{"timestamp":"2016-12-20T05:44:29.306-08:00","timeMillis":1482241469306,"version":"1","thread":"main","level":"INFO","loggerName":"fhkajgh","message":"this world is full of crap people","endOfBatch":false,"loggerFqcn":"org.apache.logging.log4j.spi.AbstractLogger"}
```
