# Mirror Backend

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.0/gradle-plugin/reference/html/)



### Developer Guide

1. Download [PostMan](https://www.postman.com/downloads/)
    * This will be used to read responses that our program will generate
2. Clone Repo onto your machine [How To Clone a Git Repo](https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository)
3. Read through the [Spring QuickStart Guide](https://spring.io/quickstart)

From the mirror project navigate to: mirror>src>main>java>edu.mc3.cis.group.mirror
   * This package is where we will be putting all of our work
   
   There are four packages within this package:
   * configs
   * controllers
   * models
   * services
   
I have written an example for you to follow that will serve as a guide:

 ***Open the NewsController.java under the controllers package***
 
   * This is where our example starts and how we will be communicating from front end to back end
    
1. Run the application and open PostMan

2. Go to your workspace in PostMan and for the URL in your workspace enter: http://localhost:8080/news/hello
    * *** Make sure to do http NOT https or else you will get an error ***
    
3. Click Send
     * You should see at the bottom of the PostMan application you will have a response of "Hello, world"
     
#### Navigate back to NewsController.java ###

The URL's structure is localhost:8080/{controller}/{method}

A controller is what is used to communicate from the backend to the frontend. For the most part, we will be returning json.

The method is the method within the controller that will be called.

The NewController has two methods:
* public String getHello()
* public ExampleResult getResult()

I used both of these examples to show how to return a complex object type as well.

#### Annotations 

You will see within the NewsController.java file there are a couple of Annotations. These Annotations are from Spring.

* `@RestController` Annotation is the Annotation to indicate that this controller will be performing RESTful web services.

* `@RequestMapping` configures the mapping of web requests in this controller we used `@RequestMapping("news")`

* `@Autowired` allows us to make a single instance of an object and allows us to use it. This is dependency injection.

* `@GetMapping` is a shortcut annotation for 
    ```java 
        RequestMapping(method = 'RequestMethod.GET')
    ```

    1. getHello() method:
        * The GetMapping annotation holds two parameters:
            * path = "/hello" and produces = 'application/json'
                * path: extends the original RequestMapping,and makes the complete URL: http://localhost:8080/news/hello
                    * While the application is running you can run this url in postman or on your web browser
                * produces: the method will produce a json content type

    2. getResult() method:
        *  The GetMapping annotation holds two parameters:
           * path = "/multiple/{x}/{y}" extends the original RequestMapping and makes the complete URL: http://localhost:8080/news/multiply/{x}/{y}
                * While the application is running you can run this url in postman or on your web browser
                * x and y are able to be changed by the user. For example: http://localhost:8080/news/multiply/10/10 will return:
               ```json
                 {
                     "x": 10,
                     "y": 10,
                     "output": 100
                 }
                ```
           * produces = 'application/json" means the method will produce a json content type
           
The NewsController has a NewsService Object. Open the NewsService.java file to look at it.

#### The NewsService Class

The `@Service` annotation labels the class as an interface that stands alone in the model with no encapsulation.
It also has a NewService object with the reference variable of service with the variable config.

The NewsService class has two methods: 
1. getHello()
    * has a local variable helloWorld instantiated to the value "Hello, "
    * returns a concatenated string of helloWorld and config.getExampleName()
    
2. getResult()
    * returns an ExampleResult object. This is how we will return complex data types. 

Take a look at the ExampleResult class

#### The ExampleResult class

This should seem the most familiar. The ExampleResult class is an object that has an x,y, and an output variable that will be
set to a value once an ExampleResult object is created with the two-arg constructor.


#### The NewsConfig class


##### Annotations

* `@Configuration` is used to create a configuration of a component

* `@ConfigurationProperties` is used to set the properties of the configuration. In this example, we set the prefix of the
    configuration to "news".

They are static fields that are used to put things such as urls, apis, things that may live in the application.properties file

#### The application.properties file

To find the file it is under: mirror>src>main>resources

This is where you would set the value for the fields referenced to in config classes such as the NewsConfig class.
You will see that the one config property that we have is news.exampleName =World . This is where the NewsConfig file is 
getting the World value. 
           
### The folders:
1. The config folder will be here you will be setting your configurations. Examples of configurations would be:
    a url, an api key, anything that you may want to hide from a user
    
2. The controllers folder will hold the controllers that will be communicating from back to front.

3. The models folder will hold our POJOs 

4. The services folder will be where we will be writing our method that will be interacting with our models

           
     

