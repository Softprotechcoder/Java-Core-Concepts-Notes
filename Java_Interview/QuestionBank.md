> Completable feature in java\
> Spring boot,\
> Thread\
> Hash collies  Multithreading\
> java concurrency,\
> java 8 .   static variable is serializable ?  --- Its not serializable\
> can we override default method  --- > NO .\
> Static methods can’t be override . Explain about SOLID Principle\
> Example Open/ close principle of SOLID with example\
> Find second largest number from List integer\
> Find second largest number from List integer without duplicate.
>
>  
>
> wait many are thier .. Using java Strams find the second largest repeated character .\
> \
> Get distinct characters and their count in a string using Java streams ?
>
>  
>
> {
>
>  
>
> String object = "bababachhdddaaabb";
>
>  
>
> }\
> \
> \
> 5\) How could avoid serializing few sensitive fields on entity over network transaction.\
>   Transient in java , JsonIgnore – json , XMLTransient- XML , we can encrypt and decrypt the data . \
> \
> 6\. Difference between Runnable and Callable interface\
> \
> Which version java you have worked on ? what are the featurs of java8\
> what is lambda Expression ? why it was introduced in java8 ?\
> what are annotations you have used in Spring boot application ?\
> \
> What are the restmapping you have used\
> Difference between @RestController vs @Controller\
> \
> \
> 1\. Find the distinct words from the following string. Write SQL Query to find out highest salary for each department. \
>
>
>  
>
>  
>
> Difference comparator , comparable ,\
> Diff Hasmap , Hashset ,\
> How hashset work internally\
> How to implememtn hash code , override based on employee object\
> Using steam sort the same listofEmplyeeBased on match of name , age , salary , based on comparator \
> Purpose  of skip  method , distinct method in streams \
> \
> 2\. how to handle hash collision.\
> 3.ConcurrentHashMap explanation\
> 4.different between  hashMap and concurrenthashMap\
> 5\. program to reverse array of integer  and return as List with out using third variable input [1,2,3,4,5] output [5,4,3,2,1]\
> 6.hashmap iteration\_\
> \
> Java 8 features?\
> List of Employee object filter based on role\
> Linked HashMAP\
> Working of HashMap and its iteration\
> ordered and unordered collections\
> list of employee objects sorting based on ID\
> default implementation of Objectequals\
> what is CompletableFuture    ... How throw and throws has to be handled in the project\
> \
> When comparable and comparator has to be used ? Give an example\
> \
> stream terminal and intermediate operators .\
> \
> Whey we need customized exception handling\
> Can we pass object as key in map\
> In case we can pass object as key to pass any changes in required\
> Different between HashMap map concurrent HashMap\
> Volatile keyword\
> How to handle concurrent modification exception in array
>
>  
>
> 1\) A CSV file has posted from Updated with a detail of transaction on stock purchase. AccNo,AccName,secCode,secName,amount,Type\
> 100,Steve,HDFC,HDFC,100,Buy\
> 100,Steve,HDFC,HDFC,1000,Buy\
> 100,Steve,HDFC,HDFC,50,Sell\
> 100,Steve,HDFC,HDFC,100,Buy\
> 101,John,TCS,Tata Consultant Service,100,Buy\
> a. Normalize the data given in csv as RDBM structure.\
> b. Write a SQL to find the maximum amount in the transaction\
> c. Write a SQL to find second largest amount in the transaction\
> 2\) Application contains connection with mysql , mongoDb. Implement Transaction management to rollback if any one of source has failure while persist data.\
> 3\) Request has passthrough number of microservice in a Existing application, Calculate the time take for the request with minimum changes. \
>     We can use around advices . or after returning advices ,we can add some time logic and find the time taken od the method .\
> 4\) A microservice invoke a third-party call to get data to generate response, implement a number of retry then alternate action if the service has failure\
>      Using Resiliences4J and Circute breaker and retry , we will help and handle the this scenario .\
>       Dependency :- resiliensces -retry , resiliences4j-spring-boot2\
> Resilience4J;             \
> maxAttempts:3  (No of retry  )\
>                  waitDuration:500MS (Wait Duration)\
>                       retryException:HttpServerErrorException and socketTimeoutException\
> CircuteBreaker:\
>    Instances: healthIndicator:true ,\
>   failureRateThredshold:50 ,   (Percentage of failure that will trigger the circuit breaker )\
> waitduration:500 ms ,\
> ringbufferSizeClosedState:100 , ()\
> ringbufferSizeOpneState:10\
> @CircureBreaker(name=”apiCircuteBreaker”,fallbackMethod=”fallbackBackupLogic”)\
> @Retry(name=”apiRetry”)  // apply the retry method for this method\
> Public void dummyMethod(){…}\
> Public void fallbackBackupLogic(Exception e){..}\
> \
> 5\) How could avoid serializing few sensitive fields on entity over network transaction.\
>   Transient in java , JsonIgnore – json , XMLTransient- XML , we can encrypt and decrypt the data .\
> 6\) Input has nxn number of matrix with sorted values write sudo code to find given number from the matrix.\
> 2,4,6,\
> 8,9,12\
> 18,21,25\
> \
> Oct 30, 2024\
> Round 1:\
> \----------\
> 1\. Explain the previous project architecture, few questions based on that.\
> 2\. Questions regarding cloud - AWS(if you have worked on previously)\
> 3\. Write a program: using optimized approach\
>   Input: String - MyNameIsJava\
>   Output: String - M_yN_ameI_sJ_ava  ( append '\_' in front of uppercase letters)  ---- >>   input.replaceAll(“([A-Z])”,”\_$1”);\
> \
> 4\. Input : Java Java Bangalore Bangalore                       ------  >  1           \
>                  output : Java 2, Bangalore 2\
> \
> 5\. Write a program - Input : List of Strings\
>   Create 5 threads using Executor framework \
>   Each thread Pick few words from the list and convert to Uppercase\
> \
> 6\. Difference between Runnable and Callable interface\
> 7.  Class Parent\
>                  {\
>         void method1(){S. O. P("Parent");}\
>                  }\
> \
>    class Child extends Parent{\
>                  void method1(){S. O. P("Child")}\
>                  }\
> \
> The following code is correct or not and what is the output. How will you correct it.\
> Child childIns = new Parent();\
> childIns.method1();\
> Round : 2 ( Most of the questions related to project explained and cloud configurations)\
> \-----\
> \
> 1.Project Architecture (Previous project)\
> 2\. RabbitMQ - How will you process/consume messages in sequential order\
> 3\. PCF(Pivotal clould foundary) configurations and some cloud questions - why cloud - what is the advantage of deploying app in cloud.\
> 4\. Database indexes - what is the advantage\
> \
> Nov 18, 2024\
> \
> \
> Interview 1 :\
> \
> Explain about your project\
> Which version java you have worked on ? what are the featurs of java8\
> what is lambda Expression ? why it was introduced in java8 ?\
> what are annotations you have used in Spring boot application ?\
> Transaction management system\
> 2PC and @Transactional\
> What are the restmapping you have used\
> Difference between @RestController vs @Controller\
> Have you used Junit ? what is the way you have Junit? Explain what kind of scenario you have covered using Junit.\
> Have you used Cucumber test?\
> Aspect Oriented programming.\
> Have you used kafka?\
> \
> Nov 19, 2024\
> \
> Interview 2:\
> \
> Write code :\
> \
> 1\. Find the distinct words from the following string.\
> "Hello ! I am Ranit and I am excited today to give this interview" \
>    So I have used stream api with distinct method.\
> \
> What are the other way you can implement.\
> 2\. You have a employee data having department information, you want to add that data in database using springboot.\
>      Explain whole cycle.\
> \
> 3\. Some questions about Singleton and write singleton class.\
> 4\. During transaction of Employee department data if we get exception in springboot then how you will handle that.   \
> 5\. Entity class implement which interface. (Its internally implemented serialization interfaces to handle persistent data over the network).\
> some question about Serialization\
> \
> 6\. Write SQL Query to find out highest salary for each department.\
>           Select department_ID , MAX(Salary) as highest_salary from employee Group by department_ID ;\
>        select department_Id ,max(salary) as highest_salary from employee group by deparment_id ;\
> 7\. 2PC and @Transactional\
> 8\. how you will implement hashcode for employee class having below variable to get unique value for hashcode. Hashing mechanism.\
> Public Boolean equals(Object obj){\
> If(this==obj){\
> return true ;\
> if(obj==null   getclass()!=obj.getClass()){\
> return false;}\
> Employee other=(Employee)obj;\
> Return empi=\
> Public int hashCode(){\
> Return Object.hash(empID,empName);}\
> 9\. Apache kafka. How you will ensure you have ordered data in kafka topics.\
> 10\. How you will ensure that any method can be accessible if user having write access.\
> Nov 19, 2024\
> java stream\
> filter a list by department name\
> convert a list to map where id is key and object as value\
> why lambada introduce in java 8 ?\
> pervious project roles and responsibility.\
> Restful endpoint to store a data in 2 table and if any table commit fail then entire txn should abort\
> do you know cucumber ?\
> kakfa uses?\
> singleton pattern for thread safe\
> \
> December :- 5th\
> Difference comparator , comparable ,\
> Diff Hasmap , Hashset ,\
> How hashset work internally\
> How to implememtn hash code , override based on employee object\
> Using steam sort the same listofEmplyeeBased on match of name , age , salary , based on comparator \
> Purpose  of skip  method , distinct method in streams\
> Sort the arry\
> Employee\
> Age,Name, Salary , Id\
> 100 objects\
> Sort , Name , then age , salary , sorted\
> Spass\
> listEmployee.strema().sorted(x->x.getNamae().compareTo(y->y.GetName()).map()\
> Stream\<Integer>  aa=Arrays.toList(45, 12, 56, 15, 24, 75, 31, 89);\
> Add +5 to each number and  return it .   -- > arrayList.streams().map(number->number+5).collect(Collectors.toList()).forEach(System.out::println));\
> Find 2nd hihgt values ,\
> Find nth higeesh value .\
> aa.stream().sorted().filter(x->x.forEach(sysotem.out::PrintLn);\
> aa.stream().sorted().findAny().map(x->x.leghth()-1).forEach(sysotem.out::PrintLn);\
> \
> Stream\<Integer>  aa=Arrays.toList(45, 12, 56, 15, 24, 75, 31, 89);\
> aa.stream().sorted(Comparator.reverOrder()).skip(1).findFirst();   printing the second highest value after sort\
> int n=3;\
> aa.stream().sorted(Comparator.reverOrder()).skip(n-1).findFirst();     Nth largest number\
> \
>
>
>  
>
> 1.current project workflow and explanation.\
> 2\. how to handle hash collision.\
> 3.ConcurrentHashMap explanation\
> 4.different between  hashMap and concurrenthashMap\
> 5\. program to reverse array of integer  and return as List with out using third variable input [1,2,3,4,5] output [5,4,3,2,1]\
> 6.hashmap iteration\_\
> 7.Microservice architecture explanation\
> 8.How to communicate between multiple microservice\
> 9\. With RestTemplate how will communicate with multiple microservice in synchronous \
> 10.steps to connect database for spring  and spring boot application.\
> 11\. Explain three ways to move data from ui to controller.\
> 12\. Its possible to add employee object as key in map .if possible any changes need to be made in employee class.\
> 13\. How to avoid concurrent modification exception in list.\
> 14.how to handle callback in microservice.\
> 1 . project workflow \
> 2 . How much of lead experience do you have\
> 3 . how microservice communicate each other\
> 4 . what are the components of the producer and consumer in Kafka \
> 5 . In sql what are the steps taken to faster data retrieval\
> 6 . what are the factors defined to design microservices \
> 7 . How do you make sure when a scheduler put in a microservice is called only once\
> 8 . API gateway working \
> 9 . In spring boot application how do you use parallel execution of applications\
> 10 . Multithreading concepts\
> 11 . Given an array of employees , get the employees with salary great than 100 and title as "Tech lead"\
> \
> \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\
> \
> Java 8 features?\
> List of Employee object filter based on role\
> Linked HashMAP\
> Working of HashMap and its iteration\
> ordered and unordered collections\
> list of employee objects sorting based on ID\
> default implementation of Objectequals\
> what is CompletableFuture\
> different environement configurations in springboot\
> configuration for springboot db setup\
> authentication in your application\
> Communication in microservices\
> how to schedule a task\
> how to prevent a scheduler task accessing by two instance\
> Exception handling\
> create an exception and how will you throw\
> Dependecies required to use JPA repositories\
> CRUD vs JPA Repositories\
> How to design a Rest API\
> how to call stored procedure\
> how will you validate your requestobject\
> left join\
> API call in angular\
> angular project structure\
> Adding dependencies in angular\
> \
> Tell us about the project and the work you have done\
> Noclassdeffounderror and Out of memory – when it occurs and how to avoid it\
> What if the endpoint is protected when microservices are communicating\
> Java8 concepts and coding questions on Comparable and Comparator\
> Other than MQ , what else we can use to make async call\
> Other than completelefuture, what we can use for multi-threading:-\
> \
> \
> \
> What is IDA? How do we use to generate authentication tokens\
> In the UI, construct a table and pass the data to the controller\
> How throw and throws has to be handled in the project\
> How exceptions handled other than ControllerAdvice?\
> Performance tuning of query – what are the things we ll consider\
> Microservice communication in your project\
> Linkedhashmap is different from HashMap\
> When comparable and comparator has to be used ? Give an example\
> Is it possible to configure 2 DB instance? If yes how we configure?\
> How to handle in controller if we receive the input as Json\
> How to  handle in the controller if I want to receive only mandatory variable ? suppose we have a object with 10 params, we want to have only 5 params in it? How do we handle it\
> Spring batch? Where you have used it? Explain the steps to configure?\
> \
> \
> \
> Normalization and its rules:-\
> 1 All column contains atomic values (Each record is unique) , 1Nf\
> 2 No Partial dependency, (Non primary attribute )1Nf .(Primary key)\
> 3\. NO transitive dependency , 2NF (Non primary attributes , primary key)\
> 4, For every functional dependency (X,Y) X is super key (Boyce Codd Normal Form) BCNF\
> 5 .  Multi Valued dependency , 4NF .\
> \
> \
> \
> \
> \
> Different between Left join Inner join :-\
> Inner Join :-  return only match column data in two tables . based on ID or unique number.(Based on input)\
> Sample One (Select productid, productName , productValue from Product INNER JOIN Category  on Product.productid= Category .categoryId;\
> (\
> Left join:-  return all columns of left table and matched rows for right table\
> \
> How to manage transaction consistency and isolation in DB level\
> How you maintain transaction consistency  Micro services.\
> How to handle distrusted transaction\
> Differences in Iterator and streams\
> Iterator:- Imperative style , manual control , mutable , stateful , hasNext, Next\
> Stram :- Declarative , Funcationl , lazy evalituion , statless ,parallesim\
> Spring cloud purpose\
> Different between spring API getway VS  Zuule\
> How to push/ update only few properties for the environment without effect of other environment \
> Spring cloud configuration will help the for the file system or git . (Client side or server side)  .. spring boot internally auto trigger the configurations .\
> Spring cloud configuration—centralized configuration management system of the spring boot .\
> /actuatore-referesh\
> Whey we need customized exception handling\
> Can we pass object as key in map\
> In case we can pass object as key to pass any changes in required\
> Different between HashMap map concurrent HashMap\
> Volatile keyword\
> How to handle concurrent modification exception in array .\
> Iterator will cause exception, List Iterator .\
> CopyOnWriterArrayList form util .  it allow the safely modify the list while iterating , its internally\
> Revers array with out new array .---  we have to use swip  approaches\
> What is isolation in transaction, how it will work . (@Transactional(Isolation=Isolation.SERIALIZABLE)\
> We can mainly avoid the issue like dirty read, non-repeatable read , and phantom read issue might come .\
> Isolation.DEFAULT  -- default by db level .\
> Isolation.READ_UNCOMMITTED – ditry read   -- reading uncommitted data of the other transaction\
> Isolation.READ_COMMITTED : - prevent dirty read but non repeatable read occurs .\
> Isolation.REPEATABLE_READ:-- prevent dirty read  and non-repeatable read occurs but occurs phantom read .\
> Isolation.SERIALIZABLE :-  prevent dirty read but non repeatable read and occurs phantom read. (strictest the isolation level – prevent the other transaction to insert or update or delete row of the record )\
> (Transaction A read the column of amount and B update the column of amount again A read the column of amount its different not is called -- non repeatable read occurs)\
> phantom read —while querying the result set the changes due to insertion, deletion , update in other transaction (prevent based on locking the data make sure stable , performance down so need decided\
> Distributed transaction management:-\
> Local transaction – single micro services manage its own transaction for one DB . all operation happens with in transaction .\
> Distributed transaction :- Transaction doesn’t sufficient. Sage Desigen pattern.\
> 1 Orchestration :- central orchestrator coordinates the step of the sage , tell each service what we have to do nest .\
> 2\. Updating the data with event-based o\
> 3\. two phase commit\
> different saga design pattern:-\
> Orchestration based Saga Design pattern (Sequences of step, we can do Synchronous , and Asynchronously , Central  Orchestration  based –(ProcessOrder((), fail case roll back()—You can roll back what you want or services  )\
> Workflow based   (failed state it will compensation action will execute , Event based approach ,(Orchestrator, services, compensation ,event driven )\
> Spring transactional propagation: --\
> Required –if transaction existed it will be joined in the existing transaction else create new transaction\
> Required_NEW  It will be always create a new transaction . , If the transaction exists it will suspended or create new transaction.\
> SUPPORTS – If transaction exists it will join it , will continue without transaction in non-transaction with in method .\
> NOT_SUPPORTED -- If transaction exists it will join it suspend the transaction.\
> MANDATORY – the method should execute with in transaction, if no transaction it will throw IllegalTransactionStateException.\
> NAVER – the method should not be executed without transaction, If transaction exists it will throw IllegalTransactionStateException \
> NESTED – If the transaction existed it will created new child transaction.\
> Cascade. Invers\
> Select  max salary\
>
>
>  
