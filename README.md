# spring-batch-processing

## Spring batch core component and the flow of execution of core component:
>The first key component in spring batch architecture is job launcher which is an interface. This is use to launch spring batch job .This is also and entry point to initiate any job in spring batch. It has a method called run which will triger the job component.Once job launcher call the run method immediately it will call the job component. Once the job launcher launches the job it will call another component called job repository.
>
>The job repository helps to maintain the state of job whether the job state is succeed or failed.
>
>The job component will talk to another component called step. Step is the combination of other three component item reader, item processor and item writer.
>
>  Item reader will read the data from source. 
>  
>  Item processor will process the data. If we have to do any operation between reading and writing we can use this processor. 
>  
>  Item writer will help to write the data in the destination. 
>  
>  Job can have multiple steps and step can have multiple item reader, item processor and item writer.


The required dependency are lombok,spring web, spring batch, Mysql driver, Spring Jpa 

#### Note: 
Set spring.batch.jdbc.initialize-schema=ALWAYS to create the batch related table on application start. Otherwise it will not create the batch related table in database.
